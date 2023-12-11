package crud;

public class CrudJugador {

	private String nombre;
	private String dni;
	private String contrasena;
	
	public CrudJugador(String nombre, String dni, String contrasena) {
		this.nombre = nombre;
		this.dni = dni;
		this.contrasena = contrasena;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public String getContrasena() {
		return contrasena;
	}

	public void setContrasena(String contrasena) {
		this.contrasena = contrasena;
	}

	public String toString() {
		return "CrudJugador [nombre=" + nombre + ", dni=" + dni + ", contrasena=" + contrasena + "]";
	}
	
	
	
	
	
}
