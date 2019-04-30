
package Aufgabenblatt;

import Main.Dreieck;

public class Pascalsche_Dreieck extends Dreieck {
	
	long[][] triangle = new long[21][21];
	
	@Override
	public long binomialCoef(int i, int j) {	
		long coef=1;
		if (j==0){
			coef = 1;
			//COUNT++;
			
			triangle[i][j] = coef;
			//System.out.println(toString());
			return coef;
		}
		if (i<j){
			coef=0;
			//COUNT++;
			triangle[i][j] = coef;
			//System.out.println(toString());
			return coef;
		}
		if(2*j >i){
			coef = triangle[i][i-j];
			triangle[i][j] = coef;
			//j=i-j;
			//System.out.println(toString());
	//		COUNT++;
			return coef;
		}
		
		//for(int n=1; n<=j; n++){
			
	//		coef = triangle[i][j-1] * (i-j+n) /n;
			triangle[i][j] = coef;
		//	COUNT+=4;
		//}
		//System.out.println(toString());
		return coef;
	}
	
	@Override
	public int[] getRow(int n) {
		int[] row = new int[n + 1];
		
		row[0] = 1;
		for (int i = 1; i <= n; i++) {
			if (i > n / 2) {
				row[i] = row[n - i];
				COUNT++;
			}
			else {
				int k = i - 1;
				row[i] = row[i - 1] * (n - k) / (k + 1);
				COUNT+=4;
			}			
		}
		
		return row;
	}
	
	
	@Override
	public long faktoriel(int i) {
		// TODO Auto-generated method stub
		return 0;
	}
	
	public String toString() {
		String output = "";
		for (int i = 0; i < triangle.length; i++) {
			for (int j = 0; j < triangle[0].length; j++) {
				output += triangle[i][j] + " ";
			}
			output += "\n";
		}
		return output;
	}

}
