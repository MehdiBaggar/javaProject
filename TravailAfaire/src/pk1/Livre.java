package pk1;

import java.util.Objects;

public class Livre extends Documents {
	private double Prix;
	private int nbrPage;
	private String categorie;
	private String Edition;
	public Livre(String auteur, String titre, int anneePublication, double prix, int nbrPage, String categorie,
			String edition) {
		super(auteur, titre, anneePublication);
		Prix = prix;
		this.nbrPage = nbrPage;
		this.categorie = categorie;
		Edition = edition;
	}
	@Override
	public String toString() {
		return "Livre [Prix=" + Prix + ", nbrPage=" + nbrPage + ", categorie=" + categorie + ", Edition=" + Edition
				+ "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(Edition, Prix, categorie, nbrPage);
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Livre other = (Livre) obj;
		return Objects.equals(Edition, other.Edition)
				&& Double.doubleToLongBits(Prix) == Double.doubleToLongBits(other.Prix)
				&& Objects.equals(categorie, other.categorie) && nbrPage == other.nbrPage;
	}
	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}
	
	

}
