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
	public Tablero(){
		this.barruan 	= new ListaKartak();
		this.kanpoan 	= new ListaKartak();
		this.jokoan  	= new ListaKartakTableroan();
		this.ostikada 	= (Ostikada) KartaFactory.getKartaFactory().createKarta("Ostikada");
		this.zerukoatea 	= (ZerukoAtea) KartaFactory.getKartaFactory().createKarta("ZerukoAtea");
	}
}
