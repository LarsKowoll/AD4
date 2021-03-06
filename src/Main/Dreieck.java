package Main;

public abstract class Dreieck {
	public static long COUNT = 0;
	
	public void draw(int n){
		COUNT = 0;
		for(int r = 0; r <= n; r++){
			System.out.println();
			for(int j = 0 ; j <= r; j++ ){
				System.out.print( binomialCoef(r,j) + " \t " );
			}
		}
		System.out.println();
		System.out.println("\nFunktionsaufrufe : " + COUNT );
		System.out.println("--------------------------------------------------------------------------------------------------------------------");
		
		
	}
	public long process(int n){
		COUNT = 0;
		for(int r = 0; r <=n; r++){
			for(int j = 0 ; j <= n; j++ ){
				binomialCoef(r,j);
			}
		}
		return COUNT;
		
	}
	public abstract long binomialCoef(int i, int j);
	
	public abstract long faktoriel(int i);

}
