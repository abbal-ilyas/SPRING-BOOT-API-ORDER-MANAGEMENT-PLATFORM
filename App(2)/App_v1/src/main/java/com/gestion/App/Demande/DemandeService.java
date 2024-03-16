package com.gestion.App.Demande;

import java.util.List;

public interface DemandeService {

	List<Demande> getAllDemandes();

	Demande getDemandeById(Long id);

	Demande createDemande(Demande demande);

	Demande updateDemande(Long id, Demande updatedDemande);

	void deleteDemande(Long id);

}
