package kodea;

import java.util.ArrayList;

import kartak.KartaAnimali;

public class KameleoiaEzJokoan implements KameleoiEgoera {
	public KameleoiaEzJokoan() {}

	@Override
	public void egoeraAldatu() {
		// TODO Auto-generated method stub
		ArrayList<KartaAnimali> kartak = ListaKartakTableroan.getNireListaKartakTableroan().getKartak();
		boolean atera = false;
		int i = 0;
		while (!atera && kartak.size()>i) {
			if (kartak.get(i).getEgoeraBerezia()) {
				atera = true;
			}else {
				i++;
			}
		}
		if (atera) {
			kartak.get(i).setIzena("Kameleoi");
			kartak.get(i).setZenbakia(5);
			kartak.get(i).aldatuEgoeraBerezia();
		}
		ListaKartakTableroan.getNireListaKartakTableroan().aldatuEgoera_2();
	}
	
}
