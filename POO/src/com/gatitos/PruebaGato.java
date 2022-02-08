package com.gatitos;

public class PruebaGato {

	public static void main(String[] args) {
		Gato gato1 = new Gato();
		gato1.setNombre("GatoNombre");
		gato1.setPatas(1);
		gato1.setAdoptado(false);
		System.out.println(gato1.toString());
		System.out.println("El gato se llama "+ gato1.getNombre() + ", con "+ gato1.getPatas() + " patas y "+ ((gato1.isAdoptado()) ? "Si":"No") + " es adoptado");
		
	}

}
