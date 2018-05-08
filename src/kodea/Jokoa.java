package kodea;

import java.util.ArrayList;
import java.util.Observable;

import interfazeak.UIModua;
import kartak.*;

public class Jokoa extends Observable { //Inplementatu behar
	private static Jokoa nJokoa;
	private ListaJokalari jokalariak;
	private Tablero tablero;
	private boolean kamaleoiaJokatu;
	private Jokoa() {
		super();
		tablero = Tablero.getTableroa();
		jokalariak = ListaJokalari.getNireListaJokalari();
		kamaleoiaJokatu = false;
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
		boolean jokatuta = getJokalariak().getTurnoaDuenJokalaria().jokatuKarta(izena);
		aldatuta();
		
		if (jokatuta){
			kartaErrekurtsiboakAktibatu();
			aldatuta();
			if(this.tablero.getJokoan().luzera()==5) {
				this.tablero.getJokoan().zeruaKalea();
			}
			aldatuta();
		}
	}
	public void kartaErrekurtsiboakAktibatu() throws Exception {
		// TODO Auto-generated method stub
		ArrayList<KartaAnimali> animaliak = this.tablero.errekurtsiboakLortu();
		if (animaliak != null) {
			for (int i = 0; i < animaliak.size(); i++) {
				animaliak.get(i).animaladaBurutu();
				aldatuta();
			}
			if (kamaleoiaJokatu) {
				kamaleoiaBilatu();
				kamaleoiaJokatu = false;
				aldatuta();
			}
		}
	}
	private void kamaleoiaBilatu() {
		// TODO Auto-generated method stub
		ListaKartakTableroan.getNireListaKartakTableroan().aldatuKamaleoia();
	}
	public void aldatuta() {
		// TODO Auto-generated method stub
		this.setChanged();
		notifyObservers();
	}
	public void kamaleoiEgoera() {
		// TODO Auto-generated method stub
		if(!kamaleoiaJokatu) {
			kamaleoiaJokatu = true;
		}else {
			kamaleoiaJokatu = false;
		}
	}
	public String lortuPuntuak(int pAukera) {
		// TODO Auto-generated method stub
		int emaitza = 0;
		ArrayList<KartaAnimali> lista = Tablero.getTableroa().getBarruan().getKartak();
		if(pAukera == 1) {
			for (int i = 0; i < lista.size(); i++) {
				if (lista.get(i).getKolorea().equals(("Urdina"))){
					emaitza = emaitza + lista.get(i).animaliZenbakia();
				}
			}
		}else {
			for (int i = 0; i < lista.size(); i++) {
				if (lista.get(i).getKolorea().equals(("Berdea"))){
					emaitza = emaitza + lista.get(i).animaliZenbakia();
				}
		}
		}
		return String.valueOf(emaitza);
	}
}
