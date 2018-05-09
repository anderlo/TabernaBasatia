package interfazeak;

import java.awt.BorderLayout;
import java.awt.Image;
import java.util.ArrayList;
import java.util.Observable;
import java.util.Observer;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import kartak.KartaAnimali;
import kodea.Jokoa;

public class UIEskua extends JFrame implements Observer {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private static UIEskua uiEskua;
	private JPanel contentPane;
	private UIKarta[] UIkartak;


	/**
	 * Create the frame.
	 */
	public static UIEskua getUIEskua() {
		if (uiEskua==null) {
			uiEskua = new UIEskua();
		}
		return uiEskua;
	}
	
	private UIEskua() {
		Jokoa.getJokoa().addObserver(this);
	}
	
	public void uiEskuaSortu() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(320, 575, 650, 190);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		ArrayList<KartaAnimali> kartak = Jokoa.getJokoa().getJokalariak().getTurnoaDuenJokalaria().getEskua().getKartak();
		UIkartak = new UIKarta[4];
		
		if (kartak.size()>0) {
			UIKarta karta1 = new UIKarta(kartak.get(0).getPath(), kartak.get(0).getIzena());
			ImageIcon image1 = new ImageIcon (new ImageIcon(karta1.getPath()).getImage().getScaledInstance(143, 122, Image.SCALE_DEFAULT));
			karta1.setIcon(image1);
			karta1.setBounds(10, 11, 143, 122);
			UIkartak[0] = karta1;
			panel.add(karta1);			
		}
		
		if (kartak.size()>1) {
			UIKarta karta2 = new UIKarta(kartak.get(1).getPath(), kartak.get(1).getIzena());
			ImageIcon image2 = new ImageIcon (new ImageIcon(karta2.getPath()).getImage().getScaledInstance(143, 122, Image.SCALE_DEFAULT));
			karta2.setIcon(image2);
			karta2.setBounds(163, 11, 143, 122);
			UIkartak[1] = karta2;
			panel.add(karta2);
		}
		
		if (kartak.size()>2) {
			UIKarta karta3 = new UIKarta(kartak.get(2).getPath(), kartak.get(2).getIzena());
			ImageIcon image3 = new ImageIcon (new ImageIcon(karta3.getPath()).getImage().getScaledInstance(143, 122, Image.SCALE_DEFAULT));
			karta3.setIcon(image3);
			karta3.setBounds(316, 11, 143, 122);
			UIkartak[2] = karta3;
			panel.add(karta3);
		}
		
		if (kartak.size()>3) {
			UIKarta karta4 = new UIKarta(kartak.get(3).getPath(), kartak.get(3).getIzena());
			ImageIcon image4 = new ImageIcon (new ImageIcon(karta4.getPath()).getImage().getScaledInstance(143, 122, Image.SCALE_DEFAULT));
			karta4.setIcon(image4);
			karta4.setBounds(469, 11, 143, 122);
			UIkartak[3] = karta4;
			panel.add(karta4);
		}
		
		setVisible(true);
	}

	@Override
	public void update(Observable o, Object arg) {
		// TODO Auto-generated method stub
		uiEskuaSortu();
	}

}
