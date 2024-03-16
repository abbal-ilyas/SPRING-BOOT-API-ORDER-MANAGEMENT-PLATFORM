package com.gestion.App.Fournisseurs;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/app/fournisseurs")
public class FournisseursController {

	private final FournisseursService fournisseursService;

	@Autowired
	public FournisseursController(FournisseursService fournisseursService) {
		this.fournisseursService = fournisseursService;
	}

	@GetMapping
	public List<Fournisseurs> getAllFournisseurs() {
		return fournisseursService.getAllFournisseurs();
	}

	@GetMapping("/{id}")
	public Fournisseurs getFournisseursById(@PathVariable Long id) {
		return fournisseursService.getFournisseurById(id);
	}

	@PostMapping
	public Fournisseurs saveFournisseurs(@RequestBody Fournisseurs fournisseurs) {
		return fournisseursService.saveFournisseur(fournisseurs);
	}
	@PutMapping("/{id}")
	public ResponseEntity<String> updatePersonne(@PathVariable Long id, @RequestBody Fournisseurs fournisseurs) {
		return fournisseursService.updateFournisseur(id,fournisseurs);

	}

	@DeleteMapping("/{id}")
	public void deleteFournisseurs(@PathVariable Long id) {
		fournisseursService.deleteFournisseur(id);
	}


}

