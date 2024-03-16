package com.gestion.App.Budget;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BudgetConfiguration {

	@Bean
	public BudgetService budgetService(BudgetRepository budgetRepository) {
		return new BudgetService(budgetRepository);
	}

	@Bean
	public BudgetController budgetController(BudgetService budgetService) {
		return new BudgetController(budgetService);
	}
}

