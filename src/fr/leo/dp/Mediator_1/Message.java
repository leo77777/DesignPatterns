	package fr.leo.dp.Mediator_1;
	
	public class Message {
		private String contenu;
		private String expediteur;
		private String destinataire;
	
		protected Message(String contenu, String expediteur, String destinataire) {
			super();
			this.contenu = contenu;
			this.expediteur = expediteur;
			this.destinataire = destinataire;
		}
	
		protected Message(String contenu, String dest) {
			super();
			this.contenu = contenu;
			this.destinataire = dest;
		}
	
		protected Message() {
			super();
		}
	
		public String getContenu() {
			return contenu;
		}
	
		public void setContenu(String contenu) {
			this.contenu = contenu;
		}
	
		public String getExpediteur() {
			return expediteur;
		}
	
		public void setExpediteur(String expediteur) {
			this.expediteur = expediteur;
		}
	
		public String getDestinataire() {
			return destinataire;
		}
	
		public void setDestinataire(String destinataire) {
			this.destinataire = destinataire;
		}
	
		@Override
		public String toString() {
			return "Message [contenu=" + contenu + ", expediteur=" + expediteur + ", destinataire=" + destinataire + "]";
		}
	}
