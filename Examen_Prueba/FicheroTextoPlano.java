package Examen_Prueba;

import java.time.LocalDateTime;

public class FicheroTextoPlano extends FicheroTexto implements Representable {

	public FicheroTextoPlano(String nombre, LocalDateTime fecha, String[] texto) {
		super(nombre, fecha, texto);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void representar() {
		for (int i = 0; i < texto.length; i++) {
			System.out.println(texto[i]);
		}
	}

}
