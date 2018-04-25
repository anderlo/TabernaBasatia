package kartak;

import kodea.Jokoa;
import kodea.ListaKartakTableroan;

//Un hipopótamo embiste hacia la puerta. Sin embargo, no puede colarse delante de un 
//miembro de su propia especie, de animales más fuertes (leones) o de las cebras (consultad 
//«La cebra»).

//El hipopótamo realiza su animalada de forma recurrente en cada turno sucesivo de 
//cada jugador
public class Hipopotamo extends KartaAnimali{
	private Ordenatu ordenatu;

	public Hipopotamo(String kolorea, int zenbakia) {
		super(kolorea, zenbakia);
		// TODO Auto-generated constructor stub
		this.errekurrentea=true;
		this.ordenatu = new OrdenatuNormala();
	}

	@Override
	public void animaladaBurutu() {
		// TODO Auto-generated method stub
		ListaKartakTableroan kartak = Jokoa.getJokoa().getTablero().getJokoan();
		int pos = kartak.posizioaLortu(path);
		boolean amaitu = false;
		for (int i=0; (i<pos)&&!(amaitu);i++){
			if (kartak.getKartaListan(pos-1).getKarta().getIzena().equals("Hipopotamo")||
				kartak.getKartaListan(pos-1).getKarta().getIzena().equals("Lehoi")||
				kartak.getKartaListan(pos-1).getKarta().getIzena().equals("Zebra")){
				amaitu = true;
			}
			else {
				ordenatu.ordenatu(pos-i, 1);
			}
		}
		
	}

}
