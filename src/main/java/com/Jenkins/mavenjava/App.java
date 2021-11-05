/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.Jenkins.mavenjava;


/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	// permet de gérer les opérations sur les employés: créer, modifier, supprimer,...
        GestionEmploye ge = new GestionEmploye();
        ge.menu();
    }
}
