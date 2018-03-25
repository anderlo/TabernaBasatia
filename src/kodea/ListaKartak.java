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
	public Karta kartaKendu(String izena) {
		Karta karta = null;
		for (int i = 0; i < this.kopurua()-1; i++) {
			if (this.kartak.get(i).getIzena().equals(izena)){
				karta = kartak.get(i);
				kartak.remove(i);
			}
		}
		return karta;
	}
	
}
