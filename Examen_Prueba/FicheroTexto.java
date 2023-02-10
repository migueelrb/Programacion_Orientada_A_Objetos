package Examen_Prueba;

import java.time.LocalDateTime;
import java.util.Arrays;

public abstract class FicheroTexto extends Fichero implements Legible {

	String texto[];

	public FicheroTexto(String nombre, LocalDateTime fecha, String[] texto) {
		super(nombre, devolverTamaño(texto), fecha);
		this.texto = texto;
	}

	public String[] getTexto() {
		return texto;
	}

	public void setTexto(String[] texto) {
		this.texto = texto;
	}

	private static long devolverTamaño(String[] texto) {
		long acum = 0;
		// For extendido:
		for (String nombre : texto) {
			acum += nombre.length();
		}
		return acum;

//		 Flujo de datos. 
//		return Arrays.stream(texto).reduce(String::concat).get().length();

	}

	@Override
	public String toString() {
		return "Fichero_Texto [texto=" + Arrays.toString(texto) + "]";
	}

	@Override
	public String leer() {
		StringBuilder acum = new StringBuilder();
		for (String t : texto) {
			acum.append(t);
		}

		return acum.toString();
	}

}
