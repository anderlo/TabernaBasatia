package test.kartak;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import kartak.KartaAnimali;
import kartak.KartaFactory;
import kartak.ListaKartakFactory;
import kodea.Jokalari;
import kodea.ListaKartak;
import kodea.Pertsona;

class TestJokalari {
	
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
		l1=null;
		j1=null;
		k1=null;
	}

	@Test
	void testJokalari() {
		
		assertNotNull(j1);
	}

	@Test
	void testBarajanSartu() {
		j1.barajanSartu(l1);
		assertNotNull(j1.getBaraja());
	}
	@Test
	void testEskuanSartu() {
		j1.eskuanSartu();
		assertNotNull(j1.getEskua());
	}
	
		@Test
		void testKartaSartu() {
			j1.kartaSartu(k1);
			assertNotNull(j1.getEskua());
		}

}
