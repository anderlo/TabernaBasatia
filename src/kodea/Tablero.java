package kodea;

import java.util.ArrayList;
import java.util.LinkedList;

import javax.swing.ListModel;

import kartak.*;

public class Tablero {
	private static Tablero nTablero;
	private ListaKartak barruan;
	private ListaKartak kanpoan;
	private ListaKartakTableroan jokoan;
	private ArrayList<String> feedLista;
	private Ostikada ostikada;
	private ZerukoAtea zerukoatea;
	private boolean turnoa;
	
	public static Tablero getTableroa() {
		// TODO Auto-generated method stub
		if (nTablero == null) {nTablero = new Tablero();}
		return nTablero;
	}
	private Tablero(){
		this.barruan 		= new ListaKartak();
		this.kanpoan 		= new ListaKartak();
		this.turnoa			= false;
		this.jokoan  		= ListaKartakTableroan.getNireListaKartakTableroan();
		this.ostikada		= null;
		this.zerukoatea		= null;
		this.feedLista		= new ArrayList<String>();
		Ostikada karta	 	= (Ostikada)   KartaFactory.getKartaFactory().createKarta("Ostikada");
		ZerukoAtea karta2 	= (ZerukoAtea) KartaFactory.getKartaFactory().createKarta("Zerukoatea");
		
		this.kokatuOstikada(karta);
		this.kokatuZerukoAtea(karta2);
	}
	public void kokatuOstikada(Ostikada karta) {
		// TODO Auto-generated method stub
		if (karta.getIzena().equals("Ostikada")){
			this.ostikada 	= karta;
		}else {
			this.ostikada 	= null;
		}
	}
	public void kokatuZerukoAtea(ZerukoAtea karta2) {
		// TODO Auto-generated method stub
		if (karta2.getIzena().equals("ZerukoAtea")){
			this.zerukoatea 	= karta2;
		}else {
			this.zerukoatea 	= null;
		}
	}
	public ListaKartak getBarruan() {
		return this.barruan;
	}
	//junit egiteko: 
	public ListaKartak getKanpoan() {
		return this.kanpoan;
	}

	public ListaKartakTableroan getJokoan() {
		return this.jokoan;
	}

	public Ostikada getOstikada() {
		return this.ostikada;
	}

	public ZerukoAtea getZerukoatea() {
		return zerukoatea;
	}
	public void turnoaAldatu() {
		if (this.turnoa) {
			this.turnoa = false;
		}else {
			this.turnoa = true;
		}
	}
	public boolean getTurnoa() {
		return this.turnoa;
	}
	public void sartuZeruan(KartaAnimali pKarta) {
		this.barruan.add(pKarta);
	}
	public void ateraKanpora(KartaAnimali pKarta) {
		this.kanpoan.add(pKarta);
	}
	public ArrayList<KartaAnimali> errekurtsiboakLortu() {
		return(this.jokoan.errekurtsiboakLortu());
	}
	public void sartuJokatutakoKarta(Jokalari pJokalari, String pKarta) {
		if (pJokalari instanceof Pertsona) {
			feedLista.add("(Urdina) "+pKarta);
		}else {
			feedLista.add("(Berdea) "+pKarta);
		}
		
	}
	public ArrayList<String> getFeed(){
		return this.feedLista;
	}

}
