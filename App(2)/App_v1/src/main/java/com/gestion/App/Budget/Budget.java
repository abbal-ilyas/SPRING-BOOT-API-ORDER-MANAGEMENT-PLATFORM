package com.gestion.App.Budget;

import jakarta.persistence.*;
import lombok.Data;

import java.math.BigDecimal;

@Data
@Entity
@Table(name = "budget")
public class Budget {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID_Budget")
	private Integer idBudget;

	@Column(name = "Annee_Budgetaire")
	private int anneeBudgetaire;

	@Column(name = "montant_alloue")
	private BigDecimal montantAlloue;

	@Column(name = "montant_consomme")
	private BigDecimal montantConsomme;

	@Column(name = "montant_restant")
	private BigDecimal montantRestant  ;
	// Méthode pour recalculer Montant_Restant après des modifications

}

