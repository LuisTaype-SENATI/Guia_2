package com.senati.eti;
import java.util.Scanner;
public class Caso4de2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Ingrese numero 1......: ");
		int n1 = sc.nextInt();

		System.out.print("Ingrese numero 2......: ");
		int n2 = sc.nextInt();

		String estado = "";
		
		if (n1==n2)
			estado = "Los numeros son iguales";
		else if(n1>n2)
			estado = "El segundo numero "+n2+" es menor.";
		else
			estado = "El primer numero "+n1+" es menor.";
		
		System.out.println("Estado "+estado);	

	}

}
