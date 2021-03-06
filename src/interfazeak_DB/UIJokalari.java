package interfazeak_DB;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import interfazeak.UIJokoa;
import interfazeak.UIModua;
import klaseak_DB.Jokalari;
import logika_DB.klase_Erregistroa;
import logika_DB.klase_Jokoa;
import logika_DB.klase_sesioak;

import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JTextField;

public class UIJokalari extends JFrame {

	private JPanel contentPane;
	private klase_Jokoa KJ = new klase_Jokoa();
	private klase_sesioak KS = new klase_sesioak();
	private klase_Erregistroa KE = new klase_Erregistroa();
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			private Object testua;

			public void run() {
				try {
					UIJokalari frame = new UIJokalari();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}

			private void setIzena(String nickIzena) {
				// TODO Auto-generated method stub
				((JLabel) this.testua).setText(nickIzena);
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public UIJokalari() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		setLocationRelativeTo(null);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 434, 261);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblJokalariarenPanela = new JLabel("JOKALARIAREN PANELA");
		lblJokalariarenPanela.setFont(new Font("Arial", Font.BOLD, 14));
		lblJokalariarenPanela.setHorizontalAlignment(SwingConstants.CENTER);
		lblJokalariarenPanela.setBounds(10, 36, 414, 14);
		panel.add(lblJokalariarenPanela);
		
		JButton btnSesioaAmaitu = new JButton("Sesioa Amaitu");
		btnSesioaAmaitu.setBounds(303, 227, 121, 23);
		panel.add(btnSesioaAmaitu);
		btnSesioaAmaitu.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				UIHasiera.main(null);
				UIJokalari.this.dispose();
			}
			
		});
		
		JButton btnJokatu = new JButton("Jokatu");
		Jokalari jok = new Jokalari();
		jok.setNick(KS.lortuIzena());
		if (KE.jokalariNull(jok)) {
			btnJokatu.setVisible(false);
		}else {
			btnJokatu.setVisible(true);
		}
		btnJokatu.setBounds(164, 82, 110, 23);
		panel.add(btnJokatu);
		btnJokatu.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				UIModua.main(null);
				UIJokalari.this.dispose();
			}
		});
		
		JButton btnRankinga = new JButton("Ranking-a");
		btnRankinga.setBounds(164, 121, 110, 23);
		panel.add(btnRankinga);
		btnRankinga.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				UIRanking.main(null);
				UIJokalari.this.dispose();
			}
		});
		
	}
}
