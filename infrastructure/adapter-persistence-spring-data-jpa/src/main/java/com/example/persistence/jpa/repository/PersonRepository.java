package com.example.persistence.jpa.repository;

import com.example.persistence.jpa.entity.PersonEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonRepository extends JpaRepository<PersonEntity, Long> {
}
