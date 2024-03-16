package com.gestion.App.Rubriques;

import lombok.Data;

import jakarta.persistence.*;

import java.math.BigDecimal;

@Data
@Entity
@Table(name = "rubriques")
public class Rubriques {

	@Id
	@Column(name = "Code")
	private Long code;

	@Column(name = "Designation")
	private String designation;

	@Column(name = "montant_alloue")
	private BigDecimal montantAlloue;

	@Column(name = "montant_consomme")
	private BigDecimal montantConsomme;

	@Column(name = "montant_restant")
	private BigDecimal montantRestant;
	// Ajoutez d'autres champs et méthodes si nécessaire

}
