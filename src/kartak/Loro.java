package kartak;

import interfazeak.UILoro;
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
		if (ListaKartakTableroan.getNireListaKartakTableroan().luzera()==2) {
			botaLoro.tablerotikAtera(0);
			jokatuta = true;
		}else if(ListaKartakTableroan.getNireListaKartakTableroan().luzera()>2) {
			UILoro.main();
		}
		return jokatuta;
	}
	
	public static Bota getBota() {
		return botaLoro;
	}
	
}
