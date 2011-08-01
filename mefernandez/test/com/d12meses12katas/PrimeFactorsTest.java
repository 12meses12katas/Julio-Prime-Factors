package com.d12meses12katas;

import static org.junit.Assert.assertArrayEquals;

import org.junit.Test;

public class PrimeFactorsTest {

	@Test
	public void factorizarNumero1() {
		int[] factores = PrimeFactors.generate(1);
		assertArrayEquals(new int[] {1}, factores);
		
	}

	@Test
	public void factorizarNumero2() {
		int[] factores = PrimeFactors.generate(2);
		assertArrayEquals(new int[] {2}, factores);
		
	}
	@Test
	public void factorizarNumero3() {
		int[] factores = PrimeFactors.generate(3);
		assertArrayEquals(new int[] {3}, factores);
		
	}
	@Test
	public void factorizarNumero4() {
		int[] factores = PrimeFactors.generate(4);
		assertArrayEquals(new int[] {2,2}, factores);
		
	}
	@Test
	public void factorizarNumero5() {
		int[] factores = PrimeFactors.generate(5);
		assertArrayEquals(new int[] {5}, factores);
		
	}
	@Test
	public void factorizarNumero6() {
		int[] factores = PrimeFactors.generate(6);
		assertArrayEquals(new int[] {2,3}, factores);
		
	}
	@Test
	public void factorizarNumero7() {
		int[] factores = PrimeFactors.generate(7);
		assertArrayEquals(new int[] {7}, factores);
		
	}
	@Test
	public void factorizarNumero12() {
		int[] factores = PrimeFactors.generate(12);
		assertArrayEquals(new int[] {2,2,3}, factores);
		
	}
	@Test
	public void factorizarNumero210() {
		int[] factores = PrimeFactors.generate(210);
		assertArrayEquals(new int[] {2,3,5,7,}, factores);
		
	}
	
	@Test
	public void joinArrays() {
		int[] resultado = PrimeFactors.join(new int[] {1,2,3}, new int[] {4,5});
		assertArrayEquals(new int[] {1,2,3,4,5}, resultado);
		
	}
	
}

