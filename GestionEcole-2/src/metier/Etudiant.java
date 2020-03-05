package metier;

public class Etudiant extends Personne{

	public Etudiant(String numPersonne, String nomPersonne, String prenomPersonne) {
		super(numPersonne, nomPersonne, prenomPersonne);
	}

	public String faireExamen() {
		return getNomPersonne() + " a fait un examen" ;
	}
	
	public boolean inscrire() {
		return true;
	}

		
}
