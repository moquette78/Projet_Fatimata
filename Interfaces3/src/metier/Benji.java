package metier;

import interfaces.Ijeu;

public class Benji extends Personne implements Ijeu{
	
	public Benji(String nom) {
		super(nom);
	}
	
	public void jouer(String jeu) {
		System.out.println("Je joue à "+jeu);
	}

}