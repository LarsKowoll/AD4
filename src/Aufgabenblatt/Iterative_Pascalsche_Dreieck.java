package Aufgabenblatt;

import Main.Dreieck;

public class Iterative_Pascalsche_Dreieck extends Dreieck{
	
	
	@Override
	public long faktoriel(int i) {
		long tmp=1;
		
		for(int n=1; n<=i; n++){
			COUNT++;
			tmp *= n;
		}
		return tmp;
	}
	
	
	@Override
	public long binomialCoef(int i, int j) {
		long coef=0;
		if (j == 0 || j == i ){
			coef = 1;
			COUNT++;
		}
		else if (i<j){
			coef=0;
		}
		else{
			coef = faktoriel(i) / (faktoriel(i-j)*faktoriel(j));
		}		
		return coef;
	}
}
