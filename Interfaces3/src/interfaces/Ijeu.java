package interfaces;

public interface Ijeu {
	
	abstract void jouer(String jeu);
	
	default void etreAddict(String jeu) {
		System.out.println("Je suis accro a "+jeu);
	}

}
