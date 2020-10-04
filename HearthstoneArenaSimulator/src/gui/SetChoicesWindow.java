package gui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JPanel;
import javax.swing.JSplitPane;
import java.awt.Canvas;
import java.awt.GridLayout;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import javax.swing.JToggleButton;
import javax.swing.event.ChangeListener;

import cardFunctions.Card;
import cardFunctions.CardFunctions;
import cardFunctions.CardSets;
import cardFunctions.DeckFunctions;

import javax.swing.event.ChangeEvent;
import javax.swing.JCheckBox;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class SetChoicesWindow {
	static CardFunctions cardFunc = new CardFunctions();
	static CardSets cardSets = new CardSets();
	static DeckFunctions deckFunc = new DeckFunctions();
	private JFrame frame;
	static ArrayList<Card> mergeSet = new ArrayList<Card>();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SetChoicesWindow window = new SetChoicesWindow();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public void heroChoiceWindow() {
		HeroChoiceWindow newGui = new HeroChoiceWindow(mergeSet);
		newGui.frame.setVisible(true);
		frame.setVisible(false);
	}

	public SetChoicesWindow() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {

		frame = new JFrame();
		frame.setBounds(100, 100, 800, 500);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		JCheckBox chckbxBasic = new JCheckBox("Basic");
		chckbxBasic.setSelected(true);
		chckbxBasic.setBounds(31, 104, 97, 23);
		frame.getContentPane().add(chckbxBasic);

		JCheckBox chckbxClassic = new JCheckBox("Classic");
		chckbxClassic.setSelected(true);
		chckbxClassic.setBounds(31, 130, 97, 23);
		frame.getContentPane().add(chckbxClassic);

		JCheckBox chckbxTheWitchwood = new JCheckBox("The Witchwood");
		chckbxTheWitchwood.setBounds(31, 156, 148, 23);
		frame.getContentPane().add(chckbxTheWitchwood);

		JCheckBox chckbxRastakhansRumble = new JCheckBox("Rastakhan's Rumble");
		chckbxRastakhansRumble.setBounds(31, 182, 148, 23);
		frame.getContentPane().add(chckbxRastakhansRumble);

		JCheckBox chckbxGalakrondsAwakening = new JCheckBox("Galakrond's Awakening");
		chckbxGalakrondsAwakening.setBounds(198, 182, 157, 23);
		frame.getContentPane().add(chckbxGalakrondsAwakening);

		JCheckBox chckbxSaviorsOfUldum = new JCheckBox("Saviors of Uldum");
		chckbxSaviorsOfUldum.setBounds(199, 130, 134, 23);
		frame.getContentPane().add(chckbxSaviorsOfUldum);

		JCheckBox chckbxRiseOfShadows = new JCheckBox("Rise of Shadows");
		chckbxRiseOfShadows.setBounds(199, 104, 124, 23);
		frame.getContentPane().add(chckbxRiseOfShadows);

		JCheckBox chckbxDescentOfDragons = new JCheckBox("Descent of Dragons");
		chckbxDescentOfDragons.setBounds(199, 156, 156, 23);
		frame.getContentPane().add(chckbxDescentOfDragons);

		JCheckBox chckbxCurseOfNaxxramas = new JCheckBox("\tCurse of Naxxramas");
		chckbxCurseOfNaxxramas.setBounds(31, 235, 148, 23);
		frame.getContentPane().add(chckbxCurseOfNaxxramas);

		JCheckBox chckbxGoblinsVsGnomes = new JCheckBox("Goblins vs Gnomes");
		chckbxGoblinsVsGnomes.setBounds(31, 261, 134, 23);
		frame.getContentPane().add(chckbxGoblinsVsGnomes);

		JCheckBox chckbxBlackrockMountain = new JCheckBox("Blackrock Mountain");
		chckbxBlackrockMountain.setBounds(31, 287, 148, 23);
		frame.getContentPane().add(chckbxBlackrockMountain);

		JCheckBox chckbxTheLeagueOf = new JCheckBox("The League of Explorers");
		chckbxTheLeagueOf.setBounds(198, 261, 177, 23);
		frame.getContentPane().add(chckbxTheLeagueOf);

		JCheckBox chckbxTheGrandTournament = new JCheckBox("The Grand Tournament");
		chckbxTheGrandTournament.setBounds(199, 235, 156, 23);
		frame.getContentPane().add(chckbxTheGrandTournament);

		JCheckBox chckbxWhispersOfThe = new JCheckBox("Whispers of the Old Gods");
		chckbxWhispersOfThe.setBounds(199, 287, 156, 23);
		frame.getContentPane().add(chckbxWhispersOfThe);

		JCheckBox chckbxOneNightIn = new JCheckBox("One Night in Karazhan");
		chckbxOneNightIn.setBounds(31, 313, 134, 23);
		frame.getContentPane().add(chckbxOneNightIn);

		JCheckBox chckbxMeanStreetsOf = new JCheckBox("Mean Streets of Gadgetzan");
		chckbxMeanStreetsOf.setBounds(31, 339, 163, 23);
		frame.getContentPane().add(chckbxMeanStreetsOf);

		JCheckBox chckbxJourneyToUngoro = new JCheckBox("Journey to Un'Goro");
		chckbxJourneyToUngoro.setBounds(199, 313, 134, 23);
		frame.getContentPane().add(chckbxJourneyToUngoro);

		JCheckBox chckbxKnightsOfThe = new JCheckBox("Knights of the Frozen Throne");
		chckbxKnightsOfThe.setBounds(198, 339, 197, 23);
		frame.getContentPane().add(chckbxKnightsOfThe);

		JCheckBox chckbxKobolds = new JCheckBox("Kobolds & Catacombs");
		chckbxKobolds.setBounds(31, 365, 157, 23);
		frame.getContentPane().add(chckbxKobolds);
		
		JLabel lblStandard = new JLabel("Standard");
		lblStandard.setHorizontalAlignment(SwingConstants.CENTER);
		lblStandard.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblStandard.setBounds(31, 68, 292, 23);
		frame.getContentPane().add(lblStandard);
		
		JLabel lblBuildYourDraft = new JLabel("Build your Draft Set");
		lblBuildYourDraft.setHorizontalAlignment(SwingConstants.CENTER);
		lblBuildYourDraft.setFont(new Font("Tahoma", Font.PLAIN, 24));
		lblBuildYourDraft.setBounds(212, 0, 374, 52);
		frame.getContentPane().add(lblBuildYourDraft);

		JLabel lblWild = new JLabel("Wild");
		lblWild.setHorizontalAlignment(SwingConstants.CENTER);
		lblWild.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblWild.setBounds(31, 205, 292, 23);
		frame.getContentPane().add(lblWild);
		
		JLabel lblNewLabel = new JLabel(" ");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setIcon(new ImageIcon(HeroChoiceWindow.class.getResource("/classImages/Title.jpg")));

		lblNewLabel.setBounds(468, 45, 271, 381);
		frame.getContentPane().add(lblNewLabel);

		JButton btnNewButton = new JButton("Done");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				heroChoiceWindow();
				if (chckbxBasic.isSelected()) {
					mergeSet.addAll(cardSets.basicList());
				}
				if (chckbxClassic.isSelected()) {
					mergeSet.addAll(cardSets.classicList());
				}
				if (chckbxTheWitchwood.isSelected()) {
				//	mergeSet.addAll(cardSets.TWList());
				}
				if (chckbxRastakhansRumble.isSelected()) {
				//	mergeSet.addAll(cardSets.RRList());
				}
				if (chckbxGalakrondsAwakening.isSelected()) {
				//	mergeSet.addAll(cardSets.GAList());
				}
				if (chckbxSaviorsOfUldum.isSelected()) {
					mergeSet.addAll(cardSets.SoUList());
				}
				if (chckbxRiseOfShadows.isSelected()) {
					mergeSet.addAll(cardSets.RoSList());
				}
				if (chckbxDescentOfDragons.isSelected()) {
				//	mergeSet.addAll(cardSets.DoDList());
				}
				if (chckbxCurseOfNaxxramas.isSelected()) {
				//	mergeSet.addAll(cardSets.CoNList());
				}
				if (chckbxGoblinsVsGnomes.isSelected()) {
					mergeSet.addAll(cardSets.GvGList());
				}
				if (chckbxBlackrockMountain.isSelected()) {
				//	mergeSet.addAll(cardSets.BMList());
				}
				if (chckbxTheLeagueOf.isSelected()) {
					mergeSet.addAll(cardSets.LOEList());
				}
				if (chckbxTheGrandTournament.isSelected()) {
				//	mergeSet.addAll(cardSets.TGTList());
				}
				if (chckbxOneNightIn.isSelected()) {
					mergeSet.addAll(cardSets.ONiKList());
				}
				if (chckbxMeanStreetsOf.isSelected()) {
					mergeSet.addAll(cardSets.MSoGList());
				}
				if (chckbxJourneyToUngoro.isSelected()) {
					mergeSet.addAll(cardSets.JtUList());
				}
				if (chckbxKnightsOfThe.isSelected()) {
					mergeSet.addAll(cardSets.KotFTList());
				}
				if (chckbxKobolds.isSelected()) {
					mergeSet.addAll(cardSets.KaCList());
				}
				
				 
			}
		});
		btnNewButton.setBounds(51, 415, 282, 35);
		frame.getContentPane().add(btnNewButton);
	}
}
