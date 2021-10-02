package datos;

public class contacto {
	// Variables
	private String nombre;
	private long celular;

	////////////////
	// Constructores
	public contacto(String nombre, long celular) {
		super();
		this.nombre = nombre;
		this.celular = celular;
	}

	public contacto() {
		super();
	}

	///////////////////
	/* ToString */
	@Override
	public String toString() {
		return "contacto [nombre=" + nombre + ", celular=" + celular + "]";
	}

	/////////////////////
	/* Getters y Setters */
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public long getCelular() {
		return celular;
	}

	public void setCelular(long celular) {
		this.celular = celular;
	}
	////////////////////////////
}
