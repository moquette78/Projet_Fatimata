package metier;
public class Etudiant extends Personne {

	
	private String numEtudiant;
	
	//private Ecole ecole;
	
	/////////////////////////:
	
	public Etudiant(String numEtudiant, String prenomEtudiant, String nomEtudiant) {
		super(nomEtudiant,prenomEtudiant);
		this.numEtudiant = nomEtudiant;
		//this.ecole = ecole;
	}
	
	public String getNumEtudiant() {
		return numEtudiant;
	}
	/*public Ecole getEcole() {
		return ecole;
	}
	public void setEcole(Ecole ecole) {
		this.ecole = ecole;
	}*/
	public void setNumEtudiant(String numEtudiant) {
		this.numEtudiant = numEtudiant;
	}
	
	
	@Override
	public String toString() {
		return "Etudiant [numEtudiant=" + numEtudiant + super.toString();
	}
	
	
	
	
	public String faireExamen() {
		
		return "Vous faites un examen ";
		
	}
	
	/**
	 * 
	 * @return true si l'etudiant est inscrit et false sinon
	 */
	public boolean inscrire() {
		/*for(Etudiant e: this.getEcole().getEtudiants() ){
			if(e.getNumEtudiant()==this.getNumEtudiant()) {
				return true;
			}
			
		}
		return false;
	}*/
		
	return true;
	
}
}
