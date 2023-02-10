package Examen_Prueba;

import java.time.LocalDateTime;

public class FicheroImagen extends FicheroBinario {

	private String formato;

	public FicheroImagen(String nombre, LocalDateTime fecha, Byte[] arrayBytes, String formato) {
		super(nombre, fecha, arrayBytes);
		this.formato = formato;
	}

	public String getFormato() {
		return formato;
	}

	public void setFormato(String formato) {
		this.formato = formato;
	}

	@Override
	public String toString() {
		return "FicheroImagen [formato=" + formato + "]";
	}

}
