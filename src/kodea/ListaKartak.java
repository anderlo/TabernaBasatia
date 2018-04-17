package kodea;

import java.util.ArrayList;
import kartak.*;

public class ListaKartak {
	private ArrayList<KartaAnimali> kartak;
	public ListaKartak() {
		this.kartak = new ArrayList<KartaAnimali>();
	}
	public void add(KartaAnimali karta) {
		// TODO Auto-generated method stub
		this.kartak.add(karta);
	}
	public int kopurua() {
		return this.kartak.size();
	}
	public KartaAnimali kartaKendu(String izena) {
		KartaAnimali karta = null;
		for (int i = 0; i < this.kopurua()-1; i++) {
			if (this.kartak.get(i).getIzena().equals(izena)){
				karta = kartak.get(i);
				kartak.remove(i);
			}
		}
		return karta;
	}
	public KartaAnimali kartaKendu(int pos) {
		KartaAnimali karta = null;
		if (pos<= this.kopurua()-1) {
			karta = this.kartak.get(pos);
			this.kartak.remove(pos);
		}
		return karta;
	}
	
	public ArrayList<KartaAnimali> getKartak(){
		return kartak;
	}
	
}