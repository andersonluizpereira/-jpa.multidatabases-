package com.examplo.jpa.multidatabases.domain.mysql;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "category")
@Data
public class CategoryEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column
    private String name;

    @Column
    private String description;

}
