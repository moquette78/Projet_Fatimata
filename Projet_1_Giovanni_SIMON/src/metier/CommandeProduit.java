package metier;

public class CommandeProduit {

	
	private int quantiteProduit;
	private double prixTotal;
	
	private Commande commande;
	private Produit produit;
	
	
	/**
	 * 
	 * @param quantite Produit la quantite de produit desiree
	 * @param prixTotal le prix totale de la commande
	 * @param commande l'objet commande
	 * @param produit l'objet produit
	 */
	
	public CommandeProduit(int quantiteProduit, double prixTotal, Commande commande, Produit produit) {
		super();
		this.quantiteProduit = quantiteProduit;
		this.prixTotal = prixTotal;
		this.commande = commande;
		this.produit = produit;
	}
	public int getQuantiteProduit() {
		return quantiteProduit;
	}
	public void setQuantiteProduit(int quantiteProduit) {
		this.quantiteProduit = quantiteProduit;
	}
	public double getPrixTotal() {
		return prixTotal;
	}
	public void setPrixTotal(double prixTotal) {
		this.prixTotal = prixTotal;
	}
	public Commande getCommande() {
		return commande;
	}
	public void setCommande(Commande commande) {
		this.commande = commande;
	}
	public Produit getProduit() {
		return produit;
	}
	public void setProduit(Produit produit) {
		this.produit = produit;
	}
	@Override
	public String toString() {
		return "CommandeProduit [quantiteProduit=" + quantiteProduit + ", prixTotal=" + prixTotal + "]";
	}
	
	
	
}
