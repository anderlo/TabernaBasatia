package kartak;

import interfazeak.UILoro;
import kodea.ListaKartakTableroan;

//Un loro ahuyenta a un animal en la cola, a elección del jugador, y lo coloca en 
//la carta «ES LO QUE HA
public class Loro extends KartaAnimali{
	protected static Bota botaLoro;
	public Loro (String kolorea,int zenbakia) {
	super(kolorea, zenbakia);
	// TODO Auto-generated constructor stub
	this.botaLoro = new BotaNormala();
	}
	

	@Override
	public void animaladaBurutu() {
		// TODO Auto-generated method stub
		if (ListaKartakTableroan.getNireListaKartakTableroan().luzera()==1) {
			botaLoro.tablerotikAtera(0);
		}else if(ListaKartakTableroan.getNireListaKartakTableroan().luzera()>1) {
			UILoro.main(null);
		}
	}
	
	public static Bota getBota() {
		return botaLoro;
	}
	
}
