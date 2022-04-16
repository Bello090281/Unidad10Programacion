/**
 * 
 * @author Bello
 *
 */

//Clase perro,clase quie hereda de la clase mascota.
public class Perro extends Mascota {
	
	//Variable de la clase Perro.
	protected boolean estaLadrando;

	//Constructor con par�metros y sin parametros.
	public Perro(int edad, String nombre, boolean estaLadrando) {
		super(edad, nombre);
		this.estaLadrando = estaLadrando;
	}
	

	public Perro() {
		
	}

	//M�todos get y set d elas variables.
	public boolean isEstaLadrando() {
		return estaLadrando;
	}


	public void setEstaLadrando(boolean estaLadrando) {
		this.estaLadrando = estaLadrando;
	}

	//M�todo toString, con este m�todo y el resto de m�todos toString trabajamos (Polimorfismo).
	@Override
	public String toString() {
		return "Perro [estaLadrando=" + estaLadrando + ", edad=" + edad + ", Nombre=" + Nombre + "]";
	}
	
	
}
