/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.Jenkins.mavenjava;

import java.time.LocalDate;

public class EmployeVente extends Employe {
	
	private double CA;

	public EmployeVente(String nom, String prenom, String telephone, LocalDate dateNaissance, LocalDate dateEmbauche,
			double cA) {
		super(nom, prenom, telephone, dateNaissance, dateEmbauche);
		CA = cA;
		
		calculSalaire();
	}

	@Override
	public void calculSalaire() {
		// TODO Auto-generated method stub
		salaire = 0.25 * CA + 400;
	}

	public double getCA() {
		return CA;
	}

	public void setCA(double cA) {
		CA = cA;
	}
	
	

}