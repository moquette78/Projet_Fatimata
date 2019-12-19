
public class Etudiant {

	private int numEtudiant;
	private String prenomEtudiant;
	private int nomEtudiant;
	
	private Ecole ecole;
	
	/////////////////////////:
	
	public int getNumEtudiant() {
		return numEtudiant;
	}
	public Ecole getEcole() {
		return ecole;
	}
	public void setEcole(Ecole ecole) {
		this.ecole = ecole;
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
	
	/**
	 * 
	 * @return true si l'etudiant est inscrit et false sinon
	 */
	public boolean inscrire() {
		for(Etudiant e: this.getEcole().getEtudiants() ){
			if(e.getNumEtudiant()==this.getNumEtudiant()) {
				return true;
			}
			
		}
		return false;
	}
	
	
	
	
}
