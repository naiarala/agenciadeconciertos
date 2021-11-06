package entidades;

import java.util.Scanner;

public class Reportero {
	private String nombre;
	private String apellidos;
	private String NIF;
	private int teléfono;
	public Concierto documentado;

	public Reportero(String nombre, String apellidos, String NIF, int teléfono) {
		super();
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.NIF = NIF;
	}

	public Reportero() {
		// TODO Auto-generated constructor stub
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

	public String getNIF() {
		return NIF;
	}

	public void setNIF(String nIF) {
		NIF = nIF;
	}

	public int getTeléfono() {
		return teléfono;
	}

	public void setTeléfono(int teléfono) {
		this.teléfono = teléfono;
	}

	public Concierto getDocumentado() {
		return documentado;
	}

	public void setDocumentado(Concierto documentado) {
		this.documentado = documentado;
	}

	public static Reportero NuevoReportero() {
		Reportero doc = new Reportero();
		Scanner teclado = new Scanner(System.in);
		System.out.println("Introduce el NIF");
		String NIF = "";
		NIF = teclado.nextLine();
		doc.setNIF(NIF);
		System.out.println(NIF);

		System.out.println("Introduce el nombre del reportero");
		String nom = "";
		nom = teclado.nextLine();
		doc.setNombre(nom);
		System.out.println(nom);
		return doc;
	}

}
