package interfaces;

@FunctionalInterface
public interface Ijeu {
	
	abstract void jouer();
	default void gagner() {
			System.out.print("ok");
	}	
	
	//ne marche pas car interface fonctionnelle donc une seul methode abstraite
	
	//abstract void perdre();

}
