/**
 * 
 */
package test.kartak;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

import kartak.KartaAnimali;
import kartak.KartaBerezia;
import kartak.KartaFactory;

/**
 * @author ander
 *
 */
class TestKartaFactory {
	String[] animaliak = {"Mofeta","Loro","Kanguru","Tximino","Kameleoi","Foka","Zebra","Jirafa","Suge","Krokodilo","Hipopotamo","Lehoi"};
	/**
	 * Test method for {@link kartak.KartaFactory#getKartaFactory()}.
	 */
	@Test
	final void testGetKartaFactory() {
		//KartaFactory.getKartaFactory();
		assertNotNull(KartaFactory.getKartaFactory());
	}

	/**
	 * Test method for {@link kartak.KartaFactory#createKarta(java.lang.String, java.lang.Integer)}.
	 */
	@Test
	final void testCreateKartaStringInteger() {
		//LAU EGOERA POSIBLE DAUDE: Kolore eta zenbakia ondo edo txarto egotearen konbinazioak:
		//1 EGOERA : Zenbakia ondo kolorea ondo
		KartaAnimali karta1;
		for (int i = 0; i < 12; i++) {
			karta1 = KartaFactory.getKartaFactory().createKarta("Berdea", i+1);
			assertEquals("/Images/"+animaliak[i]+"Berdea.png", karta1.getPath());	
		}
		//2 EGOERA : Zenbakia ondo kolorea txarto (sortuko du baina kolore balioan ez du ezer edukiko)
		KartaAnimali karta2 ;
		for (int x = 0; x < 12; x++) {
			karta2 = KartaFactory.getKartaFactory().createKarta("noestoybien", x+1);
			assertNull(karta2.getPath());
		}
		//3 EGOERA : Zenbakia txarto kolorea ondo
		KartaAnimali karta3 = KartaFactory.getKartaFactory().createKarta("Berdea", 14);
		assertNull(karta3);
		//4 EGOERA : Zenbakia txarto kolorea txarto
		KartaAnimali karta4 = KartaFactory.getKartaFactory().createKarta("noestoybien", 14);
		assertNull(karta4);
	}

	/**
	 * Test method for {@link kartak.KartaFactory#createKarta(java.lang.String)}.
	 */
	@Test
	final void testCreateKartaString() {
		KartaBerezia karta5 = KartaFactory.getKartaFactory().createKarta("noestoybien");
		assertNull(karta5);
		KartaBerezia karta6 = KartaFactory.getKartaFactory().createKarta("Ostikada");
		assertEquals("/Images/Ostikada.png", karta6.getPath());
		KartaBerezia karta7 = KartaFactory.getKartaFactory().createKarta("Zerukoatea");
		assertEquals("/Images/ZerukoAtea.png", karta7.getPath());

		
	}

}
