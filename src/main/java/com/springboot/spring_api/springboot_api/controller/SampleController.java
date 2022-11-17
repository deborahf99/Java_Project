package com.springboot.spring_api.springboot_api.controller;

import java.util.List;

import com.springboot.spring_api.springboot_api.model.SampleModel;
import com.springboot.spring_api.springboot_api.repository.SampleRepository;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/sample")
public class SampleController {
	private final SampleRepository repository;
	
	//constructor injection
	public SampleController(SampleRepository repository) {
		this.repository = repository;
	}
	
	//GET, https://localhost:8080/sample
	@GetMapping
	public List<SampleModel> findAll(){
		return repository.findAll();
	}
	
	//GET, https://localhost:8080/sample/id here
	@GetMapping("/{id}")
	public SampleModel findById(@PathVariable String id) {
		return repository.findById(id);
	}
	
	//POST, https://localhost:8080/sample
	@PostMapping(consumes = {"*/*"})
	public SampleModel create(@RequestBody SampleModel sample) {
		return repository.create(sample);
	}
	
	//PUT, https://localhost:8080/sample/id here
	@PutMapping("/{id}")
	public void update(@RequestBody SampleModel sample, @PathVariable String id) {
		repository.update(sample, id);
	}
	
	@DeleteMapping("/{id}")
	public void delete(@PathVariable String id) {
		repository.delete(id);
	}
}
