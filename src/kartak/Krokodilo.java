package kartak;

import kodea.KartaNodo;
import kodea.ListaKartakTableroan;

//Un cocodrilo se come a cualquier animal 
//m�s d�bil 
//que tenga zadsadadsad
//por delante. Si mientras 
//come se topa con un animal m�s fuerte o con una cebra, el cocodrilo se detiene de inmediato.
//Los animales comidos van a parar a la carta �ES LO QUE HAY
//El cocodrilo realiza su animalada de forma recurrente en cada turno sucesivo de cada jugador.
public class Krokodilo extends KartaAnimali{
	private OrdenatuNormala 	ordenatu;
	private BotaNormala 		bota;
	public Krokodilo(String kolorea, int zenbakia) {
		super(kolorea, zenbakia);
		// TODO Auto-generated constructor stub
		this.errekurrentea 	=	true;
		this.ordenatu 		= 	new OrdenatuNormala();
		this.bota			=	new BotaNormala();
	}

	@Override
	public void animaladaBurutu() {
		ListaKartakTableroan tablero = ListaKartakTableroan.getNireListaKartakTableroan();
		Boolean amaituta 	= 	false;
		int		zenbat		= 	0;
		int 		hasiera		=	tablero.posizioaLortu(this.path);
		KartaNodo	aux		=	tablero.getKartaListan(hasiera).getAurrekoa();
		if (aux!=null){
			while (amaituta==false) {
				if ((aux.getKarta().animaliZenbakia()<10)&&(aux.getKarta().getIzena()!="Zebra")){
					zenbat++;
				}else{
					amaituta=true;
				}
				
				if (aux.getHurrengoa()==null) {
					amaituta=true;
				}
				
				aux=aux.getHurrengoa();
			}
			this.bota.tablerotikAtera(hasiera,zenbat);
		}
	}
	
}
