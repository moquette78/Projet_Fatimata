package metier;

public abstract class Compte {

	private int id;
	private float solde;
	
	public abstract float retirer(float montant);
	
}
