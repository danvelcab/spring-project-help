package com.danvelcab.project.help.projecthelp.seed;


import com.danvelcab.project.help.projecthelp.domain.Project;
import com.danvelcab.project.help.projecthelp.enumeration.ProjectType;
import com.danvelcab.project.help.projecthelp.repository.IProject;

public class ProjectSeed {


    public void seedProjectTable(IProject repository) {
        for (int i = 0; i < 10; i++) {
            Project project = new Project();
            project.setName("Project " + i);
            project.setDescription("Description " + i);
            project.setType( i % 2 == 0 ? ProjectType.CR : ProjectType.MR);
            repository.save(project);
        }
    }
}
