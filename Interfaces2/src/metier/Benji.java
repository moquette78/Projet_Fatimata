package metier;

import interfaces.Isport;

public class Benji implements Isport {
	
	private String nom;
	
	public Benji(String nom) {
		this.nom=nom;
		
	}

	public void courir() {
		System.out.print("Je m'appelle "+this.nom+" et je cours");
	}
	
	public void nager() {
		System.out.print("Je m'appelle "+this.nom+" et je nage");
	}
}
