package com.gestion.App.Structures;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StructuresService {
	private final StructureRepository structureRepository;


@Autowired
	public StructuresService(StructureRepository structureRepository) {
		this.structureRepository = structureRepository;
	}

	public List<Structures> getAllStructures() {
		return structureRepository.findAll();
	}

	public Structures saveStructure(Structures structure) {
		return structureRepository.save(structure);
	}

	public Structures getStructureById(Long id) {
		return structureRepository.findById(id).orElse(null);
	}

	public void deleteStructure(Long id) {
		structureRepository.deleteById(id);
	}
}

