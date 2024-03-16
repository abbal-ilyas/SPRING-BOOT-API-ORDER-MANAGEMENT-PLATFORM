package com.gestion.App.Rubriques;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.math.BigDecimal;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/app/rubriques")
public class RubriquesController {

	@Autowired
	private RubriquesService rubriquesService;

	@GetMapping
	public List<Rubriques> getAllRubriques() {
		return rubriquesService.getAllRubriques();
	}

	@GetMapping("/{code}")
	public Optional<Rubriques> getRubriquesByCode(@PathVariable String code) {
		return rubriquesService.getRubriquesByCode(code);
	}

	@PostMapping
	public Rubriques addRubriques(@RequestBody Rubriques rubriques) {
		return rubriquesService.addRubriques(rubriques);
	}

	@PutMapping("/{code}")
	public Rubriques updateRubriques(@PathVariable String code, @RequestBody Rubriques updatedRubriques) {
		return rubriquesService.updateRubriques(code, updatedRubriques);
	}
	@PutMapping("/{code}/updateMontantConsomme")
	public ResponseEntity<Rubriques> updateMontantConsomme(
			@PathVariable Long code,
			@RequestParam BigDecimal montantConsomme) {
		Rubriques rubriques = rubriquesService.updateMontantConsomme(code ,montantConsomme);


		if (rubriques != null) {
			return new ResponseEntity<>(rubriques, HttpStatus.OK);
		} else {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
	}
	@DeleteMapping("/{code}")
	public boolean deleteRubriques(@PathVariable String code) {
		return rubriquesService.deleteRubriques(code);
	}
}
