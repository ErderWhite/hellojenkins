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


public class OperationsTest {
	
	Operations o;
	
	@BeforeAll
	public void setUp()
	{
		o = new Operations();
	}
	
	@Test
	public void additionDeuxPositifsTest()
	{
		double r = o.addition(5, 4);
		
		assertTrue(9 == r);
	}
	
	@Test
	public void additionPositifNegatifTest()
	{		
		assertTrue(o.addition(-3, 5) == 2);
	}

}