package interfazeak;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.border.EmptyBorder;

public class UIEskua extends JFrame {

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
		
		JTextArea textKarta1 = new JTextArea();
		textKarta1.setText("Karta1");
		textKarta1.setBounds(10, 11, 143, 122);
		panel.add(textKarta1);
		
		JTextArea textKarta2 = new JTextArea();
		textKarta2.setText("Karta2");
		textKarta2.setBounds(163, 11, 143, 122);
		panel.add(textKarta2);
		
		JTextArea textKarta3 = new JTextArea();
		textKarta3.setText("Karta3");
		textKarta3.setBounds(316, 11, 143, 122);
		panel.add(textKarta3);
		
		JTextArea textKarta4 = new JTextArea();
		textKarta4.setText("Karta4");
		textKarta4.setBounds(469, 11, 143, 122);
		panel.add(textKarta4);
	}
}
