package com.gestion.App.Materiel;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/app/materiels")
public class MaterielController {

	private final MaterielService materielService;

	@Autowired
	public MaterielController(MaterielService materielService) {
		this.materielService = materielService;
	}

	@GetMapping
	public List<Materiel> getAllMateriels() {
		return materielService.getAllMateriel();
	}

	@GetMapping("/{id}")
	public Materiel getMaterielById(@PathVariable Long id) {
		return materielService.getMaterielById(id);
	}

	@PostMapping
	public Materiel saveMateriel(@RequestBody Materiel materiel) {
		return materielService.saveMateriel(materiel);
	}

	@DeleteMapping("/{id}")
	public void deleteMateriel(@PathVariable Long id) {
		materielService.deleteMateriel(id);
	}
}

