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
		
		ArrayList<KartaAnimali> kartak = ListaKartakTableroan.getNireListaKartakTableroan().getKartak();
		kartak.remove(kartak.size()-1);
		//Try catch-aren bidez tableroan 4 karta baino gutxiago daudenean agertzen den errorea saihesten dugu.
		try {
			
			JButton btnNewButton = new JButton(kartak.get(0).getIzena());
			btnNewButton.setBounds(250, 36, 89, 23);
			panel.add(btnNewButton);
			btnNewButton.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					// TODO Auto-generated method stub
					UIKameleoi.this.dispose();
				}
			});
			
			JButton btnNewButton_1 = new JButton(kartak.get(1).getIzena());
			btnNewButton_1.setBounds(250, 70, 89, 23);
			panel.add(btnNewButton_1);
			btnNewButton_1.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					// TODO Auto-generated method stub
					UIKameleoi.this.dispose();
				}
			});
			
			JButton btnNewButton_2 = new JButton(kartak.get(2).getIzena());
			btnNewButton_2.setBounds(250, 104, 89, 23);
			panel.add(btnNewButton_2);
			btnNewButton_2.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					// TODO Auto-generated method stub
					UIKameleoi.this.dispose();
				}
			});
			
			JButton btnNewButton_3 = new JButton(kartak.get(3).getIzena());
			btnNewButton_3.setBounds(250, 138, 89, 23);
			panel.add(btnNewButton_3);
			btnNewButton_3.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					// TODO Auto-generated method stub
					UIKameleoi.this.dispose();
				}
			});
			setVisible(true);
			
			panel.setLayout(null);
			
		} catch (IndexOutOfBoundsException e) {
			
		}
		
		
		
		
		JLabel lblZeinKartaKopiatuko = new JLabel("Zein Karta Kopiatuko duzu?");
		lblZeinKartaKopiatuko.setHorizontalAlignment(SwingConstants.CENTER);
		lblZeinKartaKopiatuko.setBounds(10, 11, 578, 14);
		panel.add(lblZeinKartaKopiatuko);
		
		
	}
}
