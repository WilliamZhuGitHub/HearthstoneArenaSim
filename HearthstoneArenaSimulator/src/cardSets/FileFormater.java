package cardSets;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
/*
 * Formatting the table from: https://hearthstone.gamepedia.com/Basic_card_list
 * Outputs card list in console
 */

public class FileFormater {

	public static void main(String[] args) throws IOException {
		File file = new File("Basic.txt");
		BufferedReader reader = null;
		Scanner scan = new Scanner(System.in);
		String line = "";
		String setName = "tBP";
		int cardCount = 0;

		try {
			reader = new BufferedReader(new FileReader(file));

		} catch (FileNotFoundException fnfex) {
			System.out.println("ERROR");
		}
		// line is the current line
		while ((line = reader.readLine()) != null) {

//replace all the tabs with " , "
//replace all numbers with quotations around it with just the number
			String origLine = line;
			line = line.replaceAll("\t", "\",\" ");
			line = line.replaceAll("\" 0 \"", " 0 ");
			line = line.replaceAll("\" 1 \"", " 1 ");
			line = line.replaceAll("\" 2 \"", " 2 ");
			line = line.replaceAll("\" 3 \"", " 3 ");
			line = line.replaceAll("\" 4 \"", " 4 ");
			line = line.replaceAll("\" 5 \"", " 5 ");
			line = line.replaceAll("\" 6 \"", " 6 ");
			line = line.replaceAll("\" 7 \"", " 7 ");
			line = line.replaceAll("\" 8 \"", " 8 ");
			line = line.replaceAll("\" 9 \"", " 9 ");
			line = line.replaceAll("\" 10 \"", " 10 ");
			line = line.replaceAll("\" 11 \"", " 11 ");
			line = line.replaceAll("\" 12 \"", " 12 ");

			line = line.replaceAll(" ,\"", "  ");

			line = line.replaceAll(" 0   \"", "0");
			line = line.replaceAll(" 1   \"", "1");
			line = line.replaceAll(" 2   \"", "2");
			line = line.replaceAll(" 3   \"", "3");
			line = line.replaceAll(" 4   \"", "4");
			line = line.replaceAll(" 5   \"", "5");
			line = line.replaceAll(" 6   \"", "6");
			line = line.replaceAll(" 7   \"", "7");
			line = line.replaceAll(" 8   \"", "8");
			line = line.replaceAll(" 9   \"", "9");
			line = line.replaceAll(" 10   \"", "10");
			line = line.replaceAll(" 11   \"", "11");
			line = line.replaceAll(" 12   \"", "12");
			// line = line.replaceAll("Free", "Common");

//prints out the edited statement

			if (line.contains("Spell") && ((line.contains("Common")
					|| (line.contains("Rare") || (line.contains("Epic") || (line.contains("Legendary"))))))) {
				System.out.println(setName + ".add(new Spell(\"" + line + " \"));");
				cardCount = cardCount + 1;
			} 
			
			
			if (line.contains("Minion") || line.contains("Weapon") && ((line.contains("Common")
					|| (line.contains("Rare") || (line.contains("Epic") || (line.contains("Legendary"))))))) {
				System.out.println(setName + ".add(new Minion(\"" + line + " ));");
				cardCount = cardCount + 1;
			}

//			else if(line.contains("Minion")){
//				System.out.println("gvg.add(new Minion(\"" + line + " ));");
//
//			}
//			else if(line.contains("Weapon")){
//				System.out.println("gvg.add(new Weapon(\"" + line + " ));");
//
//			}

//calls readLine again because want to skip the next line with the card description

			// System.out.println("DONE");
			scan.close();
		}
		System.out.print("Card count: " + cardCount);

	}
}
