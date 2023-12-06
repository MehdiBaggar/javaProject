package pk1;

import java.util.Objects;

public class Documents implements Comparable<Documents> {
	private String auteur;
	private String titre;
	private int anneePublication;
	public Documents(String auteur, String titre, int anneePublication) {
		super();
		this.auteur = auteur;
		this.titre = titre;
		this.anneePublication = anneePublication;
	}
	@Override
	public String toString() {
		return "Documents [auteur=" + auteur + ", titre=" + titre + ", anneePublication=" + anneePublication + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(anneePublication, auteur, titre);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Documents other = (Documents) obj;
		return anneePublication == other.anneePublication && Objects.equals(auteur, other.auteur)
				&& Objects.equals(titre, other.titre);
	}
	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}
	@Override
	public int compareTo(Documents o) {
		// TODO Auto-generated method stub
		return 0;
	}
	
    
    

}
