package kodea;

import java.util.ArrayList;
import java.util.Observable;

import interfazeak.UIModua;
import kartak.*;

public class Jokoa extends Observable { //Inplementatu behar
	private static Jokoa nJokoa;
	private ListaJokalari jokalariak;
	private Tablero tablero;
	private Jokoa() {
		tablero = Tablero.getTableroa();
		jokalariak = ListaJokalari.getNireListaJokalari();
	}
	public static Jokoa getJokoa() {
		if (nJokoa==null){
			nJokoa = new Jokoa();
		}
		return nJokoa;
	}
	public void hasieratuJokoa(boolean pKonpetitiboa, ArrayList<Integer> pHautatuak) {
	Pertsona jokalari1 	= 				new Pertsona();
	jokalari1.barajanSartu(ListaKartakFactory.getListaKartaFactory().createListak("Urdina"), pKonpetitiboa, pHautatuak);
	Ordenagailua IA	 	= 				new Ordenagailua();
	IA.barajanSartu(ListaKartakFactory.getListaKartaFactory().createListak("Berdea"), false, null);
	Tablero tablero 		= Tablero.getTableroa();
	Ostikada karta1 		= (Ostikada)		KartaFactory.getKartaFactory().createKarta("Ostikada");
	tablero.kokatuOstikada(karta1);
	ZerukoAtea karta2 	= (ZerukoAtea) 	KartaFactory.getKartaFactory().createKarta("Zerukoatea");
	tablero.kokatuZerukoAtea(karta2);
	setTablero(tablero);
	setJokalari(jokalari1);
	setJokalari(IA);
	}	
	private void setTablero(Tablero ptablero) {
		tablero = ptablero ; 
	}
	private void setListaJokalari(ListaJokalari pjokalariak) {
		jokalariak = pjokalariak;
	}
	private void setJokalari(Jokalari pjokalari) {
		jokalariak.jokalariakSartu(pjokalari);
	}
	
	public ListaJokalari getJokalariak() {
		return jokalariak;
	}
}
