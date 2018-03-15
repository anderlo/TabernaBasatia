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
			for (int i = 1; i < 13; i++) {
				karta = KartaFactory.getKartaFactory().createKarta(kolore,i);
				kartak.add(karta);
			}
		}
		return kartak;
	}

}
