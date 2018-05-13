package kartak;

import interfazeak.UILoro;
import kodea.ListaJokalari;
import kodea.ListaKartakTableroan;

//Un loro ahuyenta a un animal en la cola, a elección del jugador, y lo coloca en 
//la carta «ES LO QUE HA
public class Loro extends KartaAnimali{
	private static BotaNormala botaLoro;
	public Loro (String kolorea,int zenbakia) {
	super(kolorea, zenbakia);
	// TODO Auto-generated constructor stub
	botaLoro = new BotaNormala();
	}
	

	@Override
	public boolean animaladaBurutu() {
		// TODO Auto-generated method stub
		boolean jokatuta = false;
		if(ListaJokalari.getNireListaJokalari().getTurnoa()==0) {
			if (ListaKartakTableroan.getNireListaKartakTableroan().luzera()==2) {
				botaLoro.tablerotikAtera(0);
				jokatuta = true;
			}else if(ListaKartakTableroan.getNireListaKartakTableroan().luzera()>2) {
				UILoro.main();
			}
			return jokatuta;
		}else {
			this.animaladaBurutuIA();
			return true;
		}
		
		
	}
	public void animaladaBurutuIA() {
		int zenbat = ListaKartakTableroan.getNireListaKartakTableroan().luzera();
		if (zenbat==1) {
			botaLoro.tablerotikAtera(0);
		}else {
			botaLoro.tablerotikAtera((int) (Math.random() * zenbat-1));
		}
	}
	
	public static Bota getBota() {
		return botaLoro;
	}
	
}
