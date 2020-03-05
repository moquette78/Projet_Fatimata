package metier;

public class Personne {
	
	private String nomEtudiant;
	private String prenomEtudiant;
	
	public Personne(String nomEtudiant, String prenomEtudiant) {
		super();
		this.nomEtudiant = nomEtudiant;
		this.prenomEtudiant = prenomEtudiant;
	}

	public String getNomEtudiant() {
		return nomEtudiant;
	}

	public void setNomEtudiant(String nomEtudiant) {
		this.nomEtudiant = nomEtudiant;
	}

	public String getPrenomEtudiant() {
		return prenomEtudiant;
	}

	public void setPrenomEtudiant(String prenomEtudiant) {
		this.prenomEtudiant = prenomEtudiant;
	}

	@Override
	public String toString() {
		return "[nomEtudiant=" + nomEtudiant + ", prenomEtudiant=" + prenomEtudiant + "]";
	}
	
	
	
	

}
