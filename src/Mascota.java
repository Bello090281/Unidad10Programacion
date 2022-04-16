
/**
 * 
 * @author Bello
 *
 */

//Clase Mascota.
public class Mascota {

	//Variables de la clase Mascotas, variables principales de los objetos que introducimos en el ArrayList.
	protected int edad;
	protected String Nombre;

	//Constructores con parámetros y sin parémetros.
	public Mascota(int edad, String nombre) {
		super();
		this.edad = edad;
		Nombre = nombre;
	}

	public Mascota() {

	}

	//Método get y set de las variables.
	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public String getNombre() {
		return Nombre;
	}

	public void setNombre(String nombre) {
		Nombre = nombre;
	}

	//Método toString, con este método y el resto de métodos toString trabajamos (Polimorfismo).	
	@Override
	public String toString() {
		return "Mascota [edad=" + edad + ", Nombre=" + Nombre + "]";
	}

}
