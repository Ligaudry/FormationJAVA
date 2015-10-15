package PackageparDefaut;

import java.util.*;

import com.m2i.formation.media.entities.Book;




public class CollectionTest {

		
	public List<Book> listTest(List <Book> list, Book b1, Book b2, Book b3, Book b4 ){
		list.add(b1);
		list.add(b2);
		list.add(b3);
		list.add(1,b4);
		list.remove(2);
		
		return list;
		
	}
	
	public Set<Book> setTest(Set <Book> set, Book b1, Book b2, Book b3, Book b4){
		
		set.add(b1);
		set.add(b2);
		set.add(b3);
		
		return set;
	}
	
	/*public Map<Integer, Book> mapTest(){
		Map<int, Book> m = new HashMap<int, Book>();
		
	}*/


}
	
		
		
		
		
		 
		


