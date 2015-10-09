package com.m2i.formation.poo;

public class Point {

	int x;
	int y;
	
	public void deplacer(int newx, int newy){
		x=newx;
		y=newy;
	}
	
	public void afficher(){
		System.out.println("("+x+";"+y+")");
	}
}

