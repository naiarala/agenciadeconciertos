package entidades;

import java.time.LocalDate;

public class Concierto {
	protected long id;
	protected LocalDate fecha;
	protected LocalDate hora;

	public Concierto(long id, LocalDate fecha, LocalDate hora) {
		super();
		this.id = id;
		this.fecha = fecha;
		this.hora = hora;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public LocalDate getFecha() {
		return fecha;
	}

	public void setFecha(LocalDate fecha) {
		this.fecha = fecha;
	}

	public LocalDate getHora() {
		return hora;
	}

	public void setHora(LocalDate hora) {
		this.hora = hora;
	}

	public String toString() {
		return "Concierto [id= " + id + ",fecha=" + fecha + ", hora=" + hora + "]";
	}
}
