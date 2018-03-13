package kartak;

import kodea.ListaKartak;

public class TestCrear {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListaKartak kartak = new ListaKartak();
		kartak = ListaKartakFactory.getListaKartaFactory().createListak("Berdea");
		System.out.println("Karta kopuru hau daukagu: "+kartak.kopurua());
	}

}
