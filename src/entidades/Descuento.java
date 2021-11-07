package entidades;

import java.time.LocalDate;
import java.util.Scanner;

public class Descuento {
	private LocalDate fechavalidez;

	public LocalDate getFechavalidez() {
		return fechavalidez;
	}

	public void setFechavalidez(LocalDate fechavalidez) {
		this.fechavalidez = fechavalidez;
	}

	@Override
	public String toString() {
		return "Descuento [fechavalidez=" + fechavalidez + "]";
	}

	public static Descuento newRDescuento() {
		Descuento ret = new Descuento();
		Scanner teclado = new Scanner(System.in);
		System.out.println("Introduzca el id de la compra");
		String id = "";
		id = teclado.nextLine();
		return ret;
	}
}