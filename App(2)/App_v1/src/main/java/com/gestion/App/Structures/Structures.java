package com.gestion.App.Structures;
import com.gestion.App.Budget.Budget;
import com.gestion.App.Personnes.Personnes;
import lombok.*;
import jakarta.persistence.*;

@Data
@Entity
@Table(name = "structures")
public class Structures {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID_Structure")
	private Long idStructure;

	@Column(name = "Type")
	private String type;

	@Column(name = "Nom")
	private String nom;

	@ManyToOne
	@JoinColumn(name = "ID_Chef")
	private Personnes chef;

	@ManyToOne
	@JoinColumn(name = "ID_Adjoint")
	private Personnes adjoint;

	@OneToOne
	@JoinColumn(name = "Budget_ID", referencedColumnName = "ID_Budget")
	private Budget budget;

}



