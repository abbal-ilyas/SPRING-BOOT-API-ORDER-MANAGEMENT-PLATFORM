package com.gestion.App.Budget;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.List;

@Service
public class BudgetService {
	private final BudgetRepository budgetRepository;

	@Autowired
	public BudgetService(BudgetRepository budgetRepository) {
		this.budgetRepository = budgetRepository;
	}

	public List<Budget> getAllBudgets() {
		return budgetRepository.findAll();
	}

	public Budget saveBudget(Budget budget) {
		return budgetRepository.save(budget);
	}

	public Budget getBudgetById(Long id) {
		return budgetRepository.findById(id).orElse(null);
	}

	public void deleteBudget(Long id) {
		budgetRepository.deleteById(id);
	}


	public Budget updateMontantConsomme(Long budgetId, BigDecimal montantConsomme) {
		Budget budget = budgetRepository.findById(budgetId).orElse(null);

		if (budget != null) {
			budget.setMontantConsomme(montantConsomme);
			// Mettez à jour le montant restant ici
			BigDecimal montantRestant = budget.getMontantAlloue().subtract(montantConsomme);
			budget.setMontantRestant(montantRestant);

			return budgetRepository.save(budget);
		}

		return null;
	}
	}