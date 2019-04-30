package Aufgabenblatt;

import Main.Dreieck;

public class Rekusive_Pascalsche_Dreieck extends  Dreieck{
	
	
	
	@Override
	public long binomialCoef(int i, int j) {
		if ((i < 0) || (j < 0) || (i < j)) {
			COUNT++;
			return 0;
		}
		else if ((i == j) || (j == 0)) {
			COUNT++;
			return 1;
		}
		COUNT++;
		return binomialCoef(i - 1, j - 1) + binomialCoef(i - 1, j);
		
	}
	

	@Override
	public long faktoriel(int i) {
		COUNT++;
		if(i!= 0){
			return i* faktoriel(i-1);
		}
		return 1;
	}


	@Override
	public int[] getRow(int i) {
		// TODO Auto-generated method stub
		return null;
	}
}