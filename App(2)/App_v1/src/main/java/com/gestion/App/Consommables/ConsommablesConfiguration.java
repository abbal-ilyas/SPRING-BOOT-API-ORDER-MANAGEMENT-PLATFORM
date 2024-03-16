package com.gestion.App.Consommables;

import org.springframework.context.annotation.Configuration;

@Configuration
public class ConsommablesConfiguration {


	public ConsommablesService consommablesService(ConsommablesRepository consommablesRepository) {
		return new ConsommablesService(consommablesRepository);
	}


	public ConsommablesController consommablesController(ConsommablesService consommablesService) {
		return new ConsommablesController(consommablesService);
	}
}

