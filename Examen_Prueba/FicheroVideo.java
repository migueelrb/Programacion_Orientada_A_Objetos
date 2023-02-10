package Examen_Prueba;

import java.time.LocalDateTime;

public class FicheroVideo extends FicheroBinario implements Reproducir {

	private double duracionVideo;

	public FicheroVideo(String nombre, LocalDateTime fecha, Byte[] arrayBytes, double duracionVideo) {
		super(nombre, fecha, arrayBytes);
		this.duracionVideo = duracionVideo;
	}

	public double getDuracionVideo() {
		return duracionVideo;
	}

	public void setDuracionVideo(double duracionVideo) {
		this.duracionVideo = duracionVideo;
	}

	@Override
	public String toString() {
		return "FicheroVideo [duracionVideo=" + duracionVideo + "]";
	}

	@Override
	public void reproducir() {
		System.out.println("Reproduciendo el video: " + this.nombre);
	} 

}
