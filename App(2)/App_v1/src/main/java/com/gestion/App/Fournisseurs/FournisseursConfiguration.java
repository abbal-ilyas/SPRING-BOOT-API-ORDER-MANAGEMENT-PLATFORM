package com.gestion.App.Fournisseurs;

import com.gestion.App.Personnes.PersonnesRepository;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class FournisseursConfiguration {

	@Bean
	public FournisseursService fournisseursService(FournisseursRepository fournisseursRepository, PersonnesRepository personnesRepository) {
		return new FournisseursService(fournisseursRepository, personnesRepository);
	}

	@Bean
	public FournisseursController fournisseursController(FournisseursService fournisseursService) {
		return new FournisseursController(fournisseursService);
	}
}

