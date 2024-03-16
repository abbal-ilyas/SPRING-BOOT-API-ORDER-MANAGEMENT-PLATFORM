package com.gestion.App.Materiel;
import com.gestion.App.Fournisseurs.Fournisseurs;
import com.gestion.App.Personnes.Personnes;
import lombok.*;
import jakarta.persistence.*;


import java.util.Date;

@Data
@Entity
@Table(name = "materiel")
public class Materiel {
	@Id
	@Column(name = "ID_Materiel")
	private Long idMateriel;

	@Column(name = "Numero_Inventaire")
	private String numeroInventaire;

	@Column(name = "Type_Materiel")
	private String typeMateriel;

	@Column(name = "Date_Acquisition")
	private Date dateAcquisition;

	@ManyToOne
	@JoinColumn(name = "ID_Responsable")
	private Personnes responsable;

	@Column(name = "Date_Affectation")
	private Date dateAffectation;


	@OneToOne
	@JoinColumn(name = "ID_Fournisseur", referencedColumnName = "id_fournisseur")
	private Fournisseurs fournisseurs;
}
