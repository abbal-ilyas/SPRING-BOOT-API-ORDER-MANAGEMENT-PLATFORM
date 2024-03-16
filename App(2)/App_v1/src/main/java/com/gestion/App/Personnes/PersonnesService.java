package com.gestion.App.Personnes;

import com.gestion.App.Informations.Informations;
import com.gestion.App.Informations.InformationsRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Transactional

public class PersonnesService {
	private final PersonnesRepository personneRepository;

	private final InformationsRepository informationsRepository;

	@Autowired
	public PersonnesService(PersonnesRepository personneRepository, InformationsRepository informationsRepository) {
		this.personneRepository = personneRepository;
		this.informationsRepository = informationsRepository;
	}



	public List<Personnes> getAllPersonnes() {
		return personneRepository.findAll();
	}

	public Personnes savePersonne(Personnes personne) {
		Informations info = personne.getInformations();
		if (info != null && info.getIdInformations() == null) {
			informationsRepository.save(info);
		}
		return personneRepository.save(personne);
	}

	public Personnes getPersonneById(Long id) {
		return personneRepository.findById(id).orElse(null);
	}

	public void deletePersonne(Long id) {
		personneRepository.deleteById(id);
	}

	public ResponseEntity<String> updatePersonne(Long id,Personnes personne ) {
		
		// Vérifier si la personne existe
		if ( personneRepository.existsById(id)) {
				// Récupérer la personne existante
			Personnes personne1 = personneRepository.getReferenceById(id);

			if (personne.getInformations() != null) {
           personne.setIdPersonne(id);
		   personne.getInformations().setIdInformations(personne1.getInformations().getIdInformations());
			// Save Personne
			personne1 = personne;
			personneRepository.save(personne1);


				return new ResponseEntity<>(" mises à jour avec succès", HttpStatus.OK);
			}else {
				return new ResponseEntity<>("Aucune Informations trouvée ", HttpStatus.OK);
			}
		}else {
			return new ResponseEntity<>("Personne non trouvée", HttpStatus.NOT_FOUND);
		}

	}

}


