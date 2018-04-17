package interfazeak;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Image;
import java.util.ArrayList;
import java.util.Observable;
import java.util.Observer;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.border.EmptyBorder;

import kartak.KartaAnimali;
import kodea.Jokalari;
import kodea.Jokoa;

public class UIEskua extends JFrame implements Observer {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					UIEskua frame = new UIEskua();
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
	public UIEskua() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(300, 700, 650, 190);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		ArrayList<KartaAnimali> kartak = Jokoa.getJokoa().getJokalariak().getTurnoaDuenJokalaria().getEskua().getKartak();
		
		UIKarta karta1 = new UIKarta(kartak.get(0).getPath());
		ImageIcon image1 = new ImageIcon (new ImageIcon(karta1.getPath()).getImage().getScaledInstance(143, 122, Image.SCALE_DEFAULT));
		karta1.setIcon(image1);
		karta1.setBounds(10, 11, 143, 122);
		panel.add(karta1);
		
		UIKarta karta2 = new UIKarta(kartak.get(1).getPath());
		ImageIcon image2 = new ImageIcon (new ImageIcon(karta2.getPath()).getImage().getScaledInstance(143, 122, Image.SCALE_DEFAULT));
		karta2.setIcon(image2);
		karta2.setBounds(163, 11, 143, 122);
		panel.add(karta2);
		
		UIKarta karta3 = new UIKarta(kartak.get(2).getPath());
		ImageIcon image3 = new ImageIcon (new ImageIcon(karta3.getPath()).getImage().getScaledInstance(143, 122, Image.SCALE_DEFAULT));
		karta3.setIcon(image3);
		karta3.setBounds(316, 11, 143, 122);
		panel.add(karta3);
		
		UIKarta karta4 = new UIKarta(kartak.get(3).getPath());
		ImageIcon image4 = new ImageIcon (new ImageIcon(karta4.getPath()).getImage().getScaledInstance(143, 122, Image.SCALE_DEFAULT));
		karta4.setIcon(image4);
		karta4.setBounds(469, 11, 143, 122);
		panel.add(karta4);
	}

	@Override
	public void update(Observable o, Object arg) {
		// TODO Auto-generated method stub
		
	}
}
