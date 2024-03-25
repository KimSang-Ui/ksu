package com.ksu.fileex.file;

import jakarta.persistence.*;

@Entity
public class FileEntitiy {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    private String name;
}
