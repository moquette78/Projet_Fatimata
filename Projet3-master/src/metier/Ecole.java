package metier;
import java.util.ArrayList;
import java.util.List;

public class Ecole {

	private String nomEcole;
	private String adresseEcole;
	
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
	
	public void setNomEcole(String nomEcole) {
		this.nomEcole = nomEcole;
	}
	public String getadresseEcole() {
		return adresseEcole;
	}
	public void setadresseEcole(String adresseEcole) {
		this.adresseEcole = adresseEcole;
	}
	
	public List<Etudiant> listerEtudiant(){
		List<Etudiant> l = new ArrayList<Etudiant>();
		l.add(new Etudiant("2","gio","simon"));
		l.add(new Etudiant("1","moha","ragued"));
		l.add(new Etudiant("2","youcef","zegour"));
		return l;
	}
	
	
}
