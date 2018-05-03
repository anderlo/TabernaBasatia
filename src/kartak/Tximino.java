package kartak;

import java.util.ArrayList;

import kodea.KartaNodo;
import kodea.ListaKartakTableroan;

//Un �nico mono en la cola, no causa ning�n cambio
//Si un mono adicional(adem�s del primero) llega a la cola, la pandilla de 
//monos espanta a todos los hipop�tamosy los cocodrilos que haya en la 
//cola, envi�ndolos a la carta �ES LO QUE HAY�. Seguidamente, el mono 
//reci�n jugadose cuela delante de todos los animales y se pone el primero de la cola, 
//delante de la Puerta del Cielo, convocando a sus colegas monos directamente 
//detr�s de �l, pero en orden inverso al que se encontraban.

public class Tximino extends KartaAnimali{
	private OrdenatuNormala 	ordenatu;
	private BotaNormala 		bota;
	public Tximino(String kolorea, int zenbakia) {
		super(kolorea, zenbakia);
		// TODO Auto-generated constructor stub
		this.ordenatu 		= 	new OrdenatuNormala();
		this.bota			=	new BotaNormala();
		}

	@Override
	public void animaladaBurutu() {
		ListaKartakTableroan tablero = ListaKartakTableroan.getNireListaKartakTableroan();
		Boolean amaituta 	= 	false;
		int		zenbat		= 	0;
		int 		hasiera		=	tablero.posizioaLortu(this.path);
		KartaNodo	aux		=	tablero.getKartaListan(hasiera);
		
		ArrayList<Integer> non = tablero.posizioakLortu("Tximino");
		if (non.size()>=2 ) {
			for (int i=0;(i<tablero.luzera()-1);i++ ) {
				if (tablero.getKartaListan(i).getKarta().getIzena().equals("Hipopotamo")||tablero.getKartaListan(i).getKarta().getIzena().equals("Krokodilo")) {
					bota.tablerotikAtera(i);
				}
			}
			for (int x = 0; x < non.size(); x++) {
				this.ordenatu.ordenatu(non.get(x)+x,non.get(x));
			}
		}
		
	}

}
