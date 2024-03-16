package com.gestion.App.Informations;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface InformationsRepository extends JpaRepository<Informations, Long> {
	// Add custom query methods if needed
}

