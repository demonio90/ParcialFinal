package com.cristian.AdivinaNumero;

import java.util.Scanner;
import java.util.Random;

public class Main {
	public static int min = 1;
	public static int max = 10;
	public static Scanner entradaV = new Scanner(System.in);
	public static Scanner entradaN = new Scanner(System.in);
	public static int random;
	
	public static void main(String[] args) {
		Random rnd = new Random();
		random = (int) (rnd.nextDouble() * max + min);
		System.out.println(random);
		adivina();
	}
	public static void adivina() {
		System.out.println("Ingrese su nombre de usuario: ");
		String nombre = entradaN.nextLine();
		numero();
	}
	public static void numero() {
		System.out.println("\nIngrese un numero entero entre " + min + " y " + max);
		int valor = entradaV.nextInt();
		
		if(valor == random ) {
			System.out.println("\nGanó");
		}else {
			if(valor > random) {
				System.out.println("\nEl usuario esta por encima del numero");
				numero();
			}else {
				System.out.println("\nEl usuario esta por debajo del numero");
				numero();
			}
		}
	}
}
