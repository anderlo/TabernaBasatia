package interfazeak;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.xml.bind.SchemaOutputResolver;

import kodea.Tablero;

import javax.swing.JLabel;
import javax.swing.JList;
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
		
		JList list = new JList(Tablero.getTableroa().getFeed().toArray());
		
		
		JScrollPane scrollPane = new JScrollPane(list);
		scrollPane.setBounds(10, 36, 188, 179);
		panel.add(scrollPane);
		
		
		JButton btnAtera = new JButton("Atera");
		btnAtera.setBounds(109, 226, 89, 23);
		panel.add(btnAtera);
		btnAtera.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				UIFeed.this.dispose();
			}
		});
	}
}
