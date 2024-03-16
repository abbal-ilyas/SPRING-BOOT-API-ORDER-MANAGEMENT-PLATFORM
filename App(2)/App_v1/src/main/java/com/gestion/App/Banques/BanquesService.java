package com.gestion.App.Banques;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BanquesService {
	private final BanquesRepository banquesRepository;

	@Autowired
	public BanquesService(BanquesRepository banquesRepository) {
		this.banquesRepository = banquesRepository;
	}

	public List<Banques> getAllBanques() {
		return banquesRepository.findAll();
	}

	public Banques saveBanque(Banques banque) {
		return banquesRepository.save(banque);
	}

	public Banques getBanqueById(Long id) {
		return banquesRepository.findById(id).orElse(null);
	}

	public void deleteBanque(Long id) {
		banquesRepository.deleteById(id);
	}
}

