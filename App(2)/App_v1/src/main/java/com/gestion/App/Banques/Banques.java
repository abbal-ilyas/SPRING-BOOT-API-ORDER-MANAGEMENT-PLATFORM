package com.gestion.App.Banques;

import lombok.*;

import jakarta.persistence.*;

@Data
@Entity
@Table(name = "banques")
public class Banques {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID_Banque")
	private Long idBanque;

	@Column(name = "Nom_Banque")
	private String nomBanque;
}

