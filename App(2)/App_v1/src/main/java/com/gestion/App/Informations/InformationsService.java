package com.gestion.App.Informations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class InformationsService {
	private final InformationsRepository informationsRepository;

	@Autowired
	public InformationsService(InformationsRepository informationsRepository) {
		this.informationsRepository = informationsRepository;
	}

	public List<Informations> getAllInformations() {
		return informationsRepository.findAll();
	}

	public Informations saveInformations(Informations informations) {
		return informationsRepository.save(informations);
	}

	public Informations getInformationsById(Long id) {
		return informationsRepository.findById(id).orElse(null);
	}

	public void deleteInformations(Long id) {
		informationsRepository.deleteById(id);
	}
}

