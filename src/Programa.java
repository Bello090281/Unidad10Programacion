

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
/**
 * 
 * @author Bello
 *
 */
public class Programa {

	//Variable ArrayLits donde almacenamos las masotas.
	static ArrayList<Mascota>Animales=new ArrayList <Mascota>();

	//Constructor con parámetros y por defecto.
	public Programa(ArrayList<Mascota> animales) {
		super();
		Animales = animales;
	}

	public Programa() {
	
	}
	
	//Métodos get y set del nuestra variables.
	public ArrayList<Mascota> getAnimales() {
		return Animales;
	}

	public void setAnimales(ArrayList<Mascota> animales) {
		Animales = animales;
	}

	//Método principal, metodo ejecutable d enuestro proyecto.
	public static void main(String[] args) {
		
		
		Programa p = new Programa();
		p.getAnimales().add(new Gato(10,"Clonchete", true));
		p.getAnimales().add(new Perro(1,"Cooper", true));
		p.getAnimales().add(new Perro(2,"Lori", false));
		p.getAnimales().add(new Perro(18,"Berta", true));
		p.getAnimales().add(new Gato(10,"Tina", true));
		p.getAnimales().add(new Gato(10,"leon", false));
		
						
		String nom=p.mayorEdad(p.getAnimales());
		System.out.println("El animal de mayor edad que esta ladrando o maullando es: "+nom);
		
	}

	
	
	//Método que comprueba la edad de las mascotas y si estas están maullando o ladrando.
	public String mayorEdad(ArrayList<Mascota> animales2) {
	
		
		ArrayList<Mascota> animales1=new ArrayList();
		
		// Bucle for donde instanciamos el objeto y comprobamos si la mascota está maullando o ladrando.

		for(int i=0;i<animales2.size();i++) {
			if(animales2.get(i) instanceof Gato) {
				Gato g=(Gato) animales2.get(i);
				if(g.isEstaMaullando()==true) {
					animales1.add(g);
				}
				}else if(animales2.get(i) instanceof Perro) {
					Perro p=(Perro) animales2.get(i);
					if(p.isEstaLadrando()==true) {
					animales1.add(p);}
				}
		}
		
		
		// Bucle for donde comprobamos las edad de las mascotas.
		int edad=animales1.get(0).getEdad();
		String nomb=animales1.get(0).getNombre();
		for(int i=0;i<animales1.size();i++) {
			if(animales1.get(i).getEdad()>edad) {
				edad=animales1.get(i).getEdad();
				nomb=animales1.get(i).getNombre();
			}
		}		
		//Devolvemos el nombre de la mascota que cumpla con todos parámetros que deseamos.
		return nomb;
	}	
}
