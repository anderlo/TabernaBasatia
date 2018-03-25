/**
 * 
 */
package test.kartak;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import kartak.Karta;
import kartak.KartaBerezia;
import kartak.KartaFactory;
import kartak.Ostikada;
import kartak.ZerukoAtea;
import kodea.Tablero;

/**
 * @author ander
 *
 */
class TestTablero {
	@Test
	final void testGetTableroa() {
		//assertNotNull(Tablero.getTableroa());
	}
	@Test
	final void testTablero() {
		Tablero tablero = Tablero.getTableroa();
		assertNotNull(tablero.getBarruan());
		assertNotNull(tablero.getJokoan());
		assertNotNull(tablero.getKanpoan());
		assertNotNull(tablero.getOstikada());
		assertNotNull(tablero.getZerukoatea());
		
		
	}
	@Test
	final void testKokatuOstikadaOstikada() {
		Ostikada karta = (Ostikada) KartaFactory.getKartaFactory().createKarta("Ostikada");
		Tablero.getTableroa().kokatuOstikada(karta);
		assertNotNull(Tablero.getTableroa().getOstikada());
	}

	@Test
	final void testKokatuZerukoAteaZerukoAtea() {
		ZerukoAtea karta = (ZerukoAtea) KartaFactory.getKartaFactory().createKarta("Zerukoatea");
		Tablero.getTableroa().kokatuZerukoAtea(karta);
		assertNotNull(Tablero.getTableroa().getZerukoatea());
	}

}
