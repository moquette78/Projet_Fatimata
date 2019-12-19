
public class Etudiant {

	private int numEtudiant;
	private String prenomEtudiant;
	private int nomEtudiant;
	
	private Ecole ecole;
	
	/////////////////////////:
	
	public int getNumEtudiant() {
		return numEtudiant;
	}
	public void setNumEtudiant(int numEtudiant) {
		this.numEtudiant = numEtudiant;
	}
	public String getPrenomEtudiant() {
		return prenomEtudiant;
	}
	public void setPrenomEtudiant(String prenomEtudiant) {
		this.prenomEtudiant = prenomEtudiant;
	}
	public int getNomEtudiant() {
		return nomEtudiant;
	}
	public void setNomEtudiant(int nomEtudiant) {
		this.nomEtudiant = nomEtudiant;
	}
	
	public Etudiant(int numEtudiant, String prenomEtudiant, int nomEtudiant) {
		super();
		this.numEtudiant = numEtudiant;
		this.prenomEtudiant = prenomEtudiant;
		this.nomEtudiant = nomEtudiant;
	}
	
	public String faireExamen() {
		
		return "Vous faites un examen à" + this.ecole;
		
	}
	
	public boolean inscrire() {
		for 
	}
	
	
	
	
}
