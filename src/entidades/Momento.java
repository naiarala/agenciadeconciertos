package entidades;

import java.time.LocalDate;
import java.util.Scanner;

public class Momento {
	private long id;
	private String descripción;
	private LocalDate hora;

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

	public LocalDate getHora() {
		return hora;
	}

	public void setHora(LocalDate hora) {
		this.hora = hora;
	}

	@Override
	public String toString() {
		return "Momento [id=" + id + ", descripción=" + descripción + ", hora=" + hora + "]";
	}

	public static Momento newMomento() {
		Momento ret = new Momento();
		Scanner teclado = new Scanner(System.in);
		System.out.println("Introduzca la descripción del momento");
		String momento = "";
		momento = teclado.nextLine();
		return ret;
	}
}