package Main;

import Aufgabenblatt.Iterative_Pascalsche_Dreieck;
import Aufgabenblatt.Pascalsche_Dreieck;
import Aufgabenblatt.Rekusive_Pascalsche_Dreieck;

public class Main {

	public static void main(String[] args) {
		
		Dreieck iterDreieck = new Iterative_Pascalsche_Dreieck();
		Dreieck recurDreieck = new Rekusive_Pascalsche_Dreieck();
		Dreieck dreieck = new Pascalsche_Dreieck();
		
		System.out.println("\n Rekursiv \n");
		recurDreieck.draw(10);
		System.out.println();
		System.out.println(" Iterrativ \n");
		iterDreieck.draw(10);
		System.out.println();
		System.out.println(" Binominal \n");
		dreieck.draw(10);
		System.out.println();
		
		System.out.println("\n\t 4. Vergleich vom Verfahren\n");

		for(int Zeile = 0; Zeile < 21; Zeile++){
			System.out.format("Zeile : %d\t Recursiv %d\n", Zeile, recurDreieck.process(Zeile));
			System.out.format("Zeile : %d\t Iterative %d\n", Zeile, iterDreieck.process(Zeile));
			System.out.format("Zeile : %d\t Binominal %d\n", Zeile, dreieck.process(Zeile));
			System.out.println();
		}
	}
}
