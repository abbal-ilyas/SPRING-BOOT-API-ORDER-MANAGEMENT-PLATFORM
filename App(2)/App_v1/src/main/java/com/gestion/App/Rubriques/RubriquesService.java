package com.gestion.App.Rubriques;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.List;
import java.util.Optional;

@Service
public class RubriquesService {


	private final RubriquesRepository rubriquesRepository;
@Autowired
	public RubriquesService(RubriquesRepository rubriquesRepository) {
		this.rubriquesRepository = rubriquesRepository;
	}

	public List<Rubriques> getAllRubriques() {
		return rubriquesRepository.findAll();
	}

	public Optional<Rubriques> getRubriquesByCode(String code) {
		return rubriquesRepository.findById(code);
	}

	public Rubriques addRubriques(Rubriques rubriques) {
		return rubriquesRepository.save(rubriques);
	}

	public Rubriques updateRubriques(String code, Rubriques updatedRubriques) {
		if (rubriquesRepository.existsById(code)) {
			updatedRubriques.setCode(Long.valueOf(code));
			return rubriquesRepository.save(updatedRubriques);
		}
		return null; // Gérer le cas où la rubrique n'existe pas
	}
	public Rubriques updateMontantConsomme(Long code, BigDecimal montantConsomme) {
		Rubriques rubriques = rubriquesRepository.findById(String.valueOf(code)).orElse(null);

		if (rubriques != null) {
			rubriques.setMontantConsomme(montantConsomme);
			// Mettez à jour le montant restant ici
			BigDecimal montantRestant = rubriques.getMontantAlloue().subtract(montantConsomme);
			rubriques.setMontantRestant(montantRestant);

			return rubriquesRepository.save(rubriques);
		}

		return null;
	}
	public boolean deleteRubriques(String code) {
		if (rubriquesRepository.existsById(code)) {
			rubriquesRepository.deleteById(code);
			return true;
		}
		return false; // Gérer le cas où la rubrique n'existe pas
	}
}
