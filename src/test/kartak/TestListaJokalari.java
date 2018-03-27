package test.kartak;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import kartak.KartaAnimali;
import kartak.KartaFactory;
import kartak.ListaKartakFactory;
import kodea.Jokalari;
import kodea.ListaJokalari;
import kodea.ListaKartak;
import kodea.Pertsona;

class TestListaJokalari {

	ListaJokalari lj1	=	ListaJokalari.getNireListaJokalari();
	ListaKartak l1;
	Jokalari	j1;
	KartaAnimali k1;
	@BeforeEach
	void setUp() throws Exception {
		j1	= new Pertsona();
		l1 	=	ListaKartakFactory.getListaKartaFactory().createListak("Urdina");
		k1	=	KartaFactory.getKartaFactory().createKarta("Urdina",12);

	}

	@AfterEach
	void tearDown() throws Exception {
		lj1=null;
		l1=null;
		j1=null;
		k1=null;
	}

	@Test
	void testListaJokalari() {
		lj1.jokalariakSartu(j1);
		assertNotNull(lj1);
		lj1.ezabatuJokalaria(0);
	}

	@Test
	void testJokalariakSartu() {
		lj1.jokalariakSartu(j1);
		assertEquals(lj1.jokKop(), 1);
		lj1.ezabatuJokalaria(0);
	}

	@Test
	void testGetNireListaJokalari() {
		assertNotNull(lj1);
	}

	@Test
	void testTurnoaPasatu() {
		lj1.jokalariakSartu(j1);
		int t=lj1.getTurnoa();
		lj1.turnoaPasatu();
		assertEquals(t,lj1.getTurnoa());
		lj1.ezabatuJokalaria(0);
	}

	@Test
	void testGetJokalariarenTurnoa() {
		lj1.jokalariakSartu(j1);
		assertNotNull(lj1.getJokalariarenTurnoa(lj1.getTurnoa()));
		lj1.ezabatuJokalaria(0);
	}

}
