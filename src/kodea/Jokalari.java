package kodea;

import java.util.ArrayList;
import java.util.Random;

import kartak.KartaAnimali;

public abstract class Jokalari {
	protected ListaKartak eskua  ;
	protected ListaKartak baraja ;
	public Jokalari() {
		this.eskua 	= new ListaKartak();
		this.baraja 	= new ListaKartak();
	}
	public void barajanSartu(ListaKartak createListak, boolean konpetitiboa, ArrayList<Integer> pHautatuak) {
		ArrayList<Integer> hautatuak = pHautatuak;
		this.baraja=createListak;
		if (!konpetitiboa) {
			for (int i = 0; i < 4; i++) {
				eskuanSartu();}
		}else {
			for (int j = 0; j < hautatuak.size(); j++) {
				eskuanSartuKonp(hautatuak.get(j));
			}
		}
	}
	private void eskuanSartuKonp(int pKarta) {
		//Modu konpetitiboan bagaude, guk aukeratutako kartekin hasteko
		for(int i=0;i<this.baraja.kopurua();i++) {
			if(this.baraja.getKartak().get(i).animaliZenbakia()==pKarta) {
				KartaAnimali k = this.baraja.kartaKendu(i);
				this.kartaSartu(k);
			}
		}
	}
	public void eskuanSartu() {
		Random lortuKarta=new Random();
		int n=lortuKarta.nextInt(baraja.getKartak().size());
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
