package Examen_Prueba;

import java.time.LocalDateTime;

public abstract class Fichero {

	// Atributos
	public String nombre;
	public long tamaño;
	public LocalDateTime fecha;

	public Fichero(String nombre, long tamaño, LocalDateTime fecha) {
		super();
		this.nombre = nombre;
		this.tamaño = tamaño;
		this.fecha = fecha;
	}

	/**
	 * Este método devolverá el tamaño del fichero.
	 * 
	 * @return
	 */
	public long devolverTamaño() {
		return this.tamaño;
	}

	/**
	 * Este método devuelve la información básica del fichero, este método es final
	 * para que ninguna clase que herede pueda editarlo.
	 */
	public final void mostrarInformacion() {
		System.out.println("El nombre del fichero es: " + this.nombre);
		System.out.println("El tamaño del fichero es: " + this.tamaño);
		System.out.println("La fecha de creacion del fichero es: " + this.fecha);
	}

}
