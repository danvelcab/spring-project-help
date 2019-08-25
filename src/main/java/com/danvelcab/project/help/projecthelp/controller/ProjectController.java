package com.danvelcab.project.help.projecthelp.controller;

import com.danvelcab.project.help.projecthelp.domain.Project;
import com.danvelcab.project.help.projecthelp.form.ProjectForm;
import com.danvelcab.project.help.projecthelp.service.ProjectService;
import net.kaczmarzyk.spring.data.jpa.domain.Equal;
import net.kaczmarzyk.spring.data.jpa.domain.Like;
import net.kaczmarzyk.spring.data.jpa.web.annotation.And;
import net.kaczmarzyk.spring.data.jpa.web.annotation.Conjunction;
import net.kaczmarzyk.spring.data.jpa.web.annotation.Or;
import net.kaczmarzyk.spring.data.jpa.web.annotation.Spec;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("/projects")
public class ProjectController {

    @Autowired
    private ProjectService service;

    @GetMapping
    public Page<Project> list(
            @Conjunction({
                    @Or({
                            @Spec(path = "name", params = "search", spec = Like.class),
                            @Spec(path = "description", params = "search", spec = Like.class)}),
                    @Or({
                            @Spec(path = "type", params = "type", spec = Equal.class)
                    }),
            }) Specification<Project> specification, Pageable pageable) {
        return this.service.list(specification, pageable);
    }

    @PostMapping
    Project store(@Valid @RequestBody ProjectForm newProject) {
        return service.save(newProject);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.PUT)
    Project update(@PathVariable("id") Integer id, @Valid @RequestBody ProjectForm newProject) {
        return service.update(id, newProject);
    }
    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    Integer update(@PathVariable("id") Integer id) {
        return service.delete(id);
    }
}
