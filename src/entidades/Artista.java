package entidades;

import java.util.Scanner;

public class Artista {
	private long id;
	private String nombre;
	private long géneromúsica;
	private char letra;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public long getGéneromúsica() {
		return géneromúsica;
	}

	public void setGénero(long géneromúsica) {
		this.géneromúsica = géneromúsica;
	}

	public char getLetra() {
		return letra;
	}

	public void setLetra(char letra) {
		this.letra = letra;
	}

	public static <Artista> Artista newArtista() {
		Artista art = newArtista();
		Scanner teclado = new Scanner(System.in);
		System.out.println("Introduzca el nombre del artista");
		String nom = "";
		nom = teclado.nextLine();
		((entidades.Artista) art).setNombre(nom);
		System.out.println(nom);

		System.out.println("¿Son correctos los datos? \"true or false\"");
		boolean s = true;
		s = teclado.hasNextLine();
		return art;
	}

	public Artista(long id, String nombre, long géneromúsica, char letra) {
		this.id = id;
		this.nombre = nombre;
		this.géneromúsica = géneromúsica;
		this.letra = letra;

	}
}
