package com.instituto.Controller;

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

import com.instituto.Repository.AlumnosRepository;
import com.instituto.modelo.Alumnos;



@RestController
@RequestMapping("/api")
public class AlumnosController {
	@Autowired
	private AlumnosRepository repository;
	
	
	
	@GetMapping("/usuarios")
	public List<Alumnos> allAlumnos(){
		return repository.findAll();
	}
	
	@GetMapping("/usuarios/{nombres}")
	public List<Alumnos> findByName(@PathVariable("nombres") String nombres) {
		return repository.findByNombres(nombres);
	}
	
	@PostMapping("/usuarios")
	public 	Alumnos createAlumnos(@RequestBody Alumnos alumnos) {
		return repository.save(alumnos);
	}
	
	@PutMapping("/usuarios/{id}")
	public Alumnos updateAlumnos(@PathVariable int id ,@RequestBody Alumnos alumnos) {
		return repository.save(alumnos);
	}
	
	@DeleteMapping("/usuarios/{id}")
	public void deleteAlumnos(@PathVariable("id") Long id) {
		repository.deleteById(id);
	}
}