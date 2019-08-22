package com.danvelcab.project.help.projecthelp.repository;

import com.danvelcab.project.help.projecthelp.domain.Project;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IProject extends JpaRepository<Project, Integer> {
}
