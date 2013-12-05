/**
 * 
 */
package memory_game;

import javax.swing.JOptionPane;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JFrame;
import javax.swing.ImageIcon;
 
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
	
	public MemoryGame(GameGUI){
		//Call a UserInterface()
		UserInterface gui = GameGUI;
		buttonListener = new ButtonActionListener;
		//Each button to the actions listener
		
	}
	
	public void Play(){
		int numPairsFound;
        int numOfTries;
        JButton buttonPressed; // Will hold which button was pressed reference from the listener
        CardButton button1, button2; // Will hold which two button were clicked for comparison
		//Initialize 52 card array
		public String[] fullDeck = {"1c", "1d", "1h", "1s", "2c", "2d", "2h", "2s"}; 
		//Randomize the array of 52 (shuffle)
		//OR
		//Select 8 random cards out of 52
		
		//Load those 8 cards into an array
		public String [] selectedCards = {"","","","","","","",""};
		//Copy the array to get matches for the cards in the array of 8
		public String [] selectedMatches = selectedCards;
        //

	
	}
	
}
