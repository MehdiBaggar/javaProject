package pk1;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class TabDocument {
	private Documents[] tab  = new Documents[5];
	public TabDocument() {
		tab[0] = new Livre("Auteur1", "Titre1", 2020, 29.99, 300, "Roman", "Edition1");
        tab[1] = new Livre("Auteur2", "Titre2", 2018, 19.99, 250, "Science-fiction", "Edition2");
        tab[2] = new Documents("Auteur3", "Titre3", 2015);
        tab[3] = new Documents("Auteur4", "Titre4", 2017);
 }
	public void trierTableau() {
        if (tab != null && tab.length > 1) {
            Arrays.sort(tab);
        }
    }
	public void ajouterElement(Documents d) {
		Documents[] tab1 =Arrays.copyOf(tab, tab.length+1);
		tab1[tab1.length-1]=d;
		tab=tab1;
	}
	public void supprimerLivre(Livre livre) {
        for (int i = 0; i < tab.length; i++) {
            if (tab[i] instanceof Livre && tab[i].equals(livre)) {
                if (i < tab.length - 1) {
                    System.arraycopy(tab, i + 1, tab, i, tab.length - 1 - i);
                }
                tab = Arrays.copyOf(tab, tab.length - 1);
                System.out.println("Livre supprimé avec succès.");
                return;
            }
        }

        System.out.println("Le livre spécifié n'a pas été trouvé dans le tableau.");
    }
	 public int nombreElements() {
	        return tab.length;
	    }
	 public void inverserOrdre() {
	        List<Documents> liste = Arrays.asList(tab);
	        Collections.reverse(liste);
	        tab = liste.toArray(new Documents[0]);
	    }
	 public void afficherElements() {
	        for (Documents document : tab) {
	            System.out.println(document);
	        }
	    }
	 public Documents getElementLePlusGrand() {
	        List<Documents> liste = Arrays.asList(tab);
	        return Collections.max(liste);
	    }
	 public boolean estEgal(TabDocument autreTabDocument) {
	        return Arrays.equals(this.tab, autreTabDocument.tab);
	    }


}
