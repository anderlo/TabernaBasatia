package kartak;

import kodea.Jokoa;
import kodea.ListaKartakTableroan;

//Si el le�n jugado no se encuentra en la cola con un miembro de su especie, espanta a 
//todos los monos hacia la carta �ES LO QUE HAY�. Seguidamente, se cuela delante de 
//todos los dem�s animales

//Si ya hay un le�n en la 
//cola, el le�n reci�n jugado 
//va directamente a la carta 
//�ES LO QUE HAY�

public class Lehoi extends KartaAnimali{
	private Ordenatu ordenatu;
	private Bota bota;

	public Lehoi(String kolorea, int zenbakia) {
		
		super(kolorea, zenbakia);
		this.animalia="Lehoi";
		this.setPath();
		this.ordenatu = new OrdenatuNormala();
		this.bota = new BotaNormala();
		// TODO Auto-generated constructor stub
	}

	@Override
	public void animaladaBurutu() {
		// TODO Auto-generated method stub
		ListaKartakTableroan kartak = Jokoa.getJokoa().getTablero().getJokoan();
		boolean lehoiBatDago = false;
		for (int i=0;(i<kartak.luzera()-1)&&!(lehoiBatDago);i++ ) {
			if (kartak.getKartaListan(i).getKarta().getIzena().equals("Lehoi")) {
				lehoiBatDago=true;
			}
		}
		if (lehoiBatDago){
			for (int i=0;(i<kartak.luzera()-1);i++ ) {
				if (kartak.getKartaListan(i).getKarta().getIzena().equals("Tximino")) {
					bota.tablerotikAtera(i);
				}
			}
		}
		else {
			bota.tablerotikAtera(kartak.posizioaLortu(path));
		}
	}

}
