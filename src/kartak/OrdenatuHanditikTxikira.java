package kartak;

import kodea.ListaKartakTableroan;

public class OrdenatuHanditikTxikira implements Ordenatu {

	public OrdenatuHanditikTxikira() {}
	@Override
	public void ordenatu(int pHasi, int pZenbat) {
		// TODO Auto-generated method stub

	}
	public void ordenatu() {
		ListaKartakTableroan lk=ListaKartakTableroan.getNireListaKartakTableroan();
		lk.ordSugea();
	}

}
