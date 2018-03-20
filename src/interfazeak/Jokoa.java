package interfazeak;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class Jokoa extends JFrame {
	private static Jokoa nNormala = null;
	private JPanel contentPane;
	private Karta[] jokalariarenEskua;
	private Karta[] ordenagailuarenEskua;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Jokoa frame = new Jokoa();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	public static Jokoa getNormala() {
		if (nNormala == null) {
			nNormala = new Jokoa();
		}
		return nNormala;
	}

	/**
	 * Create the frame.
	 */
	private Jokoa() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
	}
	
	

}
