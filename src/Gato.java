/**
 * 
 * @author Bello
 *
 */
//clase Gato que hereda de la clase Mascotas.
public class Gato extends Mascota {

	//Variable de la clase gato.
	protected boolean estaMaullando;

	//constructor con par�metros y sin par�metros.
	public Gato(int edad, String nombre, boolean estaMaullando) {
		super(edad, nombre);
		this.estaMaullando = estaMaullando;
	}
	
	public Gato() {
		
	}

	//M�todo Get y set de las variables.
	public boolean isEstaMaullando() {
		return estaMaullando;
	}

	public void setEstaMaullando(boolean estaMaullando) {
		this.estaMaullando = estaMaullando;
	}
	//M�todo toString, con este m�todo y el resto de m�todos toString trabajamos (Polimorfismo).	
	@Override
	public String toString() {
		return "Gato [estaMaullando=" + estaMaullando + ", edad=" + edad + ", Nombre=" + Nombre + "]";
	}
	
	
	
	
	
	
}
