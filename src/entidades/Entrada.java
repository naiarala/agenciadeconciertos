package entidades;

import java.util.Scanner;

public class Entrada {
	private long id;
	private String precio;
	private boolean vip = false;
	
	public Reserva puedeser;
	
	public Compra adquiere;

	public static Entrada newEntrada() {
		Entrada ent = new Entrada();
		Scanner teclado = new Scanner(System.in);
		System.out.println("¿Es vip?\"true or false\"");
		boolean y = false;
		y = teclado.nextBoolean();
		System.out.println(y);
		return ent;

	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getPrecio() {
		return precio;
	}

	public void setPrecio(String precio) {
		this.precio = precio;
	}

	public boolean isVip() {
		return vip;
	}

	public void setVip(boolean vip) {
		this.vip = vip;
	}

	@Override
	public String toString() {
		return "Entrada [id=" + id + ", precio=" + precio + ", vip=" + vip + "]";
	}

	public static void Compra() {
		
	}
}
