package com.roberto.tareas.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.roberto.tareas.entity.Tarea;

public interface TareasRepository extends JpaRepository<Tarea, Integer> {

}
