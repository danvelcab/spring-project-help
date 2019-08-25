package com.danvelcab.project.help.projecthelp.form;

import com.danvelcab.project.help.projecthelp.enumeration.ProjectType;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

public class ProjectForm {

    @NotNull
    @Column(name = "name")
    private String name;

    @NotNull
    @Column(name = "description")
    private String description;

    @NotNull
    @Enumerated(EnumType.STRING)
    @Column(name = "type")
    private ProjectType type;

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
