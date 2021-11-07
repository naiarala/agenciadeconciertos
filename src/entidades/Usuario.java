package entidades;

import java.util.Scanner;

public class Usuario {
// id es el identificador único de cada elemento Usuario.
	// es un valor entero > 0
	// tiene un valor por defecto de 0
	private long id;
	private String nombre;
	private String apellidos;
	private long email;
	private String NIF;
	
	public void Compra() {
		Compra com = new Compra ();
	}
	public void Reserva() {
		Reserva res = new Reserva ();
	}

	public static Usuario newUsuario() {
		Usuario ret = new Usuario();
		Scanner teclado = new Scanner(System.in);
		System.out.println("Introduce el nombre y apellidos del usuario");
		String nom = "";
		nom = teclado.nextLine();
		System.out.println(nom);
		return ret;

	}

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

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public long getEmail() {
		return email;
	}

	public void setEmail(long email) {
		this.email = email;
	}

	public String getNIF() {
		return NIF;
	}

	public void setNIF(String nIF) {
		NIF = nIF;
	}

	@Override
	public String toString() {
		return "Usuario [id=" + id + ", nombre=" + nombre + ", apellidos=" + apellidos + ", email=" + email + ", NIF="
				+ NIF + "]";
	}
}