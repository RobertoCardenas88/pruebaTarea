package com.roberto.tareas.jpa;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.roberto.tareas.entity.Tarea;
import com.roberto.tareas.repository.TareasRepository;
import com.roberto.tareas.service.ITareasService;

@Service
public class TareasService implements ITareasService{

	
	@Autowired
	private TareasRepository repoTareas;
	
	@Override
	public void guardar(Tarea tarea) {
		repoTareas.save(tarea);
	}
	
	@Override
	public void eliminar(int idTarea) {
		repoTareas.deleteById(idTarea);
	}

	@Override
	public List<Tarea> buscarTodas() {
		return repoTareas.findAll();
	}
}
