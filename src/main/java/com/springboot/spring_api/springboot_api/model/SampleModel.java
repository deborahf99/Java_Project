package com.springboot.spring_api.springboot_api.model;

public record SampleModel(String id, String name) {
	/*public SampleModel {
		if(id == null) {
			throw new IllegalArgumentException("id cannot be null");
		}
	}
	
	public SampleModel(String id, String name) {
		this.id = id;
		this.name = name;
	}
	
	public String id() {
		return this.id;
	}
	
	public String name() {
		return this.name;
	}*/
}
