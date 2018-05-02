
package interfazeak;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import kartak.Kanguru;
import kodea.Jokoa;
import kodea.ListaKartakTableroan;

import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.JButton;

public class UIKanguru extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private static int zenbatSalto = 0;

	/**
	 * Launch the application.
	 * @return 
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					UIKanguru frame = new UIKanguru();
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
	public UIKanguru() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 183, 147);
		contentPane = new JPanel();
		setLocationRelativeTo(null);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 167, 109);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblZenbatSaltoEman = new JLabel("Zenbat Salto?");
		lblZenbatSaltoEman.setHorizontalAlignment(SwingConstants.CENTER);
		lblZenbatSaltoEman.setBounds(10, 11, 147, 14);
		panel.add(lblZenbatSaltoEman);
		
		JRadioButton saltoBatBtn = new JRadioButton("1");
		saltoBatBtn.setBounds(20, 34, 39, 23);
		saltoBatBtn.setSelected(true);
		panel.add(saltoBatBtn);
		
		JRadioButton saltoBiBtn = new JRadioButton("2");
		saltoBiBtn.setBounds(109, 34, 39, 23);
		panel.add(saltoBiBtn);
		
		ButtonGroup saltoTaldeBotoiak = new ButtonGroup();
		saltoTaldeBotoiak.add(saltoBatBtn);
		saltoTaldeBotoiak.add(saltoBiBtn);
		setVisible(true);
		
		JButton btnAurrera = new JButton("Aurrera");
		btnAurrera.setBounds(38, 73, 89, 23);
		panel.add(btnAurrera);
		btnAurrera.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				int pHasi = ListaKartakTableroan.getNireListaKartakTableroan().luzera()-1;
				if(saltoBatBtn.isSelected()) {
					Kanguru.getOrdenatu().ordenatu(pHasi, 1);
				}else {
					Kanguru.getOrdenatu().ordenatu(pHasi, 2);
				}
				UIKanguru.this.dispose();
				Jokoa.getJokoa().aldatuta();
			}
			
		});
		
		
	}
}
