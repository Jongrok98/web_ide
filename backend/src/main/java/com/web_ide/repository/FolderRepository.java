package com.web_ide.repository;

import com.web_ide.entity.Folder;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface FolderRepository extends JpaRepository<Folder, Long> {
}
