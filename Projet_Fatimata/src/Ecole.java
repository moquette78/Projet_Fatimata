import java.util.ArrayList;
import java.util.List;

public class Ecole {

	private String nomEcole;
	private String adresse;
	
	private List<Etudiant> etudiants = new ArrayList<Etudiant>();
	
	///////////////////
	
	public String getNomEcole() {
		return nomEcole;
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
	
	public ArrayList<Etudiant> listeEtu (){
		
		return this.etudiants;
	}
	
	
}
