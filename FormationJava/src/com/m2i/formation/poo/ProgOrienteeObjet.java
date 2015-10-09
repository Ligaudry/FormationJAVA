package com.m2i.formation.poo;

import Projet.Author;
import Projet.Publisher;

public class ProgOrienteeObjet {

	public static void main(String[] args) {
		
		Book l1 = new Book();
		l1.setTitle("As I lay dying");
		Book l2 =new Book();
		l2.setTitle("claire");
		
		Publisher p1 = new Publisher();
		p1.setCorporateName("Folio");
		
		Author a1;
		a1.setFirstName("William");
		a1.setLastName("Faulkner");
		
		l1.setEditeur(p1);
		l1.setAuteurs(a1);
	
	}

}
