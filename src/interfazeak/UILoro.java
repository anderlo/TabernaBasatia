package interfazeak;

import java.awt.EventQueue;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

import kartak.KartaAnimali;
import kartak.Loro;
import kodea.Jokoa;
import kodea.ListaKartakTableroan;
import kodea.Tablero;
import javax.swing.JButton;

public class UILoro extends JFrame {

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
					UILoro frame = new UILoro();
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
	public UILoro() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		UIEskua.getUIEskua().setEnabled(false);
		UITablero.getTableroa().setEnabled(false);
		setBounds(100, 100, 271, 300);
		setLocationRelativeTo(null);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 258, 261);
		contentPane.add(panel);
		
		ArrayList<KartaAnimali> kartak = ListaKartakTableroan.getNireListaKartakTableroan().getKartak();
		kartak.remove(kartak.size()-1);
		//Try catch-aren bidez tableroan 4 karta baino gutxiago daudenean agertzen den errorea saihesten dugu.
		try {
			panel.setLayout(null);
			
			JButton btnNewButton = new JButton(kartak.get(0).getIzena());
			btnNewButton.setBounds(81, 36, 89, 23);
			panel.add(btnNewButton);
			btnNewButton.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					// TODO Auto-generated method stub
					Loro.getBota().tablerotikAtera(0);
					UILoro.this.dispose();
					UIEskua.getUIEskua().setEnabled(true);
					UITablero.getTableroa().setEnabled(true);
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
					Tablero.getTableroa().turnoaAldatu();
					Jokoa.getJokoa().aldatuta();
					
				}
			});
			
			JButton btnNewButton_1 = new JButton(kartak.get(1).getIzena());
			btnNewButton_1.setBounds(81, 70, 89, 23);
			panel.add(btnNewButton_1);
			btnNewButton_1.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					// TODO Auto-generated method stub
					Loro.getBota().tablerotikAtera(1);
					UILoro.this.dispose();
					UIEskua.getUIEskua().setEnabled(true);
					UITablero.getTableroa().setEnabled(true);
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
					Tablero.getTableroa().turnoaAldatu();
					Jokoa.getJokoa().aldatuta();
					
				}
			});
			
			JButton btnNewButton_2 = new JButton(kartak.get(2).getIzena());
			btnNewButton_2.setBounds(81, 104, 89, 23);
			panel.add(btnNewButton_2);
			btnNewButton_2.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					// TODO Auto-generated method stub
					Loro.getBota().tablerotikAtera(2);
					UILoro.this.dispose();
					UIEskua.getUIEskua().setEnabled(true);
					UITablero.getTableroa().setEnabled(true);
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
					Tablero.getTableroa().turnoaAldatu();
					Jokoa.getJokoa().aldatuta();
					
				}
			});
			
			JButton btnNewButton_3 = new JButton(kartak.get(3).getIzena());
			btnNewButton_3.setBounds(81, 138, 89, 23);
			panel.add(btnNewButton_3);
			btnNewButton_3.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					// TODO Auto-generated method stub
					Loro.getBota().tablerotikAtera(3);
					UILoro.this.dispose();
					UIEskua.getUIEskua().setEnabled(true);
					UITablero.getTableroa().setEnabled(true);
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
					Tablero.getTableroa().turnoaAldatu();
					Jokoa.getJokoa().aldatuta();
				}
			});
			setVisible(true);
			
		} catch (IndexOutOfBoundsException e) {
			
		}
		
		
		JLabel lblZeinKartaOstikada = new JLabel("Zein Karta Botako duzu?");
		lblZeinKartaOstikada.setHorizontalAlignment(SwingConstants.CENTER);
		lblZeinKartaOstikada.setBounds(10, 11, 237, 14);
		panel.add(lblZeinKartaOstikada);
		
	}
}
