package com.gestion.App.Structures;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class StructuresConfiguration {

	@Bean
	public StructuresService StructuresService(StructureRepository StructureRepository) {
		return new StructuresService(StructureRepository);
	}

	@Bean
	public StructuresController structuresController(StructuresService StructuresService) {
		return new StructuresController(StructuresService);
	}
}

