package gui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

import cardFunctions.Card;
import cardFunctions.CardFunctions;
import cardFunctions.CardSets;
import cardFunctions.DeckFunctions;

import java.awt.Font;
import javax.swing.JPanel;
import javax.swing.JSplitPane;
import java.awt.Canvas;
import java.awt.GridLayout;
import java.util.ArrayList;

import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class HeroChoiceWindow {

	static CardFunctions cardFunc = new CardFunctions();
	static CardSets cardSets = new CardSets();
	static ArrayList<Card> cards = new ArrayList<Card>();

	static DeckFunctions deckFunc = new DeckFunctions();
	JFrame frame;
	static JButton lblNewLabel_1 = new JButton("New label");
	static JButton lblNewLabel_2 = new JButton("New label");
	static JButton lblNewLabel_3 = new JButton("New label");
	static String heroChoice = "";

 
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					HeroChoiceWindow window = new HeroChoiceWindow( cards);
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

 
	public HeroChoiceWindow(ArrayList<Card> mergeSet) {
		ArrayList<Card> cardSets = new ArrayList<Card>();
		initialize(cardSets);
		ArrayList<String> classes = new ArrayList<String>();
		classes = setHeros();
	}
	
	/*
	 * Set the button icon to images of heros based on the classes
	 */

	public ArrayList<String> setHeros() {
		ArrayList<String> classes = new ArrayList<String>();
		classes = cardFunc.getRandomClasses();

		if (classes.get(0) == "Druid") {
			lblNewLabel_1.setIcon(new ImageIcon(HeroChoiceWindow.class.getResource("/classImages/Malfurion.png")));
		}
		if (classes.get(0) == "Hunter") {
			lblNewLabel_1.setIcon(new ImageIcon(HeroChoiceWindow.class.getResource("/classImages/Rexxar.png")));
		}
		if (classes.get(0) == "Mage") {
			lblNewLabel_1.setIcon(new ImageIcon(HeroChoiceWindow.class.getResource("/classImages/Jaina.png")));
		}
		if (classes.get(0) == "Paladin") {
			lblNewLabel_1.setIcon(new ImageIcon(HeroChoiceWindow.class.getResource("/classImages/Uther.png")));
		}
		if (classes.get(0) == "Priest") {
			lblNewLabel_1.setIcon(new ImageIcon(HeroChoiceWindow.class.getResource("/classImages/Anduin.png")));
		}
		if (classes.get(0) == "Rogue") {
			lblNewLabel_1.setIcon(new ImageIcon(HeroChoiceWindow.class.getResource("/classImages/Valeera.png")));
		}
		if (classes.get(0) == "Shaman") {
			lblNewLabel_1.setIcon(new ImageIcon(HeroChoiceWindow.class.getResource("/classImages/Thrall.png")));
		}

		if (classes.get(0) == "Warlock") {
			lblNewLabel_1.setIcon(new ImageIcon(HeroChoiceWindow.class.getResource("/classImages/Gul'dan.png")));
		}
		if (classes.get(0) == "Warrior") {
			lblNewLabel_1.setIcon(new ImageIcon(HeroChoiceWindow.class.getResource("/classImages/Garrosh.png")));
		}

		if (classes.get(1) == "Druid") {
			lblNewLabel_2.setIcon(new ImageIcon(HeroChoiceWindow.class.getResource("/classImages/Malfurion.png")));
		}
		if (classes.get(1) == "Hunter") {
			lblNewLabel_2.setIcon(new ImageIcon(HeroChoiceWindow.class.getResource("/classImages/Rexxar.png")));
		}
		if (classes.get(1) == "Mage") {
			lblNewLabel_2.setIcon(new ImageIcon(HeroChoiceWindow.class.getResource("/classImages/Jaina.png")));
		}
		if (classes.get(1) == "Paladin") {
			lblNewLabel_2.setIcon(new ImageIcon(HeroChoiceWindow.class.getResource("/classImages/Uther.png")));
		}
		if (classes.get(1) == "Priest") {
			lblNewLabel_2.setIcon(new ImageIcon(HeroChoiceWindow.class.getResource("/classImages/Anduin.png")));
		}
		if (classes.get(1) == "Rogue") {
			lblNewLabel_2.setIcon(new ImageIcon(HeroChoiceWindow.class.getResource("/classImages/Valeera.png")));
		}
		if (classes.get(1) == "Shaman") {
			lblNewLabel_2.setIcon(new ImageIcon(HeroChoiceWindow.class.getResource("/classImages/Thrall.png")));
		}

		if (classes.get(1) == "Warlock") {
			lblNewLabel_2.setIcon(new ImageIcon(HeroChoiceWindow.class.getResource("/classImages/Gul'dan.png")));
		}
		if (classes.get(1) == "Warrior") {
			lblNewLabel_2.setIcon(new ImageIcon(HeroChoiceWindow.class.getResource("/classImages/Garrosh.png")));
		}

		if (classes.get(2) == "Druid") {
			lblNewLabel_3.setIcon(new ImageIcon(HeroChoiceWindow.class.getResource("/classImages/Malfurion.png")));
		}
		if (classes.get(2) == "Hunter") {
			lblNewLabel_3.setIcon(new ImageIcon(HeroChoiceWindow.class.getResource("/classImages/Rexxar.png")));
		}
		if (classes.get(2) == "Mage") {
			lblNewLabel_3.setIcon(new ImageIcon(HeroChoiceWindow.class.getResource("/classImages/Jaina.png")));
		}
		if (classes.get(2) == "Paladin") {
			lblNewLabel_3.setIcon(new ImageIcon(HeroChoiceWindow.class.getResource("/classImages/Uther.png")));
		}
		if (classes.get(2) == "Priest") {
			lblNewLabel_3.setIcon(new ImageIcon(HeroChoiceWindow.class.getResource("/classImages/Anduin.png")));
		}
		if (classes.get(2) == "Rogue") {
			lblNewLabel_3.setIcon(new ImageIcon(HeroChoiceWindow.class.getResource("/classImages/Valeera.png")));
		}
		if (classes.get(2) == "Shaman") {
			lblNewLabel_3.setIcon(new ImageIcon(HeroChoiceWindow.class.getResource("/classImages/Thrall.png")));
		}

		if (classes.get(2) == "Warlock") {
			lblNewLabel_3.setIcon(new ImageIcon(HeroChoiceWindow.class.getResource("/classImages/Gul'dan.png")));
		}
		if (classes.get(2) == "Warrior") {
			lblNewLabel_3.setIcon(new ImageIcon(HeroChoiceWindow.class.getResource("/classImages/Garrosh.png")));
		}
		return classes;

	}

	/**
	 * Initialize the contents of the frame.
	 */
	
	private void initialize(ArrayList<Card> cards) {

		frame = new JFrame();
		frame.setBounds(100, 100, 800, 500);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		JLabel lblNewLabel = new JLabel("Choose your Hero");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 24));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(10, 11, 764, 41);
		frame.getContentPane().add(lblNewLabel);

		JPanel panel = new JPanel();
		panel.setBounds(37, 70, 717, 310);
		frame.getContentPane().add(panel);
		panel.setLayout(new GridLayout(1, 0, 0, 0));
		
		ArrayList<String> classes = new ArrayList<String>();
		classes = setHeros();
		
		lblNewLabel_1 = new JButton("New label");
		lblNewLabel_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CardChoiceWindow newGui = new CardChoiceWindow();
				newGui.getFrame().setVisible(true);
				frame.setVisible(false);
 			}
		});
		lblNewLabel_1.setVerticalAlignment(SwingConstants.TOP);
 		panel.add(lblNewLabel_1);

		lblNewLabel_2 = new JButton("New label");
		lblNewLabel_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CardChoiceWindow newGui = new CardChoiceWindow();
				newGui.getFrame().setVisible(true);
				frame.setVisible(false);
			}
		});
		lblNewLabel_2.setVerticalAlignment(SwingConstants.TOP);
 		panel.add(lblNewLabel_2);

		lblNewLabel_3 = new JButton("New label");
		lblNewLabel_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CardChoiceWindow newGui = new CardChoiceWindow();
				newGui.getFrame().setVisible(true);
				frame.setVisible(false);
			}
		});
 		lblNewLabel_3.setVerticalAlignment(SwingConstants.TOP);
		panel.add(lblNewLabel_3);
 

		
		JButton btnNewButton = new JButton("Get New Heros");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setHeros();
			}
		});
		btnNewButton.setBounds(153, 405, 471, 23);
		frame.getContentPane().add(btnNewButton);
	}
}
