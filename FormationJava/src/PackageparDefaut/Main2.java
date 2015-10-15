package PackageparDefaut;

import java.io.IOException;
import com.m2i.formation.media.repositories.BookRepository;


public class Main2 {
	

	public static void main(String[] args) {
		
		
		/*CollectionTest colTest = new CollectionTest ();//déclarer la classe
		
		List<Book> list1 = new ArrayList<Book>();
		
		Book b1 = new Book ();
		b1.setTitle("tot");
		Book b2 = new Book ();
		b2.setTitle("ab");
		Book b3 = new Book ();
		b3.setTitle("cd");
		Book b4 = new Book ();
		b4.setTitle("ef");
		
		colTest.listTest(list1, b1, b2, b3, b4);
		
		System.out.println(list1.get(1).getTitle());
		
		/*for (Book b:list1){
			System.out.print(b.getTitle()+" ");
		}
		
		
		Map<Integer, Book>
		
		
		
	}*/

	/*TestFile tf = new TestFile();
	try {
	tf.readFile("C:\\Users\\adminlocal\\git\\FormationJava\\src\\PackageparDefaut\\listLivre.txt");
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}*/
	
	BookRepository br = new BookRepository();
	br.setUri("C:\\Users\\adminlocal\\git\\FormationJava\\src\\PackageparDefaut\\listLivre.txt");
	try {
		br.getAll();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	try {
		System.out.println(br.getById(5));
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	
}
}
