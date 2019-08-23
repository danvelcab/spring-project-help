package com.danvelcab.project.help.projecthelp.controller;

import com.danvelcab.project.help.projecthelp.domain.Project;
import com.danvelcab.project.help.projecthelp.form.ProjectForm;
import com.danvelcab.project.help.projecthelp.service.ProjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/projects")
public class ProjectController {

    @Autowired
    private ProjectService service;

    @GetMapping
    public Page<Project> list(Pageable pageable) {
        return this.service.list(pageable);
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
