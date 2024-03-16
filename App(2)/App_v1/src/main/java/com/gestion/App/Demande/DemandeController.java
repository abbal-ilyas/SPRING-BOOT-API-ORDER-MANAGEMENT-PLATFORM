package com.gestion.App.Demande;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/app/demandes")
public class DemandeController {

	private final DemandeService demandeService;

	@Autowired
	public DemandeController(DemandeService demandeService) {
		this.demandeService = demandeService;
	}

	@GetMapping
	public List<Demande> getAllDemandes() {
		return demandeService.getAllDemandes();
	}

	@GetMapping("/{id}")
	public Demande getDemandeById(@PathVariable Long id) {
		return demandeService.getDemandeById(id);
	}

	@PostMapping
	public Demande createDemande(@RequestBody Demande demande) {
		return demandeService.createDemande(demande);
	}

	@PutMapping("/{id}")
	public Demande updateDemande(@PathVariable Long id, @RequestBody Demande updatedDemande) {
		return demandeService.updateDemande(id, updatedDemande);
	}

	@DeleteMapping("/{id}")
	public void deleteDemande(@PathVariable Long id) {
		demandeService.deleteDemande(id);
	}
}

