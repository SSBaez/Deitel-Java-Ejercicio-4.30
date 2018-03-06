package com.ssbaez.ejercicio430;

import java.util.Scanner;

public class Palindromo {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Programa que lee un entero de cinco digitos y determina si es un palindromo\n");
		
		System.out.println("Ingrese un entero de cinco digitos:");
		System.out.print("----> ");
		int x = input.nextInt();
		
		while(true) {
			
			if(x > 9999 && x < 100000) {
				
				int d5 = x % 10;
				int d4 = (x / 10) % 10;
				int d3 = (x / 100) % 10;
				int d2 = (x / 1000) % 10;
				int d1 = (x / 10000) % 10;
				
				if(d5 == d1 && d4 == d2) {
					System.out.println("Es un palindromo");
				}
				else {
					System.out.println("No es un palindromo");
				}
				
				break;
				
			}
			else {
				System.out.println("El numero no es correcto");
				System.out.println("Ingrese un entero de CINCO digitos:");
				System.out.print("----> ");
				x = input.nextInt();
			}
		}
	
	}//Fin de main

}//Fin de clase
