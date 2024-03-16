package com.gestion.App.Fournisseurs;

import com.gestion.App.Personnes.Personnes;
import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "fournisseurs")
public class Fournisseurs {
	@Id
	@Column(name = "id_fournisseur")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idFournisseur;



	@ManyToOne
	@JoinColumn(name = "responsable_Id")
	private Personnes responsable;

	@Column(name = "Site_web")
	private String siteWeb;
}

