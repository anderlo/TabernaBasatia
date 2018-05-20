package interfazeak;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.util.ArrayList;

import javax.swing.*;
import javax.swing.border.EmptyBorder;

import kodea.Jokoa;

public class UIKonpetitiboa extends JFrame {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private static UIKonpetitiboa nKonpetitiboa=null;
	private JPanel contentPane;
	static ArrayList<JCheckBox> buttons = new ArrayList<>();
	private static JButton btnNewButton;
	private static int selectionCounter = 0;
	private static ArrayList<Integer> hautatuak = new ArrayList<Integer>();
	
	public static UIKonpetitiboa getKonpetitiboa() {
		if (nKonpetitiboa==null) {
			nKonpetitiboa = new UIKonpetitiboa();
		}
		return nKonpetitiboa;
	}
	public void hustu() {
		nKonpetitiboa=null;
	}

	/**
	 * Create the frame.
	 */
	public int counterGehitu() {
		selectionCounter++;
		return selectionCounter;	
	}
	
	public int counterKendu() {
		selectionCounter--;
		return selectionCounter;
	}
	
	private UIKonpetitiboa() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		setLocationRelativeTo(null);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		Listener listener = new Listener();
		
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.CENTER);

		JCheckBox checkBoxMofeta = new JCheckBox("Mofeta");
		checkBoxMofeta.addItemListener(listener);
		panel.add(checkBoxMofeta);
		buttons.add(checkBoxMofeta);
		
		JCheckBox checkBoxLoro = new JCheckBox("Loro");
		checkBoxLoro.addItemListener(listener);
		panel.add(checkBoxLoro);
		buttons.add(checkBoxLoro);
		
		JCheckBox checkBoxKanguru = new JCheckBox("Kanguru");
		checkBoxKanguru.addItemListener(listener);
		panel.add(checkBoxKanguru);
		buttons.add(checkBoxKanguru);
		
		JCheckBox checkBoxTximino = new JCheckBox("Tximino");
		checkBoxTximino.addItemListener(listener);
		panel.add(checkBoxTximino);
		buttons.add(checkBoxTximino);
		
		JCheckBox checkBoxKamaleoi = new JCheckBox("Kameleoi");
		checkBoxKamaleoi.addItemListener(listener);
		panel.add(checkBoxKamaleoi);
		buttons.add(checkBoxKamaleoi);
		
		JCheckBox checkBoxFoka = new JCheckBox("Foka");
		checkBoxFoka.addItemListener(listener);
		panel.add(checkBoxFoka);
		buttons.add(checkBoxFoka);
		
		JCheckBox checkBoxZebra = new JCheckBox("Zebra");
		checkBoxZebra.addItemListener(listener);
		panel.add(checkBoxZebra);
		buttons.add(checkBoxZebra);
		
		JCheckBox checkBoxJirafa = new JCheckBox("Jirafa");
		checkBoxJirafa.addItemListener(listener);
		panel.add(checkBoxJirafa);
		buttons.add(checkBoxJirafa);
		
		JCheckBox checkBoxSuge = new JCheckBox("Suge");
		checkBoxSuge.addItemListener(listener);
		panel.add(checkBoxSuge);
		buttons.add(checkBoxSuge);
		
		JCheckBox checkBoxKrokodilo = new JCheckBox("Krokodilo");
		checkBoxKrokodilo.addItemListener(listener);
		panel.add(checkBoxKrokodilo);
		buttons.add(checkBoxKrokodilo);
		
		JCheckBox checkBoxHipopotamo = new JCheckBox("Hipopotamo");
		checkBoxHipopotamo.addItemListener(listener);
		panel.add(checkBoxHipopotamo);
		buttons.add(checkBoxHipopotamo);
		
		JCheckBox checkBoxLehoi = new JCheckBox("Lehoi");
		checkBoxLehoi.addItemListener(listener);
		panel.add(checkBoxLehoi);
		buttons.add(checkBoxLehoi);
		
		btnNewButton = new JButton("Jokatu hautatu ditudan kartekin");
		//btnNewButton.setEnabled(false);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (selectionCounter==4) {
					Jokoa.getJokoa().hasieratuJokoa(true, hautatuak);
					UITablero.getTableroa().uiTableroaSortu();;
					UIEskua.getUIEskua().uiEskuaSortu();
					dispose();
					}
			}
		});
		contentPane.add(btnNewButton, BorderLayout.SOUTH);
		
		setVisible(true);
	}
	
	static class Listener implements ItemListener {

        private final int MAX_SELECTIONS = 4;
        	
        //private int selectionCounter = 0;

        @Override
        public void itemStateChanged(ItemEvent e) {
            JCheckBox source = (JCheckBox) e.getSource();
            int aux;
            if (source.isSelected()) {
            	hautatuak.add(bilatuKartaZenb(source.getText()));
                aux = UIKonpetitiboa.getKonpetitiboa().counterGehitu();
                // check for max selections:
                if (aux == MAX_SELECTIONS) {
                    for (JCheckBox box: buttons)
                        if (!box.isSelected()) {
                            box.setEnabled(false);
                        }
                    //btnNewButton.setEnabled(true);
                }
            }
            else {
            	aux =UIKonpetitiboa.getKonpetitiboa().counterKendu();
            	for (int i = 0; i < hautatuak.size(); i++) {
					if(hautatuak.get(i)==bilatuKartaZenb(source.getText())){
						hautatuak.remove(i);
					}
            	}
                // check for less than max selections:
                if (aux < MAX_SELECTIONS)
                    for (JCheckBox box: buttons)
                        box.setEnabled(true);
                //btnNewButton.setEnabled(false);
            }
        }

		private int bilatuKartaZenb(String pIzena) {
			// Izenaren bidez bilatzen du animaliaren kartaren zenbakia.
			int emaitza = 0;
			switch (pIzena) {
			case "Foka":
				emaitza =6;
				break;
			case "Hipopotamo":
				emaitza =11;
				break;
			case "Jirafa":
				emaitza =8;
				break;
			case "Kameleoi":
				emaitza =5;
				break;
			case "Kanguru":
				emaitza =3;
				break;
			case "Krokodilo":
				emaitza =10;
				break;
			case "Lehoi":
				emaitza =12;
				break;
			case "Loro":
				emaitza =2;
				break;
			case "Mofeta":
				emaitza =1;
				break;
			case "Suge":
				emaitza =9;
				break;
			case "Tximino":
				emaitza =4;
				break;
			case "Zebra":
				emaitza =7;
				break;
			}
			return emaitza;
		}
    }
}
