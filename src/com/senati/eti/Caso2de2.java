package com.senati.eti;

import java.util.Scanner;

public class Caso2de2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Ingrese n�mero 1....: ");
		int n1 = sc.nextInt();
		
		System.out.print("Ingrese n�mero 2....: ");
		int n2 = sc.nextInt();
		
		String estado = "";
		
		if (n1 == n2)
			estado = "Los dos n�meros son iguales";
		else if (n1> n2)
				estado = "El primer n�mero " + n1 + " es mayor";
			else
				estado = "El segundo n�mero " + n2 + " es mayor. ";
		
		System.out.println("\nEstado....: " + estado);
		


	}

}
