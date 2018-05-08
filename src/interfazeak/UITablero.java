package interfazeak;

import java.awt.BorderLayout;
import java.awt.Frame;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Observable;
import java.util.Observer;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import kartak.KartaAnimali;
import kodea.Jokoa;

import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class UITablero extends JFrame implements Observer {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private static UITablero uiTablero;
	
	
	public static UITablero getTableroa() {
		if (uiTablero==null) {
			uiTablero = new UITablero();
		}
		return uiTablero;
	}

	/**
	 * Create the frame.
	 */
	private UITablero() {
		Jokoa.getJokoa().addObserver(this);
	}
	
	public void uiTableroaSortu() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1164, 590);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0)); 
		setContentPane(contentPane);
		
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		
		ImageIcon image1 = new ImageIcon (new ImageIcon("Images/ZerukoAtea.jpg").getImage().getScaledInstance(143, 251, Image.SCALE_DEFAULT));
		JLabel lblZerukoAtea = new JLabel(image1);
		lblZerukoAtea.setBounds(40, 242, 143, 251);
		panel.add(lblZerukoAtea);
		
		ImageIcon image2 = new ImageIcon (new ImageIcon("Images/Ostikada.jpg").getImage().getScaledInstance(143, 251, Image.SCALE_DEFAULT));
		JLabel lblOstikada = new JLabel(image2);
		lblOstikada.setBounds(958, 242, 143, 251);
		panel.add(lblOstikada);
		
		ArrayList<KartaAnimali> kartak = Jokoa.getJokoa().getTablero().getJokoan().getKartak();
		
		if (kartak.size()>0) {
			ImageIcon imageKarta1 = new ImageIcon (new ImageIcon(kartak.get(0).getPath()).getImage().getScaledInstance(143, 122, Image.SCALE_DEFAULT));
			JLabel karta1 = new JLabel(imageKarta1);
			karta1.setBounds(193, 371, 143, 122);
			panel.add(karta1);
		}
		
		if (kartak.size()>1) {
			ImageIcon imageKarta2 = new ImageIcon (new ImageIcon(kartak.get(1).getPath()).getImage().getScaledInstance(143, 122, Image.SCALE_DEFAULT));
			JLabel karta2 = new JLabel(imageKarta2);
			karta2.setBounds(346, 371, 143, 122);
			panel.add(karta2);
		}
		
		if (kartak.size()>2) {
			ImageIcon imageKarta3 = new ImageIcon (new ImageIcon(kartak.get(2).getPath()).getImage().getScaledInstance(143, 122, Image.SCALE_DEFAULT));
			JLabel karta3 = new JLabel(imageKarta3);
			karta3.setBounds(499, 371, 143, 122);
			panel.add(karta3);
		}
		
		if (kartak.size()>3) {
			ImageIcon imageKarta4 = new ImageIcon (new ImageIcon(kartak.get(3).getPath()).getImage().getScaledInstance(143, 122, Image.SCALE_DEFAULT));
			JLabel karta4 = new JLabel(imageKarta4);
			karta4.setBounds(652, 371, 143, 122);
			panel.add(karta4);
		}
		
		if (kartak.size()>4) {
			ImageIcon imageKarta5 = new ImageIcon (new ImageIcon(kartak.get(4).getPath()).getImage().getScaledInstance(143, 122, Image.SCALE_DEFAULT));
			JLabel karta5 = new JLabel(imageKarta5);
			karta5.setBounds(805, 371, 143, 122);
			panel.add(karta5);
		}
		
		ImageIcon image3 = new ImageIcon (new ImageIcon("Images/TabernaBasatia.jpg").getImage().getScaledInstance(250, 314, Image.SCALE_DEFAULT));
		JLabel lblTabernaBasatia = new JLabel(image3);
		lblTabernaBasatia.setBounds(239, 23, 250, 314);
		panel.add(lblTabernaBasatia);
		
		ImageIcon image4 = new ImageIcon (new ImageIcon("Images/TokatuZaizu.jpg").getImage().getScaledInstance(250, 314, Image.SCALE_DEFAULT));
		JLabel lblTokatuZaizu = new JLabel(image4);
		lblTokatuZaizu.setBounds(652, 23, 250, 314);
		panel.add(lblTokatuZaizu);
		
		JLabel nirePuntuak = new JLabel("Nire Puntuak");
		nirePuntuak.setBounds(70,10,75,40);
		nirePuntuak.setVisible(true);
		panel.add(nirePuntuak);
		
		JTextField puntuak = new JTextField();
		puntuak.setBounds(100, 25, 50, 50);
		puntuak.setBorder(null);
		puntuak.setVisible(true);
		puntuak.setEditable(false);
		puntuak.setText(Jokoa.getJokoa().lortuPuntuak(1));
		panel.add(puntuak);
		
		JLabel berePuntuak = new JLabel("Bere Puntuak");
		berePuntuak.setBounds(70,60,80,40);
		berePuntuak.setVisible(true);
		panel.add(berePuntuak);
		
		JTextField puntuak_2 = new JTextField();
		puntuak_2.setBounds(100, 75, 50, 50);
		puntuak_2.setBorder(null);
		puntuak_2.setVisible(true);
		puntuak_2.setEditable(false);
		puntuak_2.setText(Jokoa.getJokoa().lortuPuntuak(2));
		panel.add(puntuak_2);
		
		JButton feed = new JButton("Feed");
		feed.setBounds(980,45,75,75);
		feed.setVisible(true);
		panel.add(feed);
		feed.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
			}
		});
		
		
		setVisible(true);
	}

	@Override
	public void update(Observable o, Object arg) {
		// TODO Auto-generated method stub
		uiTableroaSortu();
		}
}
