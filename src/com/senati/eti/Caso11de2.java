package com.senati.eti;

import java.util.Scanner;

public class Caso11de2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		System.out.print("Número [1-7]... : ");
		int n = sc.nextInt();
		String nombre_dia = "";
		
		//break, sirve para que el funcionamiento sea correcto
		//si no pones break, en cada case se pone break, para asi siga y no repita
		switch (n) {
		    case 1:
		    	nombre_dia = "Lunes";
		    case 2:
		    	nombre_dia = "Martes";
		    case 3:
		    	nombre_dia = "Miercoles";
		    case 4:
		    	nombre_dia = "Jueves";
		    case 5:
		    	nombre_dia = "Viernes";
		    case 6:
		    	nombre_dia = "Sabado";
		    case 7:
		    	nombre_dia = "Domingo";
		    	break;
		    default:
		    	nombre_dia = "Desconocido";
		    	
		    
		}
		
		
		System.out.println("\n=======================");
		System.out.println("Día de la semana..........: " + nombre_dia);

	}

}
