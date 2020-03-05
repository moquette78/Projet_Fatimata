package metier;

import java.util.ArrayList;
import java.util.List;

public class Ecole {

	private String nomEc;
	private String adresseEc;
	private List<Etudiant> etudiants = new ArrayList<Etudiant>();
		
	public Ecole(String nomEc, String adresseEc) {
		this.nomEc = nomEc;
		this.adresseEc = adresseEc;
	}

	public String getNomEc() {
		return nomEc;
	}

	public void setNomEc(String nomEc) {
		this.nomEc = nomEc;
	}

	public String getAdresseEc() {
		return adresseEc;
	}

	public void setAdresseEc(String adresseEc) {
		this.adresseEc = adresseEc;
	}
	
	public List<Etudiant> getEtudiants() {
		return etudiants;
	}

	public void setEtudiants(List<Etudiant> etudiants) {
		this.etudiants = etudiants;
	}

	@Override
	public String toString() {
		return "Ecole [nomEc=" + nomEc + ", adresseEc=" + adresseEc + "]";
	}
}
