package com.cristian.puntodos;

import java.util.Scanner;

public class Main {
	public static Carro carro = new Carro();
	public static Scanner entradaO = new Scanner(System.in);
	public static Scanner entradaMarca = new Scanner(System.in);
	public static int opcion;

	public static void main(String[] args) {
		menu();
	}
	public static void menu() {
		System.out.println("Menu:\n\n"
				+ "1) Ver modelo.\n"
				+ "2) Actualizar informacion.\n"
				+ "3) Arrancar.\n"
				+ "4) Frenar.\n"
				+ "5) Acelerar.\n"
				+ "6) Estado.\n"
				+ "7) Encender lucers.\n"
				+ "8) Apagar luces.\n");
	
		opcion = entradaO.nextInt();
		
		switch(opcion) {
			case 1:
				carro.getMarcaModelo();
				break;
			case 2:
				System.out.println("Ingrese la marca del carro:\n");
				String ma = entradaMarca.nextLine();
				System.out.println("Ingrese el modelo del carro:\n");
				String mo = entradaMarca.nextLine();
				carro.setMarcaModelo(ma, mo);
				break;
			case 3:
				carro.arrancar();
				break;
			case 4:
				carro.frenar();
				break;
			case 5:
				carro.acelerar();
				break;
			case 6:
				carro.estado();
				break;
			case 7:
				carro.encenderLuces();
				break;
			case 8:
				carro.apagarLuces();
				break;
		}
	}
}
