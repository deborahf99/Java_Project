package com.springboot.spring_api.springboot_api.repository;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import org.springframework.stereotype.Component;

import com.springboot.spring_api.springboot_api.model.SampleModel;

@Component
public class SampleRepository {
	List<SampleModel> sample = new ArrayList<>();
	
	public SampleRepository() {
		sample.add(new SampleModel(
				UUID.randomUUID().toString(),
				"Sample Model"
				));
	}
	
	public List<SampleModel> findAll(){
		return sample;
	}
	
	public SampleModel findById(String id){
		return sample.stream().filter(sampleModel -> sampleModel.id().equals(id)).findFirst().orElse(null);
	}
	
	public SampleModel create(SampleModel sampleMod) {
		sample.add(sampleMod);
		return sampleMod;
	}
	
	public void update(SampleModel sampleModel, String id) {
		SampleModel existing = sample.stream().filter(s -> s.id().equals(id))
				.findFirst()
				.orElseThrow(() -> new IllegalArgumentException("Sample not found"));
		
		int i = sample.indexOf(existing);
		sample.set(i, sampleModel);
	}
	
	public void delete(String id) {
		sample.removeIf(sampleModel -> sampleModel.id().equals(id));
	}
}
