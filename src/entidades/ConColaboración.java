package entidades;

import java.time.LocalDate;

public class ConColaboración extends Concierto {
	public Actuación forma = new Actuación();

	public ConColaboración(long id, LocalDate fecha, LocalDate hora) {
		super(id, fecha, hora);
	}

}
