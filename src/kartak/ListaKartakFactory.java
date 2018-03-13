package kartak;

import kodea.ListaKartak;

public class ListaKartakFactory {
	private static ListaKartakFactory nListaKartaFactory;
	private ListaKartakFactory (){}
	public static ListaKartakFactory getListaKartaFactory(){
		 if (nListaKartaFactory == null) {nListaKartaFactory = new ListaKartakFactory();}
		return nListaKartaFactory;
		}
	public ListaKartak createListak (String kolore){
		ListaKartak 		kartak	= new ListaKartak();
		KartaAnimali	    karta 	= null;
		if ((kolore=="Urdina")||(kolore=="Berdea")) {
			System.out.println("Estoy dentro del if del color" +kolore);
			for (int i = 1; i < 13; i++) {
				System.out.println("Estoy dentro del for del color" +kolore);
				karta = KartaFactory.getKartaFactory().createKarta(kolore,i);
				if (karta==null) {System.out.println("null");}
				else {System.out.println(karta.animaliZenbakia());}
				kartak.add(karta);
			}
		}
		return kartak;
	}

}
