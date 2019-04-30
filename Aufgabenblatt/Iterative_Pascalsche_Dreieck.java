package Aufgabenblatt;

import Main.Dreieck;

public class Iterative_Pascalsche_Dreieck extends Dreieck{
	int[][] triangle = new int[21][21];
	
	
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
		if ((i < 0) || (j < 0) || (i < j)) {
			//COUNT++;
			return 0;
		}
		else if ((i == j) || (j == 0)) {
			triangle[i][j] = 1;
			//COUNT++;
			return triangle[i][j];
		}
		triangle[i][j] = triangle[i - 1][j -1] + triangle[i -1 ][j];
		COUNT+=4;
		return triangle[i][j];
		}


	@Override
	public int[] getRow(int i) {
		// TODO Auto-generated method stub
		return null;
	}
}
