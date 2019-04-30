
package Aufgabenblatt;

import Main.Dreieck;

public class Pascalsche_Dreieck extends Dreieck {

	@Override
	public long binomialCoef(int i, int j) {		
		long coef=1;
		if (j==0){
			coef = 1;
			COUNT++;
			return coef;
		}
		if (i<j){
			coef=0;
			COUNT++;
			return coef;
		}
		if(2*j >i){
			j=i-j;
			COUNT++;
		}
		
		for(int n=1; n<=j; n++){
			coef = coef * (i-j+n) /n;
			COUNT++;
		}
					
		return coef;
	}

	@Override
	public long faktoriel(int i) {
		// TODO Auto-generated method stub
		return 0;
	}

}
