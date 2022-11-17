package com.springboot.spring_api.springboot_api.model;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.util.UUID;

import org.junit.jupiter.api.Test;

public class SampleTest {
	@Test
	void sampleTest() {
		SampleModel sample = new SampleModel();
		
		sample.setId(UUID.randomUUID().toString());
		sample.setName("Sample name");
		
		assertNotNull(sample);
		assertEquals("Sample name", sample.getName());
	}
}
