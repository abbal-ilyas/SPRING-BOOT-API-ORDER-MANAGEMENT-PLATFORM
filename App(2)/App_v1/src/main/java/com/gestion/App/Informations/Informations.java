package com.gestion.App.Informations;

import lombok.*;

import jakarta.persistence.*;

@Data
@Entity
@Table(name = "informations")
public class Informations {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID_Informations")
	private Long idInformations;

	@Column(name = "Nom")
	private String nom;

	@Column(name = "Prenom")
	private String prenom;

	@Column(name = "Email")
	private String email;

	@Column(name = "Adresse")
	private String adresse;

	@Column(name = "Ville")
	private String ville;

	@Column(name = "Code_postal")
	private String codePostal;

	@Column(name = "Telephone")
	private String telephone;

	@Column(name = "Fax")
	private String fax;
}
