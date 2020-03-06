package presentation;

import metier.Benji;
import metier.Cedric;
import metier.Fati;
import service.ServiceSport;

public class Lanceur {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Fati fati = new Fati("Fati");
		Benji benji = new Benji("Benji");
		Cedric ced = new Cedric();
		ServiceSport sSport = new ServiceSport();
		
		sSport.participerTriat(fati);
		sSport.participerTriat(benji);
		fati.respirer();
		benji.etreAddict("WOW");
		//sSport.participerTriat(ced);
	}
	
}
