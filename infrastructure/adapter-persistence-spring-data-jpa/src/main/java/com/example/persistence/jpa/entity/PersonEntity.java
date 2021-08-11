package com.example.persistence.jpa.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "persons")
@Data
public class PersonEntity {
    @Id
    @GeneratedValue
    private Long id;

    private String name;
}
