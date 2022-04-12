package com.roberto.tareas.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.roberto.tareas.entity.Tarea;
import com.roberto.tareas.service.ITareasService;

@RestController
@RequestMapping("/api")
public class TareasController {
	@Autowired
	private ITareasService serviceTareas;
	
	@GetMapping("/tareas")
	public List<Tarea> buscarTodas(){
		return serviceTareas.buscarTodas();
	}
	
	@PostMapping("/tareas")
	public Tarea guardar(@RequestBody Tarea tarea) {
		serviceTareas.guardar(tarea);
		return tarea;
	}
	
	@PutMapping("/tareas")
	public Tarea actualizar(@RequestBody Tarea tarea) {
		serviceTareas.guardar(tarea);
		return tarea;
	}
	
	@DeleteMapping("/tareas/{id}")
	public String eliminar(@PathVariable("id") int idTareas) {
		serviceTareas.eliminar(idTareas);
		return "Tarea eliminada";
	}
}
