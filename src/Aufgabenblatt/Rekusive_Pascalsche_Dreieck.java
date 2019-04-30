package Aufgabenblatt;

import Main.Dreieck;

public class Rekusive_Pascalsche_Dreieck extends  Dreieck{
	
	
	
	@Override
	public long binomialCoef(int i, int j) {
		if(i < j){
			return 0;
		}
		return faktoriel(i) / (faktoriel(j)*faktoriel(i-j));
	}
	

	@Override
	public long faktoriel(int i) {
		COUNT++;
		if(i!= 0){
			return i* faktoriel(i-1);
		}
		return 1;
	}
}