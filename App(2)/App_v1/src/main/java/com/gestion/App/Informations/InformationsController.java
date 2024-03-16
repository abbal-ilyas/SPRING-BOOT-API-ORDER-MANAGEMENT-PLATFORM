package com.gestion.App.Informations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/app/informations")
public class InformationsController {

	private final InformationsService informationsService;

	@Autowired
	public InformationsController(InformationsService informationsService) {
		this.informationsService = informationsService;
	}

	@GetMapping
	public List<Informations> getAllInformations() {
		return informationsService.getAllInformations();
	}

	@GetMapping("/{id}")
	public Informations getInformationsById(@PathVariable Long id) {
		return informationsService.getInformationsById(id);
	}

	@PostMapping
	public Informations saveInformations(@RequestBody Informations informations) {
		return informationsService.saveInformations(informations);
	}

	@DeleteMapping("/{id}")
	public void deleteInformations(@PathVariable Long id) {
		informationsService.deleteInformations(id);
	}
}

