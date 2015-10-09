package com.m2i.formation.introduction;
import java.util.Random;

import com.m2i.formation.poo.Book;

import Projet.Dvd;
import Projet.Publisher;
import Projet.Artist;
import Projet.Author;
import Projet.BookCategory;
import Projet.Cd;
import Projet.Director;

public class Exercices151006 {
	
	public static int add(int x,int y){
		return x + y;
		}
	public static void display(int[] tab) {
				for (int i=0; i<tab.length; i++){
			System.out.print(tab[i]+" ");
		}
				
	}
	
	public static int sum(int[] tab) {
		int somme=0;
		for (int i=0; i<tab.length; i++){
			somme = somme + tab[i];}
			return somme;
	}
	
	public static int max(int[] tab) {
		int maxi=tab[0];//si la tableau n'a pas de valeur, le code va planter, il faut mieux que ça plante que ça fasse une erreur cachée
		for(int i=1; i<tab.length; i++){//optimisation on démarre à tab[1] car le tab[0] est la valeur de départ
			if (tab[i]>maxi){
				maxi=tab[i];}
			}
		return maxi;
	}
	
	public static float average(int[] tab) {
	float somme = (float)sum(tab);//piège java même type à gauche et à droite de l'opérateur et le résultat c'est le type des opérandes
		return somme/tab.length;

	}
	
	public static void put(int[]tab, int index, int value){
		tab[index]=value;
		//display(tab);//le dispaly n'a pas besoin d'être mis dans la fonction, on peut l'appeler après put() dans le main
		}
	
	public static void permut(int []tab, int index1, int index2){
		int stock=tab[index1];//stock est la variable tampon
		tab[index1]=tab[index2];
		tab[index2]=stock;
		//display(tab);//le dispaly n'a pas besoin d'être mis dans la fonction, on peut l'appeler après put() dans le main
	}
	
	public static void permut2(int[]tab,int index){//permute n avec n-1
		int stock=tab[index-1];
		tab[index-1]=tab[index];
		tab[index]=stock;
		//display (tab);//le dispaly n'a pas besoin d'être mis dans la fonction, on peut l'appeler après put() dans le main
	}
	/*ou bien réutiliser la fonction permut créée
	
	public static void permut3(int[]tab, int index){
		permut(tab,index,index-1);
	}*/
	
	public static void remove(int[] tab,int index){//sans tenir compte de la dernière valeur
	int i=index;
	for (i=index; i<tab.length-1; i++){//toujours tester le cas limite c'est pourquoi <tab.length-1
		tab[i]=tab[i+1];
		}
		//display(tab);
	}
	
	public static void insert(int[]tab, int index, int value){//sans tenir compte de la perte de la dernière valeur
		for (int i=tab.length-1; i>index; i--){
			tab[i]=tab[i-1];
			}
			tab[index]=value;//ou bien utiliser put
	
		//display(tab);
	}
	
	public static int[] clone(int[] tab){
		int [] tab2= new int[tab.length];
		for (int i=0; i<tab.length; i++){
			tab2[i]=tab[i];
		}
		return tab2;
	}
	
	public static int [] even(int[] tab){
		int[] tab2 = new int[tab.length];//difficile aujourd'hui de connaître la taille exacte du futur tableau, par facilité on lui donne la même taille
		int i2=0;//pour rassembler les zéros à la fin
		for(int i=0; i<tab.length; i++){
			if(tab[i]%2==0){
				tab2[i2]=tab[i];
				i2++;
			}
		}
		return tab2;
		
	}
	
	public static int[] inverse(int[] tab){
		int[] tab2 = new int[tab.length];
		for (int i=0;i<tab.length; i++){
			tab2[i]=tab[tab.length-1-i];
		}
			return tab2;
	}
	
	public static int[] remove2(int[] tab, int index){
		int[] tab2 = new int[tab.length-1];
		for (int j=0; j<index; j++){
			tab2[j]=tab[j];
		}
		for (int i=index; i<tab.length-1; i++ ){
			tab2[i]=tab[i+1];
			
		}
		return tab2;
	}
	
	public static int[] createRandomlyTab(int length) {
		int[] tab = new int[length];
		Random rnd = new Random();
		
		for(int i=0;i<tab.length;i++) {
			tab[i] = rnd.nextInt(100);
		}
		return tab;
	}
	
public static int[] insert2(int[] tab, int index, int value){
	int[] tab2 = new int [tab.length+1];
	for (int i=0; i<tab.length+1; i++){
		if (i<index){
			tab2[i]=tab[i];}
		else {
			tab2[i]=tab[i-1];
		}
	}
	tab2[index]=value;
	return tab2;
	
}
	
public static void triBulle(int[] tab){//method triBulle qui classe un tableau min au max
	for (int j=tab.length-1; j>0; j--){
		for (int i=0; i<j; i++){
			if(tab[i]>tab[i+1]){
				permut2(tab, (i+1));
			}
		}
	}
}

	public static void main(String[] args) {
		int [] tab = {1,2,3,4,5,6,23,8,9,10};
		display(tab);
		System.out.println("la somme des valeurs du tableau est "+sum(tab));
		System.out.println ("la valeur maximale du tableau est "+max(tab));
		System.out.println ("la moyenne des valeurs du tableau est "+average(tab));
		put(tab,3,99);
		display(tab);
		System.out.println();
		permut(tab,1,3);
		display(tab);
		System.out.println();
		permut2(tab,5);
		display(tab);
		System.out.println();
		remove(tab,1);
		display(tab);
		System.out.println();
		insert(tab,2,87);
		display(tab);
		System.out.println();
		display(clone(tab));
		System.out.println();
		display(even(tab));
		System.out.println();
		display(inverse(tab));
		System.out.println();
		display (tab);
		System.out.println();
		display(remove2(tab,3));
		System.out.println();
		display(insert2(tab,3,66));
		
		Book b = new Book();
		b.setTitle("Java");
		System.out.println(b.getTitle());
		
		//Créer deux Book différents
		
		Book b1 = new Book();
		b1.setTitle("cristaline");
		System.out.println(b1.getTitle());
		b1.setId(456);
		b1.setIsbn("0021");
		b1.setLang("fr-FR");
		b1.setNbPage(210);
		b1.setPrice(17.5);
		
		Book b2 = new Book();
		b2.setTitle("Madame Bovary");
		System.out.println(b2.getTitle());
		b2.setId(751);
		System.out.println(b2.getId());
		b2.setIsbn("00325");
		b2.setLang("fr-FR");
		System.out.println(b2.getLang());
		b2.setNbPage(110);
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
		livre1.setEditeur(edit1);
		livre1.addAuthor(auteur1);
		livre1.addAuthor(auteur2);
		System.out.println(livre1.getEditeur().getCorporateName());
		System.out.println(livre1.getTitle());
		System.out.println(livre1.getAuteurs());
		livre1.setCategory(BookCategory.SF);
		
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
		
		
		
		
		
			
		
		
		
		/*System.out.println(Counter.increment());
		System.out.println(count1.increment());
		System.out.println(count1.increment());
		Counter count2= new Counter();
		System.out.println(count2.increment());
		System.out.println(count2.increment());
		System.out.println(count2.increment());*/
		
		
		
		
		
		
		
		/*Book b3 = b1;
		
		if (b1==b3){
			System.out.println(b1+"est identique à "+b3);
		}
		else {System.out.println(b1+" différent de "+b3);*/
		
		
		
		
		
		
				
		
		

	}
	
	/*public static int[] createRandomlyTab(int length) {
		int [ ] tab=new int[length];
		Random rnd = new Random ()
		for (i=0; i<tab.length; i++) {
			tab [i] =
		}*/
	}


	



