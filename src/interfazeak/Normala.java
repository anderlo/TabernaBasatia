package interfazeak;

import javax.swing.JFrame;

public class Normala extends JFrame {
	private static Normala nNormala = null;
	
	private Normala() {}
	
	public static Normala getNormala() {
		if (nNormala == null) {
			nNormala = new Normala();
		}
		return nNormala;
	}

	public void hasieratu() {
		// TODO Auto-generated method stub
		
	}
}
