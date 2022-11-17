package com.springboot.spring_api.springboot_api.controller;

import java.util.List;

import com.springboot.spring_api.springboot_api.model.SampleModel;
import com.springboot.spring_api.springboot_api.repository.SampleRepository;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/sample")
public class SampleController {
	private final SampleRepository repository;
	
	public SampleController(SampleRepository repository) {
		this.repository = repository;
	}
	
	//GET https://localhost:8080/sample
	@GetMapping
	public List<SampleModel> findAll(){
		return repository.findAll();
	}
}
