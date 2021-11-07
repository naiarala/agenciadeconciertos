package entidades;

import java.util.Scanner;

public class Reserva {
	private long id;
	private int numsecuencia;
	private String duración;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public int getNumsecuencia() {
		return numsecuencia;
	}

	public void setNumsecuencia(int numsecuencia) {
		this.numsecuencia = numsecuencia;
	}

	public String getDuración() {
		return duración;
	}

	public void setDuración(String duración) {
		this.duración = duración;
	}

	@Override
	public String toString() {
		return "Reserva [id=" + id + ", numsecuencia=" + numsecuencia + ", duración=" + duración + "]";
	}
	public static Reserva newReserva() {
		Reserva ret = new Reserva();
		Scanner teclado = new Scanner(System.in);
		System.out.println("Introduzca el número de la secuencia de la reserva");
		String reserva = "";
		reserva = teclado.nextLine();
		return ret;
	}
}
