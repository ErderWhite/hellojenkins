/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.Jenkins.mavenjava;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;



public class EmployeVenteTest {
	
	@Test
	public void calculSalaireCorrectTest()
	{
		EmployeVente ev = new EmployeVente("Paul", "Pierre", "0605", LocalDate.now(), LocalDate.now(), 10000);
		
		ev.calculSalaire();
		
		assertTrue(ev.getSalaire() == 2900);
	}
	
	@Test
	public void calculSalaireIncorrectTest()
	{
		EmployeVente ev = new EmployeVente("Paul", "Pierre", "0605", LocalDate.now(), LocalDate.now(), 10000);
		
		ev.calculSalaire();
		
		assertFalse(ev.getSalaire() == 2700);
	}

}