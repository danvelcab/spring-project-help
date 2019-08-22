package com.danvelcab.project.help.projecthelp.service;

import com.danvelcab.project.help.projecthelp.domain.Project;
import com.danvelcab.project.help.projecthelp.form.ProjectForm;
import com.danvelcab.project.help.projecthelp.repository.IProject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProjectService {
    @Autowired
    private IProject repository;

    public List<Project> list() {
        return this.repository.findAll();
    }

    public Project save(ProjectForm newProjectForm) {
        Project project = new Project(newProjectForm);
        return this.repository.save(project);
    }
    public Project update(Integer id, ProjectForm newProjectForm) {
        Project project = this.repository.getOne(id);
        project.copyFromForm(newProjectForm);
        return this.repository.save(project);
    }
    public Integer delete(Integer id) {
        Project project = this.repository.getOne(id);
        this.repository.delete(project);
        return id;
    }
}
