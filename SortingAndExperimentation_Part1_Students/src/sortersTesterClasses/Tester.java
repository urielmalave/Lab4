package sortersTesterClasses;

import sorterClasses.BubbleSortSorter;

public class Tester {
	
	public static void main(String[] arg) {
	
	Entero[] arrOfEnteros = new Entero[5];
	
	arrOfEnteros[0] = new Entero(4); 
	arrOfEnteros[1] = new Entero(3); 
	arrOfEnteros[2] = new Entero(2); 
	arrOfEnteros[3] = new Entero(1); 
	arrOfEnteros[4] = new Entero(0); 
	
	
	BubbleSortSorter<Entero> sorter = new BubbleSortSorter<Entero>();
	
	sorter.sort(arrOfEnteros, null);
	
}
}
