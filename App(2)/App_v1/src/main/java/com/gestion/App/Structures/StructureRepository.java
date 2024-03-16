package com.gestion.App.Structures;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StructureRepository extends JpaRepository<Structures, Long> {
	// Ajoutez des méthodes personnalisées si nécessaire
}

