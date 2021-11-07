package entidades;

import java.time.LocalDate;

public class Concierto {
	protected long id;
	protected LocalDate fecha;
	protected LocalDate hora;
	public Reportero documenta;
	
	public void Entrada() {
		Entrada ent = new Entrada ();
	}
	
	//Método para darle valores a los atributos de cada objeto.
	public void setid(long i) {
	id = i;
	}
	//Método para que nos diga qué valores hay en cada atributo.
	public long getid() {
		return id;		
	}
	public void setfecha(LocalDate fecha) {
	fecha = fecha;
	}
	public LocalDate getfecha() {
		return fecha;		
	}

	public void sethora(LocalDate hora) {
	hora = hora;
	}
	public LocalDate gethora() {
		return hora;		
	}


	public Reportero getDocumenta() {
		return documenta;
	}

	public void setDocumenta(Reportero documenta) {
		this.documenta = documenta;
	}

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

	@Override
	public String toString() {
		return "Concierto [id= " + id + ",fecha=" + fecha + ", hora=" + hora + "]";
	}
}
