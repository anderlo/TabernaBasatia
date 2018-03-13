package interfazeak;

import javax.swing.JFrame;

public class Konpetitiboa extends JFrame {
	private static Konpetitiboa nKonpetitiboa = null;
	
	private Konpetitiboa() {}
	
	public static Konpetitiboa getKonpetitiboa() {
		if (nKonpetitiboa == null) {
			nKonpetitiboa = new Konpetitiboa();
		}
		return nKonpetitiboa;
	}

	public void hasieratu() {
		// TODO Auto-generated method stub
		
	}
}
