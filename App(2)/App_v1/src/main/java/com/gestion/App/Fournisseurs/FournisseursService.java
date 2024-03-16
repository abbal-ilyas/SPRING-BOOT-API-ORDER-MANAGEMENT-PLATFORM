package com.gestion.App.Fournisseurs;

import com.gestion.App.Personnes.PersonnesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FournisseursService {
	private final FournisseursRepository fournisseursRepository;
		private final PersonnesRepository personnesRepository;


	@Autowired
	public FournisseursService(FournisseursRepository fournisseursRepository, PersonnesRepository personnesRepository) {
		this.fournisseursRepository = fournisseursRepository;
		this.personnesRepository =  personnesRepository;
	}

	public List<Fournisseurs> getAllFournisseurs() {
		return fournisseursRepository.findAll();
	}

	public Fournisseurs saveFournisseur(Fournisseurs fournisseur) {
		return fournisseursRepository.save(fournisseur);
	}

	public Fournisseurs getFournisseurById(Long id) {
		return fournisseursRepository.findById(id).orElse(null);
	}

	public void deleteFournisseur(Long id) {
		fournisseursRepository.deleteById(id);
	}
	public ResponseEntity<String> updateFournisseur(Long id, Fournisseurs fournisseurs ) {

		// Vérifier si la personne existe
		if ( fournisseursRepository.existsById(id)) {
			// Récupérer la personne existante
			Fournisseurs fournisseurs1 = fournisseursRepository.getReferenceById(id);

			if (fournisseurs.getResponsable() != null) {
					fournisseurs.setIdFournisseur(id);
				fournisseurs1.setResponsable(fournisseurs.getResponsable());
                fournisseurs1=fournisseurs;
				personnesRepository.save(fournisseurs1.getResponsable());
				fournisseursRepository.save(fournisseurs1);


				return new ResponseEntity<>(" mises à jour avec succès", HttpStatus.OK);
			}else {
				return new ResponseEntity<>("Aucune Informations trouvée ", HttpStatus.OK);
			}
		}else {
			return new ResponseEntity<>("Fournisseur non trouvée", HttpStatus.NOT_FOUND);
		}

	}


}

