package kartak;

import kodea.*;

public class OrdenatuNormala implements Ordenatu {

	public OrdenatuNormala() {}
	@Override
	public void ordenatu(int pHasi, int pZenbat) {
		// TODO Auto-generated method stub
		ListaKartakTableroan t=Tablero.getTableroa().getJokoan();
		KartaNodo aux=null;
		boolean amaitu=false;
		while(!amaitu&&pHasi!=1) {
			t.aldatuPos(pHasi);
			pZenbat--;
			if(pZenbat==0) {
				amaitu=true;
			}
		}
	}

}
