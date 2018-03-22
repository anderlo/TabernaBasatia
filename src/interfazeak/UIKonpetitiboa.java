package interfazeak;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.util.ArrayList;

import javax.swing.*;
import javax.swing.border.EmptyBorder;

public class UIKonpetitiboa extends JFrame {
	
	private static UIKonpetitiboa nKonpetitiboa=null;
	private JPanel contentPane;
	static ArrayList<JCheckBox> buttons = new ArrayList<>();
	private static JButton btnNewButton;
	private static int selectionCounter = 0;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					UIKonpetitiboa frame = new UIKonpetitiboa();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	public static UIKonpetitiboa getKonpetitiboa() {
		if (nKonpetitiboa==null) {
			nKonpetitiboa = new UIKonpetitiboa();
		}
		return nKonpetitiboa;
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
					UITablero.main(null);
					dispose();
					}
			}
		});
		contentPane.add(btnNewButton, BorderLayout.SOUTH);
		
		
	}
	
	static class Listener implements ItemListener {

        private final int MAX_SELECTIONS = 4;
        	
        //private int selectionCounter = 0;

        @Override
        public void itemStateChanged(ItemEvent e) {
            JCheckBox source = (JCheckBox) e.getSource();
            int aux;
            if (source.isSelected()) {
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
                // check for less than max selections:
                if (aux < MAX_SELECTIONS)
                    for (JCheckBox box: buttons)
                        box.setEnabled(true);
                //btnNewButton.setEnabled(false);
            }
        }
    }
}
