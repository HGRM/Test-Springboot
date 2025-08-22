package com.test.demo.entities.dao;


import java.util.UUID;
import org.springframework.data.jpa.repository.JpaRepository;


public interface Formulario extends JpaRepository<Formulario, UUID> {
}