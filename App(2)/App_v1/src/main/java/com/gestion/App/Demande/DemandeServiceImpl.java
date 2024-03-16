package com.gestion.App.Demande;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DemandeServiceImpl implements DemandeService {

	private final DemandeRepository demandeRepository;

	@Autowired
	public DemandeServiceImpl(DemandeRepository demandeRepository) {
		this.demandeRepository = demandeRepository;
	}

	@Override
	public List<Demande> getAllDemandes() {
		return demandeRepository.findAll();
	}

	@Override
	public Demande getDemandeById(Long id) {
		return demandeRepository.findById(id).orElse(null);
	}

	@Override
	public Demande createDemande(Demande demande) {
		return demandeRepository.save(demande);
	}

	@Override
	public Demande updateDemande(Long id, Demande updatedDemande) {
		if (demandeRepository.existsById(id)) {
			updatedDemande.setIdDemande(id);
			return demandeRepository.save(updatedDemande);
		}
		return null;
	}

	@Override
	public void deleteDemande(Long id) {
		demandeRepository.deleteById(id);
	}



}
