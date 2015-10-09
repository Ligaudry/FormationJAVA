package com.m2i.formation.introduction;

public class Hello {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello world");
	
	int i=10;
	int j=20;
	int u=0;
	System.out.println(i);
	System.out.println(j);
	
	u=j;
	j=i;
	i=u;
	
	System.out.println(i);
	System.out.println(j);
	

	
	int chiffre=0;
	while (chiffre<100){
		System.out.print(chiffre+" ");
		chiffre=chiffre+1;
			}
	
	int nombre=11;// afficher 10 9 8 7 .... 1 BOOM
	for (int n=1; n<=10;n++){
		nombre=nombre-1;
		System.out.print(nombre+" ");
	}
	System.out.println("BOOM");
	
	int puissance=1;//afficher les puissances sans utiliser l'opérateur puissance
	System.out.println("puissances de 2");
	while (puissance<1024){
		puissance=2*puissance;
		System.out.print(puissance+" ");
	}
	
	System.out.println("chiffres premiers inférieurs à 500 / essayer 50 premiers chiffres premiers");//problème à trois niveaux de structures !
	
	for (int e=0; e<50;e++){
		int toTest = 2;
		for(i=0;i<500;i++) {
		boolean isPrime = true;
		j=2;
		while(isPrime &&j<toTest) {
			if(toTest%j ==0){
				isPrime = false;			
			}
			j++;
		}
		if (isPrime){
			System.out.println(toTest);
		}
		toTest++;
		
		}
		System.out.println("Test add");
		int result = add(2,3);
		System.out.println(result);
		System.out.println(add(4,6));
	}
	}
/**
 * Fonction add
 * @param x premier opérande
 * @param y deuxième opérande
 * @return addition des deux opérandes
 */
	public static int add(int x,int y){
	return x + y;
	}

}
		

                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                         