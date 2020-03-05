package metier;

import interfaces.Isport;

public class Fati implements Isport {
	
	private String nom;
	
	public Fati(String nom) {
		this.nom=nom;
		
	}

	public void courir() {
		System.out.println("Je m'appelle "+this.nom+" et je cours");
	}
	
	public void nager() {
		System.out.println("Je m'appelle "+this.nom+" et je nage");
	}
}
