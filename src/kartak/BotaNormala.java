package kartak;

import kodea.*;

public class BotaNormala implements Bota {

	@Override
	public void tablerotikAtera(int pPos) {
		// TODO Auto-generated method stub
		ListaKartakTableroan ik = Tablero.getTableroa().getJokoan();
		ik.kenduAnimali(pPos);
	}
	
	

}
