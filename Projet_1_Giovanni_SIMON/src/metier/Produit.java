package metier;

import java.util.ArrayList;
import java.util.List;

public class Produit {

	private int produitID;
	private String nomProduit;
	private double prix;
	private String description;
	private int promo;
	private String categorie;
	private int quantite;
	
	private List<CommandeProduit> commandeProduit = new ArrayList<CommandeProduit>();

	/**
	 * 
	 * @param produitID l'id du produit
	 * @param nomProduit son nom
	 * @param prix son prix
	 * @param description sa description
	 * @param promo sa promo
	 * @param categorie la categorie du produit
	 * @param quantite sa quantite
	 * @param commandeProduit la liste des commandeProduit
	 */
	
	
	public Produit(int produitID, String nomProduit, double prix, String description, int promo, String categorie,
			int quantite, List<CommandeProduit> commandeProduit) {
		super();
		this.produitID = produitID;
		this.nomProduit = nomProduit;
		this.prix = prix;
		this.description = description;
		this.promo = promo;
		this.categorie = categorie;
		this.quantite = quantite;
		this.commandeProduit = commandeProduit;
	}

	public int getProduitID() {
		return produitID;
	}

	public void setProduitID(int produitID) {
		this.produitID = produitID;
	}

	public String getNomProduit() {
		return nomProduit;
	}

	public void setNomProduit(String nomProduit) {
		this.nomProduit = nomProduit;
	}

	public double getPrix() {
		return prix;
	}

	public void setPrix(double prix) {
		this.prix = prix;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getPromo() {
		return promo;
	}

	public void setPromo(int promo) {
		this.promo = promo;
	}

	public String getCategorie() {
		return categorie;
	}

	public void setCategorie(String categorie) {
		this.categorie = categorie;
	}

	public int getQuantite() {
		return quantite;
	}

	public void setQuantite(int quantite) {
		this.quantite = quantite;
	}

	public List<CommandeProduit> getCommandeProduit() {
		return commandeProduit;
	}

	public void setCommandeProduit(List<CommandeProduit> commandeProduit) {
		this.commandeProduit = commandeProduit;
	}

	@Override
	public String toString() {
		return "Produit [produitID=" + produitID + ", nomProduit=" + nomProduit + ", prix=" + prix + ", description="
				+ description + ", promo=" + promo + ", categorie=" + categorie + ", quantite=" + quantite + "]";
	}
	
	
	
}

