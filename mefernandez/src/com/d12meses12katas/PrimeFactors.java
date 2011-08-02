package com.d12meses12katas;

import java.util.ArrayList;
import java.util.List;



public class PrimeFactors {
	
	public static int[] generate(int numero) {
		List<Integer> factores = new ArrayList<Integer>();
		int factor = encontrarUnFactor(numero);
		factores.add(factor);
		while (factor != numero) {
			numero = numero / factor;
			factor = encontrarUnFactor(numero);
			factores.add(factor);
		}
		return toArray(factores);
	}


	static int encontrarUnFactor(int numero) {
		// Supongo que el numero es primo
		int factor = numero;
		// Empiezo a dividirlo por numeros desde el 2 hasta su raiz cuadrada
		int r = (int)Math.sqrt(numero);
		for (int i=2; i<=r; i++) {
			// En cuanto el resto sea cero, devuelvo el divisor como factor del numero
			if (numero % i == 0) {
				factor = i;
				break;
			}
		}
		return factor;
	}

	
	static int[] toArray(List<Integer> factores) {
		int[] a = new int[factores.size()];
		for (int i = 0; i < factores.size(); i++) {
			a[i] = factores.get(i);
		}
		return a;
	}

	static int[] join(int[] a, int[] b) {
		int[] c = new int[a.length + b.length];
		for (int i = 0; i < a.length; i++) {
			c[i] = a[i];
		}
		for (int i = 0; i < b.length; i++) {
			c[i+a.length] = b[i];
		}
		return c;
	}

}
