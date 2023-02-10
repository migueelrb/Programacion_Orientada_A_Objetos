package Examen_Prueba;

import java.time.LocalDateTime;
import java.util.Arrays;

public abstract class FicheroBinario extends Fichero {

	private Byte[] arrayBytes;

	public FicheroBinario(String nombre, LocalDateTime fecha, Byte[] arrayBytes) {
		super(nombre, arrayBytes.length, fecha);
		this.arrayBytes = arrayBytes;
		
	}

	public Byte[] getArrayBytes() {
		return arrayBytes;
	}

	public void setArrayBytes(Byte[] arrayBytes) {
		this.arrayBytes = arrayBytes;
	}

	@Override
	public String toString() {
		return "Fichero_Binario [arrayBytes=" + Arrays.toString(arrayBytes) + "]";
	}

}
