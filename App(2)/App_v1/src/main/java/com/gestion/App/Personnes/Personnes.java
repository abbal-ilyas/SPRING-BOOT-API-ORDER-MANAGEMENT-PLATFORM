package com.gestion.App.Personnes;

import com.gestion.App.Banques.Banques;
import com.gestion.App.Informations.Informations;
import lombok.*;

import jakarta.persistence.*;

@Data
@Entity
@Table(name = "personnes")
public class Personnes {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_personne")
	private Long idPersonne;

	@Column(name = "CIN")
	private String cin;

	@Column(name = "Grade")
	private String grade;

	@Column(name = "Responsabilite")
	private String responsabilite;

	@Column(name = "Numero_RIB")
	private String numeroRIB;

	@ManyToOne
	@JoinColumn(name = "ID_Banque")
	private Banques banque;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "id_information", referencedColumnName = "ID_Informations")
	private Informations informations;

	@Column(name = "Numero_SOM")
	private String numeroSOM;

	@Column(name = "Mot_de_passe")
	private String motDePasse;
}

