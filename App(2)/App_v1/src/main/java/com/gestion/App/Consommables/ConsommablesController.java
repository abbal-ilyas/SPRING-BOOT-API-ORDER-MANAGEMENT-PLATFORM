package com.gestion.App.Consommables;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/app/consommables")
public class ConsommablesController {

	private final ConsommablesService consommablesService;

	@Autowired
	public ConsommablesController(ConsommablesService consommablesService) {
		this.consommablesService = consommablesService;
	}

	@GetMapping
	public List<Consommables> getAllConsommables() {
		return consommablesService.getAllConsommables();
	}

	@GetMapping("/{id}")
	public Consommables getConsommablesById(@PathVariable Long id) {
		return consommablesService.getConsommableById(id);
	}

	@PostMapping
	public Consommables saveConsommables(@RequestBody Consommables consommables) {
		return consommablesService.saveConsommable(consommables);
	}

	@DeleteMapping("/{id}")
	public void deleteConsommables(@PathVariable Long id) {
		consommablesService.deleteConsommable(id);
	}
}

