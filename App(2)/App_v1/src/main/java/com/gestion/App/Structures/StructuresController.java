package com.gestion.App.Structures;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/app/structures")
public class StructuresController {

	private final StructuresService StructuresService;

	@Autowired
	public StructuresController(StructuresService StructuresService) {
		this.StructuresService = StructuresService;
	}

	@GetMapping
	public List<Structures> getAllStructures() {
		return StructuresService.getAllStructures();
	}

	@GetMapping("/{id}")
	public Structures getStructureById(@PathVariable Long id) {
		return StructuresService.getStructureById(id);
	}

	@PostMapping
	public Structures saveStructure(@RequestBody Structures structure) {
		return StructuresService.saveStructure(structure);
	}

	@DeleteMapping("/{id}")
	public void deleteStructure(@PathVariable Long id) {
		StructuresService.deleteStructure(id);
	}
}

