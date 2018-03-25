package kodea;

import kartak.*;

public class Tablero {
	private static Tablero nTablero;
	private ListaKartak barruan;
	private ListaKartak kanpoan;
	private ListaKartakTableroan jokoan;
	private Ostikada ostikada;
	private ZerukoAtea zerukoatea;
	public static Tablero getTableroa() {
		// TODO Auto-generated method stub
		if (nTablero == null) {nTablero = new Tablero();}
		return nTablero;
	}
	private Tablero(){
		this.barruan 		= new ListaKartak();
		this.kanpoan 		= new ListaKartak();
		this.jokoan  		= new ListaKartakTableroan();
		this.ostikada		= null;
		this.zerukoatea		= null;
		Ostikada karta	 	= (Ostikada)   KartaFactory.getKartaFactory().createKarta("Ostikada");
		System.out.println(karta.getIzena()+"hehexd");
		ZerukoAtea karta2 	= (ZerukoAtea) KartaFactory.getKartaFactory().createKarta("Zerukoatea");
		
		this.kokatuOstikada(karta);
		this.kokatuZerukoAtea(karta2);
	}
	public void kokatuOstikada(Ostikada karta) {
		// TODO Auto-generated method stub
		if (karta.getIzena().equals("Ostikada")){
			System.out.println("hemen nago");
			this.ostikada 	= karta;
		}else {
			//System.out.println("hemen nago 2");
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
		System.out.println(this.ostikada.getIzena()+" getOstikada 1");
		return this.ostikada;
	}

	public ZerukoAtea getZerukoatea() {
		return zerukoatea;
	}

}
