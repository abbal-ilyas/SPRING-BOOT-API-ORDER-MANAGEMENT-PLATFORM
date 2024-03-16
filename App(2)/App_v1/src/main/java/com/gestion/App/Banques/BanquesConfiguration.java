package com.gestion.App.Banques;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BanquesConfiguration {

	@Bean
	public BanquesService banquesService(BanquesRepository banquesRepository) {
		return new BanquesService(banquesRepository);
	}

	@Bean
	public BanquesController banquesController(BanquesService banquesService) {
		return new BanquesController(banquesService);
	}
}

