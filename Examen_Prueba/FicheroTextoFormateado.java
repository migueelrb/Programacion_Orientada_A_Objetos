package Examen_Prueba;

import java.time.LocalDateTime;

public class FicheroTextoFormateado extends FicheroTexto implements Analizable {

	private String tipoDeFuente;
	private int tamañoDeFuente;
	private String colorDeFuente;

	public FicheroTextoFormateado(String nombre, LocalDateTime fecha, String[] texto, String tipoDeFuente,
			int tamañoDeFuente, String colorDeFuente) {
		super(nombre, fecha, texto);
		this.tipoDeFuente = tipoDeFuente;
		this.tamañoDeFuente = tamañoDeFuente;
		this.colorDeFuente = colorDeFuente;
	}

	public String getTipoDeFuente() {
		return tipoDeFuente;
	}

	public void setTipoDeFuente(String tipoDeFuente) {
		this.tipoDeFuente = tipoDeFuente;
	}

	public int getTamañoDeFuente() {
		return tamañoDeFuente;
	}

	public void setTamañoDeFuente(int tamañoDeFuente) {
		this.tamañoDeFuente = tamañoDeFuente;
	}

	public String getColorDeFuente() {
		return colorDeFuente;
	}

	public void setColorDeFuente(String colorDeFuente) {
		this.colorDeFuente = colorDeFuente;
	}

	@Override
	public void analizar() {
		System.out.println("Analizando el fichero: " + this.nombre);
	}

}
