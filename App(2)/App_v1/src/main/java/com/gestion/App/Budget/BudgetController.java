package com.gestion.App.Budget;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.math.BigDecimal;
import java.util.List;

@RestController
@RequestMapping("/app/budgets")
public class BudgetController {

	private final BudgetService budgetService;

	@Autowired
	public BudgetController(BudgetService budgetService) {
		this.budgetService = budgetService;
	}

	@GetMapping
	public List<Budget> getAllBudgets() {
		return budgetService.getAllBudgets();
	}

	@GetMapping("/{id}")
	public Budget getBudgetById(@PathVariable Long id) {
		return budgetService.getBudgetById(id);
	}

	@PostMapping
	public Budget saveBudget(@RequestBody Budget budget) {
		return budgetService.saveBudget(budget);
	}

	@DeleteMapping("/{id}")
	public void deleteBudget(@PathVariable Long id) {
		budgetService.deleteBudget(id);
	}


	@PutMapping("/{budgetId}/updateMontantConsomme")
	public ResponseEntity<Budget> updateMontantConsomme(
			@PathVariable Long budgetId,
			@RequestParam BigDecimal montantConsomme) {
		Budget updatedBudget = budgetService.updateMontantConsomme(budgetId ,montantConsomme);

		if (updatedBudget != null) {
			return new ResponseEntity<>(updatedBudget, HttpStatus.OK);
		} else {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
	}
}

