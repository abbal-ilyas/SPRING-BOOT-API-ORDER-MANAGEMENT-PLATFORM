package com.gestion.App.Materiel;

import org.springframework.context.annotation.Configuration;

@Configuration
public class MaterielConfiguration {


	public MaterielService materielService(MaterielRepository materielRepository) {
		return new MaterielService(materielRepository);
	}


	public MaterielController materielController(MaterielService materielService) {
		return new MaterielController(materielService);
	}
}

