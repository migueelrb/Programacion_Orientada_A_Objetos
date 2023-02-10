package Examen_Prueba;

import java.time.LocalDateTime;

public class FicheroAudio extends FicheroBinario implements Reproducir {

	private int duracionAudio;

	public FicheroAudio(String nombre, LocalDateTime fecha, Byte[] arrayBytes, int duracionAudio) {
		super(nombre, fecha, arrayBytes);
		this.duracionAudio = duracionAudio;
	}

	public int getDuracionAudio() {
		return duracionAudio;
	}

	public void setDuracionAudio(int duracionAudio) {
		this.duracionAudio = duracionAudio;
	}

	@Override
	public String toString() {
		return "Fichero_Audio [duracionAudio=" + duracionAudio + "]";
	}

	@Override
	public void reproducir() {
		System.out.println("Reproduciendo el audio: " + this.nombre);
	}

}
