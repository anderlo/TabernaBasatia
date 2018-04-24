package test.kartak;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

import kartak.KartaAnimali;
import kartak.KartaFactory;
import kodea.KartaNodo;
import kodea.ListaKartakTableroan;

class TestListaKartakTableroan {

	@Test
	final void testGehituAnimali() {
		ListaKartakTableroan kartak = new ListaKartakTableroan();
		assertNotNull(kartak);
		assertEquals(0,kartak.luzera());
		KartaNodo aux = new KartaNodo(KartaFactory.getKartaFactory().createKarta("Berdea", 2));
		kartak.gehituAnimali(aux);
		assertEquals(1,kartak.luzera());
	}

	@Test
	final void testAldatuOrdena() {
		ListaKartakTableroan kartak = new ListaKartakTableroan();
		assertNotNull(kartak);
		assertEquals(0,kartak.luzera());
		for (int i = 1; i < 4; i++) {
			KartaNodo aux = new KartaNodo(KartaFactory.getKartaFactory().createKarta("Berdea", i));
			kartak.gehituAnimali(aux);
		}
	
		assertEquals(3,kartak.luzera());
		kartak.getKartak();
		
		kartak.aldatuOrdena();
		kartak.getKartak();
		
	}

	@Test
	final void testKenduAnimali() {
		ListaKartakTableroan kartak = new ListaKartakTableroan();
		assertNotNull(kartak);
		assertEquals(0,kartak.luzera());
		KartaNodo aux = new KartaNodo(KartaFactory.getKartaFactory().createKarta("Berdea", 2));
		kartak.gehituAnimali(aux);
		assertEquals(1,kartak.luzera());
		kartak.kenduAnimali(0);
		assertEquals(0, kartak.luzera());
		for (int i = 1; i < 4; i++) {
			KartaNodo aux2 = new KartaNodo(KartaFactory.getKartaFactory().createKarta("Berdea", i));
			kartak.gehituAnimali(aux2);
		}
		kartak.kenduAnimali(3);
		assertEquals(2, kartak.luzera());
		KartaNodo aux3 = new KartaNodo(KartaFactory.getKartaFactory().createKarta("Berdea", 7));
		kartak.gehituAnimali(aux3);
		kartak.kenduAnimali(2);
		assertEquals(2, kartak.luzera());
	}
	@Test
	final void testGetKartak() {
		ListaKartakTableroan kartak = new ListaKartakTableroan();
		for (int i = 1; i < 4; i++) {
			KartaNodo aux2 = new KartaNodo(KartaFactory.getKartaFactory().createKarta("Berdea", i));
			kartak.gehituAnimali(aux2);
		}
		ArrayList<KartaAnimali> animaliak = kartak.getKartak();
		assertEquals(3, animaliak.size());
	}

}
