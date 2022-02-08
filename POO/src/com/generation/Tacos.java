package com.generation;

public class Tacos {
	public String tipodeTortilla;
	public String tipodeGuisado;
	public int numerodeTortilla;
	public String tamaniodeTortilla;
	public float precio;
	
	public Tacos() {
		
	}
	
	public Tacos(String tipodeTortilla) {
		this.tipodeTortilla = tipodeTortilla;
	}
	
	public Tacos(String tipodeTortilla, String tipodeGuisado, int numerodeTortilla, String tamaniodeTortilla, float precio) {
		this.tipodeTortilla = tipodeTortilla;
		this.tipodeGuisado = tipodeGuisado;
		this.numerodeTortilla = numerodeTortilla;
		this.tamaniodeTortilla = tamaniodeTortilla;
		this.precio = precio;
		
	}
	
	public void preparar() {
		System.out.println("Preparando el taco...");
	}
	
	public void vender() {
		System.out.println("Taco vendido");
	}
	
	public void ponerSalsa() {
		System.out.println("Echando salsa");
	}
	
	public void subirPrecio(float aumento) {
		precio = precio + aumento;
	}

	@Override
	public String toString() {
		return "Tacos [tipodeTortilla=" + tipodeTortilla + ", tipodeGuisado=" + tipodeGuisado + ", numerodeTortilla="
				+ numerodeTortilla + ", tamaniodeTortilla=" + tamaniodeTortilla + ", precio=" + precio + "]";
	}
}
