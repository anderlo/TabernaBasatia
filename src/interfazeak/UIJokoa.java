package interfazeak;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import kodea.Jokoa;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;

public class UIJokoa extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					UIJokoa frame = new UIJokoa();
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
	public UIJokoa() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(5, 5, 440, 267);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JButton btnJokatu = new JButton("Jokoa");
		btnJokatu.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				Jokoa.getJokoa().hasieratuJokoa();
				setVisible(false);
			}
		});
		btnJokatu.setBounds(166, 232, 117, 29);
		panel.add(btnJokatu);
		
		
		ImageIcon image = new ImageIcon("Images/BarBestial.png");
		
		JLabel lblArgazkia = new JLabel(image);
		lblArgazkia.setBounds(0, 0, 440, 267);
		panel.add(lblArgazkia);
	}
}
