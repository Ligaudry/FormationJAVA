package PackageparDefaut;

import java.io.*;
import java.util.StringTokenizer;

public class TestFile {
	
	public void readFile(String uri ) throws IOException{
	BufferedReader br = new BufferedReader(new FileReader(uri));//créer un objet BufferedReader là ou va être notre fichier à lire
	String line = br.readLine();
	line = br.readLine();
	
	
	while(line!=null) {//tant que ma ligne n'est pas vide
		StringTokenizer st = new StringTokenizer(line,";");
		String author = st.nextToken();
		String title = st.nextToken();
		String publisher = st.nextToken();
		double price = Double.parseDouble(st.nextToken());//caster grace à parse pour transformer le string en double
		String id = st.nextToken();
		System.out.println(author+" "+title+" "+publisher+" "+price+" "+id);
		line=br.readLine();
	}
	br.close();


}
}

