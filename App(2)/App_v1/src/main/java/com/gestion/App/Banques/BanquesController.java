package com.gestion.App.Banques;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/app/banques")
public class BanquesController {

	private final BanquesService banquesService;

	@Autowired
	public BanquesController(BanquesService banquesService) {
		this.banquesService = banquesService;
	}

	@GetMapping
	public List<Banques> getAllBanques() {
		return banquesService.getAllBanques();
	}

	@GetMapping("/{id}")
	public Banques getBanquesById(@PathVariable Long id) {
		return banquesService.getBanqueById(id);
	}

	@PostMapping
	public Banques saveBanques(@RequestBody Banques banques) {
		return banquesService.saveBanque(banques);
	}

	@DeleteMapping("/{id}")
	public void deleteBanques(@PathVariable Long id) {
		banquesService.deleteBanque(id);
	}
}
