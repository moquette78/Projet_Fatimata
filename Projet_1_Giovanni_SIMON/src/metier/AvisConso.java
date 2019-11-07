package metier;

public class AvisConso {

	
	private int avisConsoId;
	private String commentaire;
	private int note;
	private String nomClient;
	private String prenomClient;

	private Commande commande;

	public int getAvisConsoId() {
		return avisConsoId;
	}

	public void setAvisConsoId(int avisConsoId) {
		this.avisConsoId = avisConsoId;
	}

	public String getCommentaire() {
		return commentaire;
	}

	public void setCommentaire(String commentaire) {
		this.commentaire = commentaire;
	}

	public int getNote() {
		return note;
	}

	public void setNote(int note) {
		this.note = note;
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

	public Commande getCommande() {
		return commande;
	}

	public void setCommande(Commande commande) {
		this.commande = commande;
	}

	@Override
	public String toString() {
		return "AvisConso [avisConsoId=" + avisConsoId + ", commentaire=" + commentaire + ", note=" + note
				+ ", nomClient=" + nomClient + ", prenomClient=" + prenomClient + "]";
	}
	
	
}
