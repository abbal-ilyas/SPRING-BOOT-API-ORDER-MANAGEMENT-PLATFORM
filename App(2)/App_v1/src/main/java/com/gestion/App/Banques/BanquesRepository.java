package com.gestion.App.Banques;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BanquesRepository extends JpaRepository<Banques, Long> {
	// Add custom query methods if needed
}

