package presentation;

import metier.Benji;
import metier.Fati;

public class Lanceur {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Fati fati = new Fati("Fati");
		Benji benji = new Benji("Benji");
		
		System.out.println("Fati va courir");
		fati.courir();
		System.out.println("Benji va nager");
		benji.nager();
	}
	
}
