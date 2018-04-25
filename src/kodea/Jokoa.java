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
		super();
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
	public Tablero getTablero() {
		return tablero;
	}
	public void kartaJokatu(String izena) throws Exception {
		// TODO Auto-generated method stub
		getJokalariak().getTurnoaDuenJokalaria().jokatuKarta(izena);
		this.setChanged();
		notifyObservers();
		kartaErrekurtsiboakAktibatu();
	}
	private void kartaErrekurtsiboakAktibatu() throws Exception {
		// TODO Auto-generated method stub
		ArrayList<KartaAnimali> animaliak = this.tablero.errekurtsiboakLortu();
		if (animaliak != null) {
			for (int i = 0; i < animaliak.size(); i++) {
				animaliak.get(i).animaladaBurutu();
				aldatuta();
			}
		}
	}
	public void aldatuta() {
		// TODO Auto-generated method stub
		this.setChanged();
		notifyObservers();
	}
}
