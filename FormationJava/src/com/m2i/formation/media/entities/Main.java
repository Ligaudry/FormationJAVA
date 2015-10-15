package com.m2i.formation.media.entities;

import com.m2i.formation.media.repositories.BookRepository;

public class Main {
	
	/*public static void display(Author[] tab) {
		for (int i=0; i<tab.length; i++){
	System.out.print(tab[i]+" ");
		}
	}*/

	public static void main(String[] args) {
		
		Book b1 = new Book();
		b1.setTitle("cristaline");
		System.out.println(b1.getTitle());
		b1.setId(456);
		b1.setIsbn("0021");
		b1.setLang("fr-FR");
		b1.setPrice(17.5);
		
		Book b2 = new Book();
		b2.setTitle("Madame Bovary");
		System.out.println(b2.getTitle());
		b2.setId(751);
		System.out.println(b2.getId());
		b2.setIsbn("00325");
		b2.setLang("fr-FR");
		System.out.println(b2.getLang());
		b2.setPrice (45.0);
		System.out.println(b2.getPrice()+"€");
		
		//céer un objet edit qui appartient à la classe Publisher 
		/*Publisher edit1 = new Publisher();
		edit1.setCity("Lyon");
		edit1.setCorporateName("Les Editions de Minuit");
		
		
		b1.setEditeur(edit1);
		System.out.println(b1.getTitle());
		System.out.println(b1.getEditeur().getCity());
		System.out.println(b1.getEditeur().getCorporateName());*/
		
		Publisher edit2 = new Publisher();
		edit2.setCity("Orléans");
		edit2.setCorporateName("Gallimard");
		System.out.println(b2.getTitle());
		b2.setEditeur(edit2);
		System.out.println(b2.getEditeur().getCity());
		System.out.println(b2.getEditeur().getCorporateName());
		
		// créer une instance qui appartient à la classe Book,
		//créer une instance qui appartient à la classe Publisher
		//créer une instance qui appartient à la classe Author
		Book livre1 = new Book();
		Publisher edit1 = new Publisher();
		Author auteur1 = new Author();
		auteur1.setFirstName("William");
		auteur1.setLastName("Faulkner");
		Author auteur2 = new Author();
		auteur2.setFirstName("John");
		auteur2.setLastName("Steinbeck");
		// remplir le livre1, l'edit1 et le groupe1
		
		livre1.setTitle("Les feux de l'été");
		edit1.setCorporateName("Folio");
	
			
		// "lier" le livre1, l'edit1, et le groupe1
		/*livre1.setEditeur(edit1);
		try {
			livre1.addAuthor(auteur1);
		} catch (MediaException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			livre1.addAuthor(auteur2);
		} catch (MediaException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
		
		/*System.out.println(livre1.getEditeur().getCorporateName());
		System.out.println(livre1.getTitle());
		/*display(livre1.getAuteurs());
		livre1.setCategory(BookCategory.SF);*/
		
		Dvd dvd1 = new Dvd();
		Director realisateur1 = new Director();
		realisateur1.setFirstName("Ken");
		realisateur1.setLastName("Loach");
		dvd1.setDirector(realisateur1);
		
		Cd cd1 = new Cd();
		Artist art1 = new Artist();
		Artist art2 = new Artist();
		Artist art3 = new Artist();
		art1.setFirstName("Kevin");
		art1.setLastName("Parker");
		art2.setFirstName("Dominic");
		art2.setLastName("Simper");
		art3.setFirstName("Jay");
		art3.setLastName("Watson");
		cd1.setTitle("Innerspeaker");
		cd1.addArtist(art1);
		cd1.addArtist(art2);
		cd1.addArtist(art3);
		cd1.setBand("Tame Impala");

		Media b = new Book();
		Book bTampon = new Book();
		bTampon = (Book)b;
		System.out.println(bTampon.getNbPage());
		
		
		Media cd8 = new Cd();
		
		b.setPrice(10);
		System.out.println(b.getVATPrice());
		cd8.setPrice(15);
		System.out.println(cd8.getVATPrice());
		System.out.println(art1.getFirstName()+" "+art1.getLastName());
		
		Cart cart1 = new Cart();
		
		cart1.getMedias().add(b);
		cart1.getMedias().add(cd8);
		System.out.println(cart1.getVATPrice());
	
		
	}

	BookRepository ber = new BookRepository();
	
	
	
}
