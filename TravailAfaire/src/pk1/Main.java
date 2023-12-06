package pk1;

class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 ListeDocument maListe = new ListeDocument();

	        alimenterListe(maListe);

	        maListe.afficherListe();

	}


	private static void alimenterListe(ListeDocument maListe) {
	    
		Documents document1 = new Documents("Auteur1", "Titre1", 2020);
	    Documents document2 = new Documents("Auteur2", "Titre2", 2018);
	
	    maListe.ajouterDocument(document1);
	    maListe.ajouterDocument(document2);
	}
}