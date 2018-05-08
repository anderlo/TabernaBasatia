package interfazeak;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JScrollPane;
import javax.swing.JButton;

public class UIFeed extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					UIFeed frame = new UIFeed();
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
	public UIFeed() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 224, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 208, 261);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblOrainArteJokatu = new JLabel("Orain arte jokatu diren kartak");
		lblOrainArteJokatu.setHorizontalAlignment(SwingConstants.CENTER);
		lblOrainArteJokatu.setBounds(10, 11, 188, 14);
		panel.add(lblOrainArteJokatu);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 36, 188, 179);
		panel.add(scrollPane);
		
		JButton btnAtera = new JButton("Atera");
		btnAtera.setBounds(109, 226, 89, 23);
		panel.add(btnAtera);
	}
}
