/**
 * 
 * @author Bello
 *
 */
//clase Gato que hereda de la clase Mascotas.
public class Gato extends Mascota {

	//Variable de la clase gato.
	protected boolean estaMaullando;

	//constructor con parámetros y sin parámetros.
	public Gato(int edad, String nombre, boolean estaMaullando) {
		super(edad, nombre);
		this.estaMaullando = estaMaullando;
	}
	
	public Gato() {
		
	}

	//Método Get y set de las variables.
	public boolean isEstaMaullando() {
		return estaMaullando;
	}

	public void setEstaMaullando(boolean estaMaullando) {
		this.estaMaullando = estaMaullando;
	}
	//Método toString, con este método y el resto de métodos toString trabajamos (Polimorfismo).	
	@Override
	public String toString() {
		return "Gato [estaMaullando=" + estaMaullando + ", edad=" + edad + ", Nombre=" + Nombre + "]";
	}
	
	
	
	
	
	
}
