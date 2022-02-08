package com.generation;

public class Tacos {
	private String tipodeTortilla;
	private String tipodeGuisado;
	private int numerodeTortilla;
	private String tamaniodeTortilla;
	private float precio;
	
	
	
	public String getTipodeTortilla() {
		return this.tipodeTortilla;
	}

	public void setTipodeTortilla(String tipodeTortilla) {
		this.tipodeTortilla = tipodeTortilla;
	}

	public String getTipodeGuisado() {
		return this.tipodeGuisado;
	}

	public void setTipodeGuisado(String tipodeGuisado) {
		if(tipodeGuisado=="Bisteck" || tipodeGuisado=="Suadero") {
			this.tipodeGuisado = tipodeGuisado;
		}
		else {
			throw new IllegalArgumentException("Solo hay de Bisteck o Suadero, ingresa bien el tipo de guisado");
		}
	}

	public int getNumerodeTortilla() {
		return this.numerodeTortilla;
	}

	public void setNumerodeTortilla(int numerodeTortilla) {
		this.numerodeTortilla = numerodeTortilla;
	}

	public String getTamaniodeTortilla() {
		return this.tamaniodeTortilla;
	}

	public void setTamaniodeTortilla(String tamaniodeTortilla) {
		this.tamaniodeTortilla = tamaniodeTortilla;
	}

	public float getPrecio() {
		return this.precio;
	}

	public void setPrecio(float precio) {
		if(precio<50) {
			this.precio = precio;
		}
		else {
			throw new IllegalArgumentException("No hay tacos tan caros, ingresa un valor menor a 50");
		}
	}

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
