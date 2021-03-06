package interfazeak;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import kodea.Jokoa;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;

public class UIModua extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
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
	public void hustu(){
		uiModua=null;
	}
	
	private UIModua() {
		setBounds(800, 400, 191, 238);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null); //Pantailaren erdian
		contentPane = 	new JPanel();
		JPanel panela = 	new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);

		
		JButton btnModuNormala = new JButton("Modu normala");
		btnModuNormala.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				Jokoa.getJokoa().hasieratuJokoa(false, null);
				UITablero.getTableroa().uiTableroaSortu();;
				UIEskua.getUIEskua().uiEskuaSortu();
				uiModua.dispose();
			}
		});
		
		JButton btnModuKonpetitiboa = new JButton("Modu konpetitiboa");
		btnModuKonpetitiboa.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				UIKonpetitiboa.getKonpetitiboa();
				uiModua.dispose();
			}
		});
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addComponent(panela, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addComponent(panela, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
		);
		GroupLayout gl_panela = new GroupLayout(panela);
		gl_panela.setHorizontalGroup(
			gl_panela.createParallelGroup(Alignment.LEADING)
				.addComponent(btnModuKonpetitiboa, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
				.addComponent(btnModuNormala, GroupLayout.DEFAULT_SIZE, 121, Short.MAX_VALUE)
		);
		gl_panela.setVerticalGroup(
			gl_panela.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panela.createSequentialGroup()
					.addComponent(btnModuNormala, GroupLayout.DEFAULT_SIZE, 23, Short.MAX_VALUE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(btnModuKonpetitiboa, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
		);
		panela.setLayout(gl_panela);
		contentPane.setLayout(gl_contentPane);
		pack();
		setVisible(true);
		
	}
}
