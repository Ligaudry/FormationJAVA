package Cellule;

import java.util.*;

public class DNA extends Strand {
	
	
	private List<DNABase> dnaBases = new ArrayList<DNABase>();

	public List<DNABase> getDnaBases() {
		return dnaBases;
	}

	public void setDnaBases(List<DNABase> dnaBases) {
		this.dnaBases = dnaBases;
	}
	
	
}
