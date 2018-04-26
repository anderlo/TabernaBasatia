package kartak;

import java.util.ArrayList;

import kodea.Jokoa;
import kodea.ListaKartakTableroan;

//Una mofeta repele a todos los animales de las dos especies más fuertes que 
//haya en en la cola, pero nunca a otras mofetas. Los animales repelidos se 
//colocan en la carta «ES LO QUE H
public class Mofeta extends KartaAnimali{
	private Bota bota;
	
	public Mofeta(String kolorea, int zenbakia) {
		super(kolorea, zenbakia);
		// TODO Auto-generated constructor stub
		this.bota = new BotaNormala();
	}

	@Override
	public void animaladaBurutu() {
		// TODO Auto-generated method stub
		ListaKartakTableroan kartak = Jokoa.getJokoa().getTablero().getJokoan();
		int handiena = 0;
		int handiena2 = 0;
		ArrayList<Integer> posizioak = new ArrayList<Integer>();
		for (int i=0;i<kartak.luzera();i++) {
			int aux = kartak.getKartaListan(i).getKarta().animaliZenbakia();
			if ((aux>handiena)&&(aux!=1)) {
				handiena = aux;
				posizioak.add(i);
			}
			else {
				if ((aux!=handiena)&&(aux>handiena2)&&(aux!=1)){
					handiena2 = aux;
					posizioak.add(i);
				}
				else {
					if (aux==handiena) {
						posizioak.add(i);
					}
					if (aux==handiena2) {
						posizioak.add(i);
					}
				}
			}
		}
		for (int i = 0; i<posizioak.size();i++) {
			bota.tablerotikAtera(posizioak.get(i));
		}
	}

}
