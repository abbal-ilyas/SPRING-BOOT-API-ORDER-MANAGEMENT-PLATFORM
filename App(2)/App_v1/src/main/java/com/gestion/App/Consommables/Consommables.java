package com.gestion.App.Consommables;

import com.gestion.App.Fournisseurs.Fournisseurs;
import com.gestion.App.Personnes.Personnes;
import lombok.*;
import jakarta.persistence.*;

import java.util.Date;


@Data
@Entity
@Table(name = "consommables")
public class Consommables {
	@Id
	@Column(name = "ID_Consommable")
	private Long idConsommable;

	@Column(name = "Type_Consommable")
	private String typeConsommable;

	@Column(name = "Quantite")
	private int quantite;

	@Column(name = "Date_Acquisition")
	private Date dateAcquisition;
	@Column(name = "Date_Affectation")
	private Date dateAffectation;

	@OneToOne
	@JoinColumn(name = "id_respo", referencedColumnName = "id_personne")
	private Personnes personnes;

	@OneToOne
	@JoinColumn(name = "ID_Fournisseur", referencedColumnName = "id_fournisseur")
	private Fournisseurs fournisseurs;
}

