package kodea;

import interfazeak.UIModua;
import kartak.*;

public class Jokoa {
	private static Jokoa nJokoa;
	private Jokoa() {}
	public static Jokoa getJokoa() {
		if (nJokoa==null){
			nJokoa = new Jokoa();
		}
		return nJokoa;
	}
	public void hasieratuJokoa() {
	Pertsona jokalari1 	= 				new Pertsona();
	jokalari1.barajanSartu(ListaKartakFactory.getListaKartaFactory().createListak("Urdina"));
	Ordenagailua IA	 	= 				new Ordenagailua();
	IA.barajanSartu(ListaKartakFactory.getListaKartaFactory().createListak("Berdea"));
	Tablero tablero 		= Tablero.getTableroa();
	Ostikada karta1 		= (Ostikada)		KartaFactory.getKartaFactory().createKarta("Ostikada");
	tablero.kokatuBerezia(karta1);
	ZerukoAtea karta2 	= (ZerukoAtea) 	KartaFactory.getKartaFactory().createKarta("ZerukoAtea");
	tablero.kokatuBerezia(karta2);
	UIModua.getUIModua().setVisible(true);
	}	
}
