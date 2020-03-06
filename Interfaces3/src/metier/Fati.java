package metier;
import interfaces.Imanga;

public class Fati extends Personne implements Imanga {
	
	public Fati(String nom) {
		super(nom);
	}
	
	public void lireManga(String manga) {
		System.out.println("Je lis "+manga);
	}

}
