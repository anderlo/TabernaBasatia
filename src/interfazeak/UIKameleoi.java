package interfazeak;

import java.awt.EventQueue;
import java.awt.Image;
import java.util.ArrayList;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import kartak.KartaAnimali;
import kodea.Tablero;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class UIKameleoi extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					UIKameleoi frame = new UIKameleoi();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public UIKameleoi() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 616, 300);
		setLocationRelativeTo(null);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 599, 261);
		contentPane.add(panel);
		
		ArrayList<KartaAnimali> kartak = Tablero.getTableroa().getJokoan().getKartak();
		//Try catch-aren bidez tableroan 4 karta baino gutxiago daudenean agertzen den errorea saihesten dugu.
		try {
			UIKarta karta1 = new UIKarta(kartak.get(0).getPath(), kartak.get(0).getIzena());
			ImageIcon image1 = new ImageIcon (new ImageIcon(karta1.getPath()).getImage().getScaledInstance(143, 122, Image.SCALE_DEFAULT));
			panel.setLayout(null);
			karta1.setIcon(image1);
			karta1.setBounds(10, 47, 137, 203);
			panel.add(karta1);
			
			UIKarta karta2 = new UIKarta(kartak.get(1).getPath(), kartak.get(1).getIzena());
			ImageIcon image2 = new ImageIcon (new ImageIcon(karta2.getPath()).getImage().getScaledInstance(143, 122, Image.SCALE_DEFAULT));
			karta2.setIcon(image2);
			karta2.setBounds(157, 47, 137, 203);
			panel.add(karta2);
			
			UIKarta karta3 = new UIKarta(kartak.get(2).getPath(), kartak.get(2).getIzena());
			ImageIcon image3 = new ImageIcon (new ImageIcon(karta3.getPath()).getImage().getScaledInstance(143, 122, Image.SCALE_DEFAULT));
			karta3.setIcon(image3);
			karta3.setBounds(304, 47, 137, 203);
			panel.add(karta3);
		
			UIKarta karta4 = new UIKarta(kartak.get(3).getPath(), kartak.get(3).getIzena());
			ImageIcon image4 = new ImageIcon (new ImageIcon(karta4.getPath()).getImage().getScaledInstance(143, 122, Image.SCALE_DEFAULT));
			karta4.setIcon(image4);
			karta4.setBounds(451, 47, 137, 203);
			panel.add(karta4);
			
			
		} catch (IndexOutOfBoundsException e) {
			
		}
		
		
		
		
		JLabel lblZeinKartaKopiatuko = new JLabel("Zein Karta Kopiatuko duzu?");
		lblZeinKartaKopiatuko.setHorizontalAlignment(SwingConstants.CENTER);
		lblZeinKartaKopiatuko.setBounds(10, 11, 578, 14);
		panel.add(lblZeinKartaKopiatuko);
		setVisible(true);
	}

}
