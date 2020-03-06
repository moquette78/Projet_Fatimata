package metier;
import interfaces.Isport;

public class Personne implements Isport {

	private String nom;
	
	public Personne(String nom) {
		this.nom=nom;
	}
	
	public void courir() {
		System.out.println("Je m'appelle "+this.nom+" et je cours");
	}
	public void nager() {
		System.out.println("Je m'appelle "+this.nom+" et je nage");
	}
	public void pedaler() {
		System.out.println("Je m'appelle "+this.nom+" et je pedale");
	}
}
