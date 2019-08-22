package com.danvelcab.project.help.projecthelp.domain;

import com.danvelcab.project.help.projecthelp.enumeration.ProjectType;
import com.danvelcab.project.help.projecthelp.form.ProjectForm;

import javax.persistence.*;

@Entity
public class Project {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @Column(name = "name")
    private String name;

    @Column(name = "description")
    private String description;

    @Enumerated(EnumType.STRING)
    @Column(name = "type")
    private ProjectType type;

    public Project(){}
    public Project(ProjectForm newProjectForm){
        this.copyFromForm(newProjectForm);
    }
    public void copyFromForm(ProjectForm newProjectForm){
        this.setName(newProjectForm.getName());
        this.setDescription(newProjectForm.getDescription());
        this.setType(newProjectForm.getType());
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public ProjectType getType() {
        return type;
    }

    public void setType(ProjectType type) {
        this.type = type;
    }
}
