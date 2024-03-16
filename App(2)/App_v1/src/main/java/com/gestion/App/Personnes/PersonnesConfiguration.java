package com.gestion.App.Personnes;

import com.gestion.App.Informations.InformationsRepository;
import org.springframework.context.annotation.Configuration;

@Configuration
public class PersonnesConfiguration {


	public PersonnesService PersonnesService(PersonnesRepository PersonnesRepository, InformationsRepository informationsRepository) {
		return new PersonnesService(PersonnesRepository,informationsRepository);
	}


	public PersonnesController PersonnessController(PersonnesService PersonnesService) {
		return new PersonnesController(PersonnesService);
	}
}

