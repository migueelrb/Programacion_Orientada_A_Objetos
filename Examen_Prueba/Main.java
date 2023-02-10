package Examen_Prueba;

import java.time.LocalDateTime;

public class Main {

	public static void main(String[] args) {

		LocalDateTime fecha = LocalDateTime.now();

		Fichero[] ficheros = {

				new FicheroTextoPlano("Fichero 1.txt", fecha, new String[] { "hola", "esto", "es", "una", "prueba" }),
				new FicheroTextoPlano("Fichero 2.txt", fecha, new String[] { "hola", "mundo" }),
				new FicheroTextoFormateado("Fichero formateado", fecha, new String[] { "Buenas", "tardes", "Mundo" },
						"Arial", 23, "Amarillo"),
				new FicheroTextoFormateado("Fichero formateado 2", fecha, new String[] { "Ultima", "prueba" },
						"Calibri", 16, "Rojo"),
				new FicheroAudio("Shakira", fecha, new Byte[] { 0, 1, 2 }, 2500),
				new FicheroEjecutable("Calculadora.bat", fecha, new Byte[] { 2, 4, 7, 8, 7, 5, 5, 3, 3 }, 755),
				new FicheroImagen("Fondo.png", fecha, new Byte[] { 2, 4, 4, 8, 7, 5, 5, 3, 3 }, "png"),
				new FicheroVideo("Video navidad", fecha, new Byte[] { 2, 4, 4, 8, 7, 5, 5, 3, 3 }, 89899),

		};

		for (Fichero f : ficheros) {
			if (f instanceof Analizable) {
				((Analizable) f).analizar();
			}
			if (f instanceof Legible) {
				System.out.println(((Legible) f).leer());
			}
			if (f instanceof Reproducir) {
				((Reproducir) f).reproducir();
			}
			if (f instanceof Representable) {
				((Representable) f).representar();
			}
		}

	}

}
