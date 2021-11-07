package entidades;

public class Actuación {
	private long id;
	private int numsecuencia;
	private String duración;
	
	public Artista interviene;
	
	void ensamblar(Artista art) {
		interviene = art;

	}
	public Artista getArtista() {
		return interviene;
	}
	public void setArtista(Artista artista) {
		this.interviene = artista;
	}
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
		return "Actuación [id=" + id + ", numsecuencia=" + numsecuencia + ", duración=" + duración + ", interviene="
				+ interviene + "]";
	}

}
