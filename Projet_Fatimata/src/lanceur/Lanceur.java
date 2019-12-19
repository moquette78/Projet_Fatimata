package lanceur;

import metier.Ecole;
import metier.Etudiant;


public class Lanceur {

	public static void main(String[] args) {
		
		Ecole Ensup = new Ecole("Ensup","Guyancourt");
		Etudiant giovanni = new Etudiant(1,"giovanni","simon",Ensup);
		
		Ensup.addEtudiant(giovanni);
		System.out.println(giovanni.faireExamen());
		System.out.print(giovanni.inscrire());
		

	}

}
