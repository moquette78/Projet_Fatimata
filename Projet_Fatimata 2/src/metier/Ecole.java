package metier;
import java.util.ArrayList;
import java.util.List;

public class Ecole {

	private String nomEcole;
	private String adresse;
	
	private List<Etudiant> etudiants = new ArrayList<Etudiant>();
	
	///////////////////
	
	public Ecole(String nomEcole, String adresse) {
		super();
		this.nomEcole = nomEcole;
		this.adresse = adresse;
	}
	
	@Override
	public String toString() {
		return "Ecole [nomEcole=" + nomEcole + ", adresse=" + adresse + "]";
	}

	public String getNomEcole() {
		return nomEcole;
	}
	
	public List<Etudiant> getEtudiants() {
		return etudiants;
	}
	public void setEtudiants(List<Etudiant> etudiants) {
		this.etudiants = etudiants;
	}
	public void setNomEcole(String nomEcole) {
		this.nomEcole = nomEcole;
	}
	public String getAdresse() {
		return adresse;
	}
	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}
	
	public List<Etudiant> listeEtu (){
		
		return this.getEtudiants();
	}
	
	public void addEtudiant(Etudiant e) {
		this.getEtudiants().add(e);
	}
	
}
