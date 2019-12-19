package metier;
public class Etudiant {

	private String numEtudiant;
	private String prenomEtudiant;
	private String nomEtudiant;
	
	private Ecole ecole;
	
	/////////////////////////:
	
	public Etudiant(String numEtudiant, String prenomEtudiant, String nomEtudiant,Ecole ecole) {
		super();
		this.numEtudiant = numEtudiant;
		this.prenomEtudiant = prenomEtudiant;
		this.nomEtudiant = nomEtudiant;
		this.ecole = ecole;
	}
	
	public String getNumEtudiant() {
		return numEtudiant;
	}
	public Ecole getEcole() {
		return ecole;
	}
	public void setEcole(Ecole ecole) {
		this.ecole = ecole;
	}
	public void setNumEtudiant(String numEtudiant) {
		this.numEtudiant = numEtudiant;
	}
	public String getPrenomEtudiant() {
		return prenomEtudiant;
	}
	public void setPrenomEtudiant(String prenomEtudiant) {
		this.prenomEtudiant = prenomEtudiant;
	}
	public String getNomEtudiant() {
		return nomEtudiant;
	}
	public void setNomEtudiant(String nomEtudiant) {
		this.nomEtudiant = nomEtudiant;
	}
	
	@Override
	public String toString() {
		return "Etudiant [numEtudiant=" + numEtudiant + ", prenomEtudiant=" + prenomEtudiant + ", nomEtudiant="
				+ nomEtudiant + "]";
	}
	
	
	
	
	public String faireExamen() {
		
		return "Vous faites un examen à " + this.getEcole().getNomEcole();
		
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
