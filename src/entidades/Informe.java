package entidades;

import java.util.Scanner;

public class Informe {
	private long id;
	private String descripción;
	private boolean revisado = true;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getDescripción() {
		return descripción;
	}

	public void setDescripción(String descripción) {
		this.descripción = descripción;
	}

	public boolean isRevisado() {
		return revisado;
	}

	public void setRevisado(boolean revisado) {
		this.revisado = revisado;
	}

	@Override
	public String toString() {
		return "Informe [id=" + id + ", descripción=" + descripción + ", revisado=" + revisado + "]";
	}

	public static Informe newInforme() {
		Informe ret = new Informe();
		Scanner teclado = new Scanner(System.in);
		System.out.println("Introduzca la descripción de la gira");
		String descripción = "";
		descripción = teclado.nextLine();
		ret.setDescripción(descripción);
		return ret;
	}
}