package com.danvelcab.project.help.projecthelp.repository;

import com.danvelcab.project.help.projecthelp.domain.Project;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.io.Serializable;

public interface IProject extends JpaRepository<Project, Serializable>, PagingAndSortingRepository<Project, Serializable> {

    public abstract Page<Project> findAll(Specification<Project> specification, Pageable pageable);
}
