package com.gestion.App.Materiel;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MaterielService {
	private final MaterielRepository materielRepository;

	@Autowired
	public MaterielService(MaterielRepository materielRepository) {
		this.materielRepository = materielRepository;
	}

	public List<Materiel> getAllMateriel() {
		return materielRepository.findAll();
	}

	public Materiel saveMateriel(Materiel materiel) {
		return materielRepository.save(materiel);
	}

	public Materiel getMaterielById(Long id) {
		return materielRepository.findById(id).orElse(null);
	}

	public void deleteMateriel(Long id) {
		materielRepository.deleteById(id);
	}
}

