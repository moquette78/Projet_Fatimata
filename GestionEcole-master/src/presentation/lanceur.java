package presentation;

import metier.Ecole;
import metier.Etudiant;

public class lanceur {

	public static void main(String[] args) {
		// deux �tudiants
		
		Etudiant etudiant = new Etudiant(1, "BA", "Fatima");
		Etudiant etudiant2 = new Etudiant(2, "DANON", "Kodzo");
		
		// deux �coles
		
		Ecole ecole = new Ecole("Ensup", "Guyancourt");
		ecole.getEtudiants().add(etudiant);
		ecole.getEtudiants().add(etudiant2);
		// 
		
		System.out.println(ecole.toString());
		System.out.println(etudiant.toString());
		System.out.println(etudiant2.toString());
	}

}
