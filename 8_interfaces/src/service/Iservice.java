package service;

import java.util.List;

import metier.Produit;

public interface Iservice {

	public void ajouterProduit(Produit p, String nom, double prix,int quantite);
	public void modifierProduit(Produit p);
	public void supprimerProduit(Produit p);
	public List<Produit> listerTousLesProduits();
}
