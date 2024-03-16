package com.gestion.App.Personnes;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonnesRepository extends JpaRepository<Personnes, Long> {
	// Ajoutez des méthodes personnalisées si nécessaire
}

