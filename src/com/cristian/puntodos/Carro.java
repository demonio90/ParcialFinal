package com.cristian.puntodos;

public class Carro {
	private String marca;
	private String modelo;
	private int consumoGasolina = 10;
	private int kilometraje = 0;
	private int gasolina = 100;
	private boolean movimiento;
	private int velocidad = 0;
	private boolean luces;

	public Carro() {
		// TODO Auto-generated constructor stub
	}
	public void getMarcaModelo() {
		if(marca == null && modelo == null) {
			System.out.println("Lo sentimos, debe añadir la marca y el modelo de su carro\n");
		}else {
			System.out.println("La marca del carro es: " + marca);
			System.out.println("El modelo del carro es: " + modelo);
		}
		Main.menu();
	}
	public void setMarcaModelo(String ma, String mo) {
		marca = ma;
		modelo = mo;
		Main.menu();
	}
	public void arrancar() {
		if(gasolina != 0 && movimiento == false) {
			System.out.println("Carro arranca");
			luces = false;
			velocidad += 5;
			movimiento = true;
		}else {
			System.out.println("Carro no puede arrancar");
		}
		Main.menu();
	}
	public void frenar() {
		if(velocidad != 0) {
			velocidad = 0;
			movimiento = false;
			System.out.println("Carro frena");
		}else {
			System.out.println("Carro se encuentra detenido");
		}
		Main.menu();
	}
	public void acelerar() {
		if(movimiento) {
			if(gasolina != 0) {
				gasolina -= consumoGasolina;
				kilometraje += 5;
				velocidad += 10;
			}
		}
		Main.menu();
	}
	public void estado() {
		if(movimiento) {
			System.out.println("El carro se encuentra en movimiento.\n");
			System.out.println("El estado de la gasolina es de " + gasolina + " litros\n");
			System.out.println("El estado del kilometraje es de " + kilometraje + " Km \n");
			
			if(luces) {
				System.out.println("Las luces de encuentran encendidas");
			}else {
				System.out.println("Las luces de encuentran apagadas");
			}
		}else {
			System.out.println("El carro se encuentra en detenido.\n");
			System.out.println("El estado de la gasolina es de " + gasolina + " litros\n");
			System.out.println("El estado del kilometraje es de " + kilometraje + " Km \n");
		}
		Main.menu();
	}
	public void encenderLuces() {
		luces = true;
		Main.menu();
	}
	public void apagarLuces() {
		luces = false;
		Main.menu();
	}
}
