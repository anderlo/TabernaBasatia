package kartak;

import kodea.ListaKartak;

public class KartaFactory {
	private static KartaFactory nKartaFactory;
	private KartaFactory (){}
	public static KartaFactory getKartaFactory(){
	 if (nKartaFactory == null) {nKartaFactory = new KartaFactory();}
	return nKartaFactory;
	}
	public KartaAnimali createKarta (String kolore,Integer zenbakia) {
		KartaAnimali karta = null;
		switch (zenbakia) {
		case 1:
			karta = new Mofeta(kolore,zenbakia);
			break;
		case 2:
			karta = new Loro(kolore,zenbakia);
			break;
		case 3:
			karta = new Kanguru(kolore,zenbakia);
			break;
		case 4:
			karta = new Tximino(kolore,zenbakia);
			break;
		case 5:
			karta = new Kameleoi(kolore,zenbakia);
			break;
		case 6:
			karta = new Foka(kolore,zenbakia);
			break;
		case 7:
			karta = new Zebra(kolore,zenbakia);
			break;
		case 8:
			karta = new Jirafa(kolore,zenbakia);
			break;
		case 9:
			karta = new Suge(kolore,zenbakia);
			break;
		case 10:
			karta = new Krokodilo(kolore,zenbakia);
			break;
		case 11:
			karta = new Hipopotamo(kolore,zenbakia);
			break;
		case 12:
			karta = new Lehoi(kolore,zenbakia);
			break;
		}
		return karta;
	}
	public KartaBerezia createKarta (String izena) {
		KartaBerezia karta = null;
		if ((izena=="ostikada") || (izena=="Ostikada")){
			karta = new Ostikada();
		}
		if ((izena=="zerukoatea") || (izena=="Zerukoatea")){
			karta = new ZerukoAtea();
		}
		return karta;
	}
} 
