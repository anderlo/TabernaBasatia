package interfazeak;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Image;
import java.awt.Window;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextArea;

public class UITablero extends JFrame {
	private static UITablero nNormala = null;
	private JPanel contentPane;
	private UIKarta[] jokalariarenEskua;
	private UIKarta[] ordenagailuarenEskua;
	private static UITablero uiTablero;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					UITablero frame = new UITablero();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
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
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1164, 590);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		
		ImageIcon image = new ImageIcon (new ImageIcon("Images/ZerukoAtea.jpg").getImage().getScaledInstance(143, 251, Image.SCALE_DEFAULT));
		JLabel lblZerukoAtea = new JLabel(image);
		lblZerukoAtea.setBounds(40, 242, 143, 251);
		panel.add(lblZerukoAtea);
		
		ImageIcon image2 = new ImageIcon (new ImageIcon("Images/Ostikada.jpg").getImage().getScaledInstance(143, 251, Image.SCALE_DEFAULT));
		JLabel lblOstikada = new JLabel(image2);
		lblOstikada.setBounds(958, 242, 143, 251);
		panel.add(lblOstikada);
		
		JTextArea textKarta1 = new JTextArea();
		textKarta1.setText("Karta1");
		textKarta1.setBounds(193, 371, 143, 122);
		panel.add(textKarta1);
		
		JTextArea textKarta2 = new JTextArea();
		textKarta2.setText("Karta2");
		textKarta2.setBounds(346, 371, 143, 122);
		panel.add(textKarta2);
		
		JTextArea textKarta3 = new JTextArea();
		textKarta3.setText("Karta3");
		textKarta3.setBounds(499, 371, 143, 122);
		panel.add(textKarta3);
		
		JTextArea textKarta4 = new JTextArea();
		textKarta4.setText("Karta4");
		textKarta4.setBounds(652, 371, 143, 122);
		panel.add(textKarta4);
		
		JTextArea textKarta5 = new JTextArea();
		textKarta5.setText("Karta5");
		textKarta5.setBounds(805, 371, 143, 122);
		panel.add(textKarta5);
		
		ImageIcon image3 = new ImageIcon (new ImageIcon("Images/TabernaBasatia.jpg").getImage().getScaledInstance(250, 314, Image.SCALE_DEFAULT));
		JLabel lblTabernaBasatia = new JLabel(image3);
		lblTabernaBasatia.setBounds(239, 23, 250, 314);
		panel.add(lblTabernaBasatia);
		
		ImageIcon image4 = new ImageIcon (new ImageIcon("Images/TokatuZaizu.jpg").getImage().getScaledInstance(250, 314, Image.SCALE_DEFAULT));
		JLabel lblTokatuZaizu = new JLabel(image4);
		lblTokatuZaizu.setBounds(652, 23, 250, 314);
		panel.add(lblTokatuZaizu);
	}
}
