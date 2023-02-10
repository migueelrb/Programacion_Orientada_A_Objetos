package Examen_Prueba;

import java.time.LocalDateTime;

public class FicheroEjecutable extends FicheroBinario implements Analizable {

	private int permisos;

	public FicheroEjecutable(String nombre, LocalDateTime fecha, Byte[] arrayBytes, int permisos) {
		super(nombre, fecha, arrayBytes);
		this.permisos = permisos;
	}

	public int getPermisos() {
		return permisos;
	}

	public void setPermisos(int permisos) {
		this.permisos = permisos;
	}

	@Override
	public void analizar() {
		System.out.println("Analizando el fichero: " + this.nombre);
	}

	@Override
	public String toString() {
		return "FicheroEjecutable [permisos=" + permisos + "]";
	}

}
