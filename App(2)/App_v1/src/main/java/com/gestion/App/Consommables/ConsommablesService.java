package com.gestion.App.Consommables;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ConsommablesService {
	private final ConsommablesRepository consommablesRepository;

	@Autowired
	public ConsommablesService(ConsommablesRepository consommablesRepository) {
		this.consommablesRepository = consommablesRepository;
	}

	public List<Consommables> getAllConsommables() {
		return consommablesRepository.findAll();
	}

	public Consommables saveConsommable(Consommables consommable) {
		return consommablesRepository.save(consommable);
	}

	public Consommables getConsommableById(Long id) {
		return consommablesRepository.findById(id).orElse(null);
	}

	public void deleteConsommable(Long id) {
		consommablesRepository.deleteById(id);
	}
}

