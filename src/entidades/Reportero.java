package entidades;

import java.util.Scanner;

public class Reportero {
	private String nombre;
	private String apellidos;
	private String NIF;
	private int teléfono;
	public Concierto documentado;
	protected boolean datos = true;

	public Reportero(String nombre, String apellidos, String NIF, int teléfono) {
		super();
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.NIF = NIF;
	}

	public Reportero() {
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

	public static <Reportero> Reportero newReportero() {
		Reportero doc = newReportero();
		Scanner teclado = new Scanner(System.in);
		System.out.println("Introduzca el NIF");
		String NIF = "";
		NIF = teclado.nextLine();
		((entidades.Reportero) doc).setNIF(NIF);
		System.out.println(NIF);

		System.out.println("Introduce el nombre del reportero");
		String nom = "";
		nom = teclado.nextLine();
		((entidades.Reportero) doc).setNombre(nom);
		System.out.println(nom);
		
		
		System.out.println("¿Son correctos los datos? \"true or false\"");
		boolean s = true;
		s = teclado.hasNextLine();
		return doc;		
	}

}
