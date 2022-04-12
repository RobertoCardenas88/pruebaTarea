package com.roberto.tareas.service;

import java.util.List;

import com.roberto.tareas.entity.Tarea;

public interface ITareasService {
	List<Tarea> buscarTodas();
	void guardar(Tarea tarea);
	void eliminar(int idTarea);
}
