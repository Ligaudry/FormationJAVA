import java.util.Date;

public class Book {
		private Publisher editeur;//associer une nouvelle variable nommée éditeur (de classe Publisher) à la classe Book
		private String title;
		private int id;
		private Date date;
		private int nbPage;
		private String isbn;
		private double price; //en général pas géré ici, trop variable
		private String lang;//code iso pour toutes les langues et les régions de la planète
		private Author[] auteurs = new Author[10];
		private int nbAut=0;//ici pas nécessaire
		
		public String getTitle() {
			return title;
		}
		public double getPrice() {
			return price;
		}
		public void setPrice(double price) {
			this.price = price;
		}
		public String getLang() {
			return lang;
		}
		public void setLang(String lang) {
			this.lang = lang;
		}
		public void setTitle(String title) {
			this.title = title;
		}
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public Date getDate() {
			return date;
		}
		public void setDate(Date date) {
			this.date = date;
		}
		public int getNbPage() {
			return nbPage;
		}
		public void setNbPage(int nbPage) {
			this.nbPage = nbPage;
		}
		public String getIsbn() {
			return isbn;
		}
		public void setIsbn(String isbn) {
			this.isbn = isbn;
		}
		public Publisher getEditeur() {
			return editeur;
		}
		public void setEditeur(Publisher editeur) {
			this.editeur = editeur;
		}
		public Author[] getAuteurs() {
			return auteurs;
		}
		
		public int getNbAut() {
			return nbAut;
		}
		public void setNbAut(int nbAut) {
			this.nbAut = nbAut;
		}

		public void addAuthor(Author a){
			auteurs[nbAut++]=a;
		}
			
	
		 
 }



