package com.web_ide.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;

import java.time.LocalDateTime;
import java.util.UUID;

@Entity
@Getter
@Setter
@NoArgsConstructor
@Table(name = "folders")
public class Folder {

    @GeneratedValue(strategy = GenerationType.UUID)
    @Id
    @Column(columnDefinition = "CHAR(36)")
    private UUID uuid;

    @Column(nullable = false, length = 64)
    private String name;

    @ManyToOne
    @JoinColumn(name = "project_id",nullable = false)
    private Project project;

    @ManyToOne
    @JoinColumn(name = "parent_id")
    private Folder parent;

    @Column(name = "relative_path", columnDefinition = "TEXT")
    private String relativePath;

    @CreationTimestamp
    @Column(name = "created_at",nullable = false)
    private LocalDateTime createdAt;

    @CreationTimestamp
    @Column(name = "updated_at",nullable = false)
    private LocalDateTime updatedAt;

}
