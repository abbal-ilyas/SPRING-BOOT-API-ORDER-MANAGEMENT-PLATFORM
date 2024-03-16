package com.gestion.App.Personnes;

import com.gestion.App.Informations.Informations;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/app/personnes")
public class PersonnesController {

	private final PersonnesService personneService;

	@Autowired
	public PersonnesController(PersonnesService personneService) {
		this.personneService = personneService;
	}

	@GetMapping
	public List<Personnes> getAllPersonnes() {
		return personneService.getAllPersonnes();
	}

	@GetMapping("/{id}")
	public Personnes getPersonneById(@PathVariable Long id) {
		return personneService.getPersonneById(id);
	}

	@PostMapping
	public Personnes savePersonne(@RequestBody Personnes personne) {
		return personneService.savePersonne(personne);
	}

	@PutMapping("/{id}/informations")
	public ResponseEntity<String> updatePersonne(@PathVariable Long id, @RequestBody Personnes personnes) {
		return personneService.updatePersonne(id, personnes);
	}

	@DeleteMapping("/{id}")
	public void deletePersonne(@PathVariable Long id) {
		personneService.deletePersonne(id);
	}
}

