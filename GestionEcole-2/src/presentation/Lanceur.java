package presentation;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import metier.Ecole;
import metier.Etudiant;

public class Lanceur {

	public static void main(String[] args) {
		// deux etudiants
		HashMap<String, Etudiant> map = new HashMap<String, Etudiant>();
		
		Etudiant etudiant = new Etudiant("1", "BA", "Fatima");
		Etudiant etudiant2 = new Etudiant("2", "DANON", "Kodzo");
		System.out.println(etudiant.toString());
		System.out.println(etudiant2.toString());
		
		
		//inscrire
		
		// faire examen
		System.out.println(etudiant.faireExamen());
		
		//  �coles
		
		Ecole ecole = new Ecole("Ensup", "Guyancourt");
		etudiant.inscrire();
		ecole.inscription(map,etudiant);
		
		
		List<Etudiant> listetu = ecole.listeEtudiants(map);
		System.out.println("etudiant inscrit � l'ecole " +ecole.getNomEcole());
		System.out.println(listetu.toString());
		//
		//ecole.listeEtudiants(etudiant2);
		//ecole.listeEtudiants(etudiant);
		//listetu.add(etudiant2);
		//listetu.add(etudiant);
		
		//ecol
		//etudiant2.inscrire();
		
		//System.out.println(ecole.listeE));
		
		// 
		
		
	}

}
