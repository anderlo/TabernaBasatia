package interfazeak;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import kartak.KartaAnimali;
import kartak.KartaFactory;
import kartak.OrdenatuNormala;
import kodea.Jokoa;

import javax.swing.JButton;

public class UITurnoa extends JFrame {

	private JPanel contentPane;
	
	public UITurnoa() {
		setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		setBounds(700, 400, 150, 150);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JButton btnNewButton = new JButton("Turnoa amaitu");
		contentPane.add(btnNewButton, BorderLayout.CENTER);
		btnNewButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				Jokoa.getJokoa().getJokalariak().turnoaPasatu();
				try {
					Jokoa.getJokoa().getJokalariak().getTurnoaDuenJokalaria().kartaJokatu();
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				Jokoa.getJokoa().getJokalariak().turnoaPasatu();
				Jokoa.getJokoa().aldatuta();
				dispose();
			}
		});
		setVisible(true);
	}

}
