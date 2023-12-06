package pk1;
import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

public class ListeDocument {
	 private List<Documents> listeDocuments;
  
	 public ListeDocument() {
        listeDocuments = new ArrayList<>();
    }
	
	 public void ajouterDocument(Documents document) {
	    listeDocuments.add(document);
	}

	 public void afficherListe() {
        for (Documents document : listeDocuments) {
            System.out.println(document);
        }
    }


	 public void parcourirListe() {
	    for (Documents document : listeDocuments) {
    }
}

	 public void insererDocument(int index, Documents document) {
	    listeDocuments.add(index, document);
}

	 public Documents recupererDocument(int index) {
	    return listeDocuments.get(index);
}


	 public void supprimerDocument(Documents document) {
	    listeDocuments.remove(document);
}


	 public boolean rechercherDocument(Documents document) {
	    return listeDocuments.contains(document);
}


	 public void trierListe() {
	    Collections.sort(listeDocuments);
	    }
	
	 public List<Documents> extrairePartie(int debut, int fin) {
	        return new ArrayList<>(listeDocuments.subList(debut, fin));
	    }

	    public boolean comparerListes(List<Documents> autreListe) {
	        return listeDocuments.equals(autreListe);
	    }

	    public void echangerElements(int index1, int index2) {
	        Collections.swap(listeDocuments, index1, index2);
	    }

	    public void viderListe() {
	        listeDocuments.clear();
	    }

	    public boolean estVide() {
	        return listeDocuments.isEmpty();
	    }

}


    
   
