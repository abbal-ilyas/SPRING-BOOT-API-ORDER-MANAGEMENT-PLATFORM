package com.gestion.App.Fournisseurs;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FournisseursRepository extends JpaRepository<Fournisseurs, Long> {


	// Add custom query methods if needed
}

