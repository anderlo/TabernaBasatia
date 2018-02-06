package interfazeak;

import java.awt.BorderLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.BoxLayout;
import javax.swing.JButton;

public class UIModua extends JFrame {

	private JPanel contentPane;
	public static void main(String[] args) {
		new UIModua();
	}
	public UIModua() {
		setBounds(800, 400, 440, 150);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setResizable(false);
		
		contentPane = 	new JPanel();
		JPanel panela = 	new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		panela.setLayout(new BoxLayout(panela, BoxLayout.Y_AXIS));

		
		JButton btnModuNormala = new JButton("Modu normala");
		panela.add(btnModuNormala);
		
		JButton btnModuKonpetitiboa = new JButton("Modu konpetitiboa");
		panela.add(btnModuKonpetitiboa);
		
		contentPane.add(panela);
		pack();
		setVisible(true);
		
	}
}
