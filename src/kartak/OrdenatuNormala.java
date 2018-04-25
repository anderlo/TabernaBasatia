package kartak;

import kodea.*;

public class OrdenatuNormala implements Ordenatu {

	public OrdenatuNormala() {}
	@Override
	public void ordenatu(int pHasi, int pZenbat) {
		// TODO Auto-generated method stub
		ListaKartakTableroan t=Tablero.getTableroa().getJokoan();
		t.aldatuPos(pHasi,pZenbat);
	}

}
