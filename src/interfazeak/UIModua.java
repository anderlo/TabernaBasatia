package interfazeak;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.BoxLayout;
import javax.swing.JButton;

public class UIModua extends JFrame {

	private JPanel contentPane;
	private static UIModua uiModua = null;
	
	public static void main(String[] args) {
		UIModua.getUIModua();
	}
	
	public static UIModua getUIModua() {
		if (uiModua==null) {
			uiModua=new UIModua();
		}
		return uiModua;
	}
	
	private UIModua() {
		setBounds(800, 400, 191, 238);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		contentPane = 	new JPanel();
		JPanel panela = 	new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		panela.setLayout(new BoxLayout(panela, BoxLayout.Y_AXIS));

		
		JButton btnModuNormala = new JButton("Modu normala");
		btnModuNormala.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				UITablero.main(null);
				UIEskua.main(null);
				uiModua.dispose();
			}
		});
		
		JButton btnModuKonpetitiboa = new JButton("Modu konpetitiboa");
		btnModuKonpetitiboa.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				UIKonpetitiboa uIKonpetitiboa = UIKonpetitiboa.getKonpetitiboa();
				uIKonpetitiboa.main(null);
				uiModua.dispose();
			}
		});
		panela.add(btnModuNormala);
		panela.add(btnModuKonpetitiboa);
		
		contentPane.add(panela);
		pack();
		setVisible(true);
		
	}
}
