package com.gestion.App.Rubriques;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RubriquesRepository extends JpaRepository<Rubriques, String> {
	// Ajoutez des méthodes spécifiques de requête si nécessaire
}
