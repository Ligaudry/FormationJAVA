import java.util.Random;

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
		
		
		
				
		
		

	}
	
	/*public static int[] createRandomlyTab(int length) {
		int [ ] tab=new int[length];
		Random rnd = new Random ()
		for (i=0; i<tab.length; i++) {
			tab [i] =
		}*/
	}
	



