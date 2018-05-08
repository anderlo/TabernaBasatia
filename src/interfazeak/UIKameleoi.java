package interfazeak;

import java.awt.EventQueue;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import kartak.KartaAnimali;
import kartak.KartaFactory;
import kodea.Jokoa;
import kodea.KartaNodo;
import kodea.ListaKartakTableroan;
import kodea.Tablero;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JButton;

public class UIKameleoi extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static boolean main() {
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
		return true;
	}

	/**
	 * Create the frame.
	 */
	public UIKameleoi() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		UIEskua.getUIEskua().setEnabled(false);
		UITablero.getTableroa().setEnabled(false);
		setBounds(100, 100, 228, 300);
		setLocationRelativeTo(null);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 212, 261);
		contentPane.add(panel);
		
		ArrayList<KartaAnimali> kartak = ListaKartakTableroan.getNireListaKartakTableroan().getKartak();
		kartak.remove(kartak.size()-1);
		KartaNodo kN = ListaKartakTableroan.getNireListaKartakTableroan().getKartaListan(ListaKartakTableroan.getNireListaKartakTableroan().luzera()-1);
		//Try catch-aren bidez tableroan 4 karta baino gutxiago daudenean agertzen den errorea saihesten dugu.
		try {
			
			JButton btnNewButton = new JButton(kartak.get(0).getIzena());
			btnNewButton.setBounds(66, 55, 89, 23);
			panel.add(btnNewButton);
			
			btnNewButton.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					// TODO Auto-generated method stub
					KartaAnimali ka = null;
					ka=KartaFactory.getKartaFactory().createKarta(Jokoa.getJokoa().getJokalariak().getKolorea(), KartaFactory.getKartaFactory().lortuZenb(btnNewButton.getText()));
					ka.aldatuEgoeraBerezia();
					kN.setKarta(ka);
					Jokoa.getJokoa().kamaleoiEgoera();
					kN.getKarta().animaladaBurutu();
					UIEskua.getUIEskua().setEnabled(true);
					UITablero.getTableroa().setEnabled(true);
					UIKameleoi.this.dispose();
					try {
						Jokoa.getJokoa().kartaErrekurtsiboakAktibatu();
					} catch (Exception e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
					Jokoa.getJokoa().aldatuta();
					if(Jokoa.getJokoa().getTablero().getJokoan().luzera()==5) {
						Jokoa.getJokoa().getTablero().getJokoan().zeruaKalea();
					}
					Jokoa.getJokoa().aldatuta();
				}
			});
			
			JButton btnNewButton_1 = new JButton(kartak.get(1).getIzena());
			btnNewButton_1.setBounds(66, 102, 89, 23);
			panel.add(btnNewButton_1);
			btnNewButton_1.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					// TODO Auto-generated method stub
					KartaAnimali ka = null;
					ka=KartaFactory.getKartaFactory().createKarta(Jokoa.getJokoa().getJokalariak().getKolorea(), KartaFactory.getKartaFactory().lortuZenb(btnNewButton_1.getText()));
					ka.aldatuEgoeraBerezia();
					kN.setKarta(ka);
					Jokoa.getJokoa().kamaleoiEgoera();
					kN.getKarta().animaladaBurutu();
					UIEskua.getUIEskua().setEnabled(true);
					UITablero.getTableroa().setEnabled(true);
					UIKameleoi.this.dispose();
					try {
						Jokoa.getJokoa().kartaErrekurtsiboakAktibatu();
					} catch (Exception e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
					Jokoa.getJokoa().aldatuta();
					if(Jokoa.getJokoa().getTablero().getJokoan().luzera()==5) {
						Jokoa.getJokoa().getTablero().getJokoan().zeruaKalea();
					}
					Jokoa.getJokoa().aldatuta();
				}
			});
			
			JButton btnNewButton_2 = new JButton(kartak.get(2).getIzena());
			btnNewButton_2.setBounds(66, 146, 89, 23);
			panel.add(btnNewButton_2);
			btnNewButton_2.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					// TODO Auto-generated method stub
					KartaAnimali ka = null;
					ka=KartaFactory.getKartaFactory().createKarta(Jokoa.getJokoa().getJokalariak().getKolorea(), KartaFactory.getKartaFactory().lortuZenb(btnNewButton_2.getText()));
					ka.aldatuEgoeraBerezia();
					kN.setKarta(ka);
					Jokoa.getJokoa().kamaleoiEgoera();
					kN.getKarta().animaladaBurutu();
					UIEskua.getUIEskua().setEnabled(true);
					UITablero.getTableroa().setEnabled(true);
					UIKameleoi.this.dispose();
					try {
						Jokoa.getJokoa().kartaErrekurtsiboakAktibatu();
					} catch (Exception e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
					Jokoa.getJokoa().aldatuta();
					if(Jokoa.getJokoa().getTablero().getJokoan().luzera()==5) {
						Jokoa.getJokoa().getTablero().getJokoan().zeruaKalea();
					}
					Jokoa.getJokoa().aldatuta();
				}
			});
			
			JButton btnNewButton_3 = new JButton(kartak.get(3).getIzena());
			btnNewButton_3.setBounds(66, 198, 89, 23);
			panel.add(btnNewButton_3);
			btnNewButton_3.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					// TODO Auto-generated method stub
					KartaAnimali ka = null;
					ka=KartaFactory.getKartaFactory().createKarta(Jokoa.getJokoa().getJokalariak().getKolorea(), KartaFactory.getKartaFactory().lortuZenb(btnNewButton_3.getText()));
					ka.aldatuEgoeraBerezia();
					kN.setKarta(ka);
					Jokoa.getJokoa().kamaleoiEgoera();
					kN.getKarta().animaladaBurutu();
					UIEskua.getUIEskua().setEnabled(true);
					UITablero.getTableroa().setEnabled(true);
					UIKameleoi.this.dispose();
					try {
						Jokoa.getJokoa().kartaErrekurtsiboakAktibatu();
					} catch (Exception e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
					Jokoa.getJokoa().aldatuta();
					if(Jokoa.getJokoa().getTablero().getJokoan().luzera()==5) {
						Jokoa.getJokoa().getTablero().getJokoan().zeruaKalea();
					}
					Jokoa.getJokoa().aldatuta();
				}
			});
			
			setVisible(true);
			panel.setLayout(null);
			
		} catch (IndexOutOfBoundsException e) {
			
		}
		
		
		
		
		JLabel lblZeinKartaKopiatuko = new JLabel("Zein Karta Kopiatuko duzu?");
		lblZeinKartaKopiatuko.setHorizontalAlignment(SwingConstants.CENTER);
		lblZeinKartaKopiatuko.setBounds(10, 11, 192, 14);
		panel.add(lblZeinKartaKopiatuko);
		
		
	}
}
