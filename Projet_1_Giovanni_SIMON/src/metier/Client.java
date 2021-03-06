package metier;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Client {

	private int clientID;
	private String login;
	private String mdp;
	private String nomClient;
	private String prenomClient;
	private String adresse;
	private Date dateNaissance;
	private String mail;
	private String rang;
	private String paiement;
	
	private List<Commande> commandes= new ArrayList<Commande>();
	
	

	public Client(int clientID, String login, String mdp, String nomClient, String prenomClient, String adresse,
			Date dateNaissance, String mail, String rang, String paiement, List<Commande> commandes) {
		
		this.clientID = clientID;
		this.login = login;
		this.mdp = mdp;
		this.nomClient = nomClient;
		this.prenomClient = prenomClient;
		this.adresse = adresse;
		this.dateNaissance = dateNaissance;
		this.mail = mail;
		this.rang = rang;
		this.paiement = paiement;
		this.commandes = commandes;
	}

	public int getClientID() {
		return clientID;
	}

	public void setClientID(int clientID) {
		this.clientID = clientID;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getMdp() {
		return mdp;
	}

	public void setMdp(String mdp) {
		this.mdp = mdp;
	}

	public String getNomClient() {
		return nomClient;
	}

	public void setNomClient(String nomClient) {
		this.nomClient = nomClient;
	}

	public String getPrenomClient() {
		return prenomClient;
	}

	public void setPrenomClient(String prenomClient) {
		this.prenomClient = prenomClient;
	}

	public String getAdresse() {
		return adresse;
	}

	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}

	public Date getDateNaissance() {
		return dateNaissance;
	}

	public void setDateNaissance(Date dateNaissance) {
		this.dateNaissance = dateNaissance;
	}

	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	public String getRang() {
		return rang;
	}

	public void setRang(String rang) {
		this.rang = rang;
	}

	public String getPaiement() {
		return paiement;
	}

	public void setPaiement(String paiement) {
		this.paiement = paiement;
	}

	public List<Commande> getCommandes() {
		return commandes;
	}

	public void setCommandes(List<Commande> commandes) {
		this.commandes = commandes;
	}

	@Override
	public String toString() {
		return "Client [clientID=" + clientID + ", login=" + login + ", mdp=" + mdp + ", nomClient=" + nomClient
				+ ", prenomClient=" + prenomClient + ", adresse=" + adresse + ", dateNaissance=" + dateNaissance
				+ ", mail=" + mail + ", rang=" + rang + ", paiement=" + paiement + ", commandes=" + commandes + "]";
	}

	
	
	
}
