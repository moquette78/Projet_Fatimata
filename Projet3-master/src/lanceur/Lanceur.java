package lanceur;

import metier.Ecole;
import metier.Etudiant;
import java.util.List;
import java.util.ArrayList;

public class Lanceur {

	public static void main(String[] args) {
		
		Ecole Ensup = new Ecole("Ensup","Guyancourt");
		Etudiant giovanni = new Etudiant("1","giovanni","simon");
		
		List<Etudiant> liste = new ArrayList<Etudiant>();
		liste.add(giovanni);
		
		System.out.println(giovanni.faireExamen());
		System.out.println(giovanni.inscrire());
		
		System.out.println(Ensup.listerEtudiant());
		

	}

}
