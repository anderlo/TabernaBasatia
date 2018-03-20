package test.kartak;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import kartak.ListaKartakFactory;
import kodea.ListaKartak;

class TestListaKartakFactory {

	@Test
	final void testGetListaKartaFactory() {
		assertNotNull(ListaKartakFactory.getListaKartaFactory());
	}

	@Test
	final void testCreateListak() {
		//TestKartaFactory ondo dagoela dakigunez ez dugu kartaz karta joan behar
		ListaKartak kartakBerdea = new ListaKartak();
		kartakBerdea = ListaKartakFactory.getListaKartaFactory().createListak("Berdea");
		ListaKartak kartakUrdina = new ListaKartak();
		kartakUrdina = ListaKartakFactory.getListaKartaFactory().createListak("Urdina");
		assertTrue((kartakBerdea.kopurua()+kartakUrdina.kopurua())==24);
	}

}
