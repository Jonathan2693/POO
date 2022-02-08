package com.gatitos;

public class Gato {
	//Atributos de la clase Gato
	private String nombre;
	private int patas;
	private boolean adoptado;
	
	//Metodos getters y setters para modificar los atributos
	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getPatas() {
		return this.patas;
	}

	public void setPatas(int patas) {
		if(patas!=4) {
			throw new IllegalArgumentException("No esta bien el número ingresado");
		}
		else {
			this.patas = patas;
		}
	}
	
	public boolean isAdoptado() {
		return this.adoptado;
	}

	public void setAdoptado(boolean adoptado) {
		this.adoptado = adoptado;
	}

//Metodo por defecto cuando se llama el objeto, reglas cuando se use tostring

	@Override
	public String toString() {
		return "Gato [nombre=" + nombre + ", patas=" + patas + ", adoptado=" + adoptado + "]";
	}
	
}
