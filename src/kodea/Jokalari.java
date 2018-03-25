package kodea;

import java.util.Random;

import kartak.KartaAnimali;

public abstract class Jokalari {
	protected ListaKartak eskua  ;
	protected ListaKartak baraja ;
	public Jokalari() {
		this.eskua 	= new ListaKartak();
		this.baraja 	= new ListaKartak();
	}
	public void barajanSartu(ListaKartak createListak) {
		this.baraja=createListak;
	}
	public void eskuanSartu() {
		Random lortuKarta=new Random();
		int n=lortuKarta.nextInt(11);
		KartaAnimali k=this.baraja.kartaKendu(n);
		this.kartaSartu(k);
	}
	public void kartaSartu(KartaAnimali pKarta) {
		this.eskua.add(pKarta);
	}
	public ListaKartak getBaraja() {
		return this.baraja;
	}
	public ListaKartak getEskua() {
		return this.eskua;
	}
}
