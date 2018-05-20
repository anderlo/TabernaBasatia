package kartak;

import kodea.*;

public class BotaNormala implements Bota {

	@Override
	public void tablerotikAtera(int pPos) {
		// TODO Auto-generated method stub
		ListaKartakTableroan ik = Tablero.getTableroa().getJokoan();
		ik.kenduAnimali(pPos);
	}
	public void tablerotikAtera(int pHasiera,int pZenbat) {
		// TODO Auto-generated method stub
		int aux1 = pHasiera;
		int aux2 = pZenbat;
		ListaKartakTableroan ik = Tablero.getTableroa().getJokoan();
		while (aux2!=0) {
			ik.kenduAnimali(aux1-aux2);
			aux1--;
			aux2--;
		}
			
	}
	
	

}
