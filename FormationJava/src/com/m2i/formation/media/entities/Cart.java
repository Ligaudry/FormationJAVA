package com.m2i.formation.media.entities;

import java.util.*;

/**
 * 
 * @author adminlocal
 *
 */
public class Cart {
	
	private List<Media> medias = new ArrayList<Media>();// je la d�clare et je l'instancie directement; j'ai cr�� la relation 1 n
	/*private double VATPrice;*/ //Cyril ne l'a pas mis ici
	
	/*public void addMedia(Media med){
		medias.add(med);
	}*/ //cette m�thode existe d�j�
	
	public List<Media> getMedias() {
		return medias;
	}
	/**
	 * retourne le prix TTC d'un panier
	 * @return
	 */
	public double getVATPrice() {
		double price = 0;
		for (Media m: medias){
			price = m.getVATPrice() + price;//ou bien : price += m.getVATPrice();
			}
		return price;

	}
	
}


	