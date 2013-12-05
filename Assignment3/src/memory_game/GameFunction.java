/**
 * 
 */
package memory_game;

import javax.swing.JButton;
import java.util.Random;
import javax.swing.plaf.basic.BasicOptionPaneUI.ButtonActionListener;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

/**
 * @author Marc and Dan
 *
 */
public class GameFunction {
	private UserInterface GameGUI;
	private ButtonActionListener buttonListener;
	
	public void MemoryGame() {
		//Call a UserInterface()
		UserInterface gui = GameGUI;
		//Each button to the actions listener
		
	}
	
	public void Play(){
		int numPairsFound;
        int numOfTries;
        JButton buttonPressed; // Will hold which button was pressed reference from the listener
        CardButton button1;
        CardButton button2; // Will hold which two button were clicked for comparison
		//Initialize 52 card array
		String[] fullDeck = {"1c", "1d", "1h", "1s", "2c", "2d", "2h", "2s", "3c", "3d", "3h", "3s", "4c", "4d", "4h", "4s", "5c", "5d", "5h", "5s", "6c", "6d", "6h", "6s", "7c", "7d", "7h", "7s", "8c", "8d", "8h", "8s", "9c", "9d", "9h", "9s", "10c", "10d", "10h", "10s", "11c", "11d", "11h", "11s", "12c", "12d", "12h", "12s", "13c", "13d", "13h", "13s"}; 
		//Randomize the array of 52 (shuffle)
		shuffleArray(fullDeck);
		//Select 8 random cards out of 52
		String[] selectedCards = {"", "", "", "", "", "", "", ""};
		//Load first 8 cards into array
		for (int i=0; i < 8; i++){
			selectedCards[i] = fullDeck[i];
		}		
		//Copy the array to get matches for the cards in the array of 8
		String [] selectedMatches = selectedCards;

	}
	public String[] shuffleArray(String[] array){
		//Initialize the shuffled array to be returned
		String[] mixedUpArray = array;
		//Determines the length of the array passed in
		int n = array.length;
		Random random = new Random();
		random.nextInt();
		//changes positions of first and randomly selected element, then increments to do second positon and a random, etc.
		for (int i = 0; i < n; i++) {
			//a random position is selected WITHIN the array
			int change = i + random.nextInt(n - i);
			//the elements are swaped
			swap(mixedUpArray, i, change);
		}
		return mixedUpArray;
	}
	//swap() changes the values in two selected positions of an array
	 private static void swap(String[] a, int i, int change) {
		 	//save the first element being swaped
		    String helper = a[i];
		    //save the second element value selected to the first element positions
		    a[i] = a[change];
		    //use the saved element to overwrite the second element value
		    a[change] = helper;
		  }
}
