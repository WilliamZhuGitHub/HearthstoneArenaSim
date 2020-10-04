package gui;
 
 
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

import cardFunctions.CardFunctions;
import cardFunctions.CardSets;
import cardFunctions.DeckFunctions;

import java.awt.Font;
import javax.swing.JPanel;
import javax.swing.JSplitPane;
import java.awt.Canvas;
import java.awt.GridLayout;
import javax.swing.JList;
import javax.swing.JProgressBar;

public class CardChoiceWindow {
	static CardFunctions cardFunc = new CardFunctions();
	static CardSets cardSets = new CardSets();
	static DeckFunctions deckFunc = new DeckFunctions();
	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CardChoiceWindow window = new CardChoiceWindow();
					window.getFrame().setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public CardChoiceWindow() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		setFrame(new JFrame());
		getFrame().setBounds(100, 100, 800, 500);
		getFrame().setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getFrame().getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Pick A Card");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 24));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(10, 11, 764, 41);
		getFrame().getContentPane().add(lblNewLabel);
		
		JPanel panel = new JPanel();
		panel.setBounds(26, 93, 600, 250);
		getFrame().getContentPane().add(panel);
		panel.setLayout(new GridLayout(1, 0, 0, 0));
		
		JButton lblNewLabel_1 = new JButton("New label");
		panel.add(lblNewLabel_1);
		
		JButton lblNewLabel_2 = new JButton("New label");
		panel.add(lblNewLabel_2);
		
		JButton lblNewLabel_3 = new JButton("New label");
		panel.add(lblNewLabel_3);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(636, 86, 127, 364);
		getFrame().getContentPane().add(panel_1);
		
		JList list = new JList();
		panel_1.add(list);
		
		JLabel lblYourDeck = new JLabel("Your Deck");
		lblYourDeck.setBounds(671, 63, 65, 14);
		getFrame().getContentPane().add(lblYourDeck);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBounds(120, 379, 370, 82);
		getFrame().getContentPane().add(panel_2);
		panel_2.setLayout(new GridLayout(1, 0, 0, 0));
		
		JProgressBar progressBar = new JProgressBar();
		progressBar.setValue(12);
		progressBar.setToolTipText("");
		progressBar.setOrientation(SwingConstants.VERTICAL);
		panel_2.add(progressBar);
		
		JProgressBar progressBar_1 = new JProgressBar();
		progressBar_1.setValue(12);
		progressBar_1.setOrientation(SwingConstants.VERTICAL);
		panel_2.add(progressBar_1);
		
		JProgressBar progressBar_2 = new JProgressBar();
		progressBar_2.setValue(12);
		progressBar_2.setOrientation(SwingConstants.VERTICAL);
		panel_2.add(progressBar_2);
		
		JProgressBar progressBar_3 = new JProgressBar();
		progressBar_3.setValue(12);
		progressBar_3.setOrientation(SwingConstants.VERTICAL);
		panel_2.add(progressBar_3);
		
		JProgressBar progressBar_4 = new JProgressBar();
		progressBar_4.setValue(12);
		panel_2.add(progressBar_4);
		progressBar_4.setOrientation(SwingConstants.VERTICAL);
		
		JProgressBar progressBar_5 = new JProgressBar();
		progressBar_5.setValue(12);
		progressBar_5.setOrientation(SwingConstants.VERTICAL);
		panel_2.add(progressBar_5);
		
		JProgressBar progressBar_6 = new JProgressBar();
		progressBar_6.setValue(12);
		progressBar_6.setOrientation(SwingConstants.VERTICAL);
		panel_2.add(progressBar_6);
		
		JProgressBar progressBar_7 = new JProgressBar();
		progressBar_7.setValue(12);
		progressBar_7.setOrientation(SwingConstants.VERTICAL);
		panel_2.add(progressBar_7);
		
		JLabel lblNewLabel_4 = new JLabel("Hero");
		lblNewLabel_4.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_4.setBounds(10, 366, 97, 95);
		getFrame().getContentPane().add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("       0             1              2             3            4              5              6            7+\r\n\t");
		lblNewLabel_5.setBounds(120, 364, 370, 14);
		getFrame().getContentPane().add(lblNewLabel_5);
		
		JButton btnNewButton = new JButton("New Draft");
		btnNewButton.setBounds(516, 376, 110, 23);
		getFrame().getContentPane().add(btnNewButton);
		
		JButton btnHeroChoice = new JButton("Hero Choice");
		btnHeroChoice.setBounds(516, 415, 110, 23);
		getFrame().getContentPane().add(btnHeroChoice);
	}

	public JFrame getFrame() {
		return frame;
	}

	public void setFrame(JFrame frame) {
		this.frame = frame;
	}
}
