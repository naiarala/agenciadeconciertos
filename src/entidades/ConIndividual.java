package entidades;

import java.time.LocalDate;

public class ConIndividual extends Concierto{
	public Actuación es = new Actuación();

	public ConIndividual(long id, LocalDate fecha, LocalDate hora) {
		super(id, fecha, hora);
	}
}
