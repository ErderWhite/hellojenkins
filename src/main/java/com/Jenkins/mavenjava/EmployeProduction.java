/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.Jenkins.mavenjava;

import java.time.LocalDate;

public class EmployeProduction extends Employe {
	
	private int nbUnite;

	public EmployeProduction(String nom, String prenom, String telephone, LocalDate dateNaissance,
			LocalDate dateEmbauche, int nbUnite) {
		super(nom, prenom, telephone, dateNaissance, dateEmbauche);
		this.nbUnite = nbUnite;
		
		calculSalaire();
	}



	@Override
	public void calculSalaire() {
		// TODO Auto-generated method stub
		 
		super.salaire = nbUnite * 4;
	}



	public int getNbUnite() {
		return nbUnite;
	}



	public void setNbUnite(int nbUnite) {
		this.nbUnite = nbUnite;
	}
	
	

}