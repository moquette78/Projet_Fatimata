package metier;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Commande {

	private int commandeID;
	private Date dateCommande;
	private String statut;
	private String facture;
	private String bonLivraison;
	
	private Client client;
	private List<CommandeProduit> commandeProduit = new ArrayList<CommandeProduit>();
	
	/**
	 * 
	 * @param commandeID l'id de la commande
	 * @param dateCommande la date de la commande
	 * @param statut son statut
	 * @param facture la facture
	 * @param bonLivraison le bon associe
	 * @param client l'objet client
	 * @param commandeProduit la liste de commandeProduit
	 */
	
	public Commande(int commandeID, Date dateCommande, String statut, String facture, String bonLivraison,
			Client client, List<CommandeProduit> commandeProduit) {
		super();
		this.commandeID = commandeID;
		this.dateCommande = dateCommande;
		this.statut = statut;
		this.facture = facture;
		this.bonLivraison = bonLivraison;
		this.client = client;
		this.commandeProduit = commandeProduit;
	}
	
	public int getCommandeID() {
		return commandeID;
	}
	public void setCommandeID(int commandeID) {
		this.commandeID = commandeID;
	}
	public Date getDateCommande() {
		return dateCommande;
	}
	public void setDateCommande(Date dateCommande) {
		this.dateCommande = dateCommande;
	}
	public String getStatut() {
		return statut;
	}
	public void setStatut(String statut) {
		this.statut = statut;
	}
	public String getFacture() {
		return facture;
	}
	public void setFacture(String facture) {
		this.facture = facture;
	}
	public String getBonLivraison() {
		return bonLivraison;
	}
	public void setBonLivraison(String bonLivraison) {
		this.bonLivraison = bonLivraison;
	}
	public Client getClient() {
		return client;
	}
	public void setClient(Client client) {
		this.client = client;
	}
	public List<CommandeProduit> getCommandeProduit() {
		return commandeProduit;
	}
	public void setCommandeProduit(List<CommandeProduit> commandeProduit) {
		this.commandeProduit = commandeProduit;
	}
	@Override
	public String toString() {
		return "Commande [commandeID=" + commandeID + ", dateCommande=" + dateCommande + ", statut=" + statut
				+ ", facture=" + facture + ", bonLivraison=" + bonLivraison + "]";
	}

	



}
