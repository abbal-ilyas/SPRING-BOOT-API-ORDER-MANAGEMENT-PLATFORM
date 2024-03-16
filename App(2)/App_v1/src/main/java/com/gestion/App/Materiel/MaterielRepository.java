package com.gestion.App.Materiel;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MaterielRepository extends JpaRepository<Materiel, Long> {
	// Ajoutez des méthodes personnalisées si nécessaire
}

