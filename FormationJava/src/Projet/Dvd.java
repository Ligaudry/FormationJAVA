package Projet;

public class Dvd extends Media {
	
	private Director director;
	private double VATPrice;

	public Director getDirector() {
		return director;
	}

	public void setDirector(Director director) {
		this.director = director;
	}
	
	@Override
	public double getVATPrice(){
		return getPrice()*1.2;
	}
	

}

	
	