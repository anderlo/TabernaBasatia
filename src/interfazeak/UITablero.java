package interfazeak;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class UITablero extends JFrame {
	private static UITablero nNormala = null;
	private JPanel contentPane;
	private UIKarta[] jokalariarenEskua;
	private UIKarta[] ordenagailuarenEskua;

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
	
	public static UITablero getNormala() {
		if (nNormala == null) {
			nNormala = new UITablero();
		}
		return nNormala;
	}

	/**
	 * Create the frame.
	 */
	private UITablero() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
	}
	

}
