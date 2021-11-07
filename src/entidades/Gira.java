package entidades;

import java.time.LocalDate;

public class Gira {
	public Concierto compone;

	public Gira() {
		compone = new Concierto(0, null, null);

	}

	private String nombre;
	private LocalDate fechadeapertura;
	private LocalDate fechadecierre;
	private long id;
	
	public void Informe () {
	Informe i = new Informe ();
	}

	public Concierto getCompone() {
		return compone;
	}

	public void setCompone(Concierto compone) {
		this.compone = compone;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public LocalDate getFechadeapertura() {
		return fechadeapertura;
	}

	public void setFechadeapertura(LocalDate fechadeapertura) {
		this.fechadeapertura = fechadeapertura;
	}

	public LocalDate getFechadecierre() {
		return fechadecierre;
	}

	public void setFechadecierre(LocalDate fechadecierre) {
		this.fechadecierre = fechadecierre;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "Gira [compone=" + compone + ", nombre=" + nombre + ", fechadeapertura=" + fechadeapertura
				+ ", fechadecierre=" + fechadecierre + ", id=" + id + "]";
	}
	
}