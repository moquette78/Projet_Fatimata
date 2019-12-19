package metier;
import java.util.ArrayList;
import java.util.List;

public class Ecole {

	private String nomEcole;
	private String adresseEcole;
	
	private List<Etudiant> etudiants = new ArrayList<Etudiant>();
	
	///////////////////
	
	public Ecole(String nomEcole, String adresseEcole) {
		super();
		this.nomEcole = nomEcole;
		this.adresseEcole = adresseEcole;
	}
	
	@Override
	public String toString() {
		return "Ecole [nomEcole=" + nomEcole + ", adresseEcole=" + adresseEcole + "]";
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
	public String getadresseEcole() {
		return adresseEcole;
	}
	public void setadresseEcole(String adresseEcole) {
		this.adresseEcole = adresseEcole;
	}
	
	public List<Etudiant> listeEtu (){
		
		return this.getEtudiants();
	}
	
	public void addEtudiant(Etudiant e) {
		this.getEtudiants().add(e);
	}
	
}
