package com.web_ide.repository;

import com.web_ide.entity.Project;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface ProjectRepository extends JpaRepository<Project , UUID> {
}
