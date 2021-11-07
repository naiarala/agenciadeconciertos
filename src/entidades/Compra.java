package entidades;

import java.util.Scanner;

public class Compra {
	private long id;
	private int precio;
	public String métodopago;
	
	public Entrada adquiere;
	public void Descuento() {
		Descuento d = new Descuento ();
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public int getPrecio() {
		return precio;
	}

	public void setPrecio(int precio) {
		this.precio = precio;
	}

	public String getMétodopago() {
		return métodopago;
	}

	public void setMétodopago(String métodopago) {
		this.métodopago = métodopago;
	}

	@Override
	public String toString() {
		return "Compra [id=" + id + ", precio=" + precio + ", métodopago=" + métodopago + "]";
	}

	public static Compra newCompra() {
		Compra com = new Compra();
		Scanner teclado = new Scanner(System.in);
		System.out.println("Introduce el método de pago");
		String métodopago = "";
		métodopago = teclado.nextLine();
		com.setMétodopago(métodopago);

		System.out.println("¿Son correctos los datos? \"true or false\"");
		boolean s = true;
		s = teclado.hasNextLine();
		System.out.println(s);
		return com;
	}
}
