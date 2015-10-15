package Cellule;

import java.util.*;

public class Cell {

	private List<DNA> chromosomes = new ArrayList<DNA>();
	private List<RNA> rnas = new ArrayList<RNA>();
	private List<Protein> proteins = new ArrayList<Protein>();
	
	public List<DNA> getChromosomes() {
		return chromosomes;
	}
	public List<RNA> getRnas() {
		return rnas;
	}
	public List<Protein> getProteins() {
		return proteins;
	}
		
	
}
