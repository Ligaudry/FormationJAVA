package Projet;

public class Cd extends Media {
	
	private String producer;
	private int nBtrack;
	private String langage;
	private Artist[ ] artists = new Artist[10];
	private int nbArtist;
	private String band;
	private double VATPrice;
	
	public String getBand() {
		return band;
	}
	public void setBand(String band) {
		this.band = band;
	}
	public String getProducer() {
		return producer;
	}
	public void setProducer(String producer) {
		this.producer = producer;
	}
	public int getnBtrack() {
		return nBtrack;
	}
	public void setnBtrack(int nBtrack) {
		this.nBtrack = nBtrack;
	}
	public String getLangage() {
		return langage;
	}
	public void setLangage(String langage) {
		this.langage = langage;
	}
	public Artist[] getArtists() {
		return artists;
	}
	
	public void addArtist(Artist a){
		artists[nbArtist]=a;
		nbArtist++;
		
	}
	
	@Override
	public double getVATPrice(){
		return getPrice()*1.2;
	}
	
	

}
