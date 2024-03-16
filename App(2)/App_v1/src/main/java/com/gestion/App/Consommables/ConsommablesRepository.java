package com.gestion.App.Consommables;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ConsommablesRepository extends JpaRepository<Consommables, Long> {
	// Ajoutez des méthodes personnalisées si nécessaire
}

