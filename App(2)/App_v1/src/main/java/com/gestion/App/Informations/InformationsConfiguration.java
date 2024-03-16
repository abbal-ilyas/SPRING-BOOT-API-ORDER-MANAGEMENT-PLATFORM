package com.gestion.App.Informations;

import org.springframework.context.annotation.Configuration;

@Configuration
public class InformationsConfiguration {


	public InformationsService informationsService(InformationsRepository informationsRepository) {
		return new InformationsService(informationsRepository);
	}


	public InformationsController informationsController(InformationsService informationsService) {
		return new InformationsController(informationsService);
	}
}

