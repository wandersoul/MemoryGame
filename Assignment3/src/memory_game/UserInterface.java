/**
 * 
 */
package memory_game;

import javax.swing.JFrame;
import javax.swing.ImageIcon;
import javax.swing.JToggleButton;
import java.awt.FlowLayout;
import javax.swing.UIManager;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
/**
 * @author Marc and Dan
 *
 */
public class UserInterface {
	
	private static final void createAndShowGUI(){
		//Create a panel
		final JFrame frame = new JFrame();
	    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    frame.setLayout(new FlowLayout()); // For presentation purposes only.
	    
	    
	   
	    
	    
	    
	    
		//Within the panel create:
		//Text Label for user ("Pick a card any card" "Pick Another Card")
		//Text Label that displays score
		//Text Label that displays a countdown
		
		//A Button: Play Again, disables initially, enabled on play
		
		//A Button: Quit, exits any time
		
		//a Grid of 4x4 buttons (16 total), these buttons have images/card_back.gif as the backside, and assigned card value on the front
		//Assign the button names relative to which card has been assigned
	    final JToggleButton button = new JToggleButton(UIManager.getIcon("OptionPane.informationIcon"));
	    button.setSelectedIcon(UIManager.getIcon("OptionPane.errorIcon"));
	    frame.add(button);
	    frame.pack();
	    frame.setLocationRelativeTo(null);
	    frame.setVisible(true);
	}
	
	
	
	
	/** Returns an ImageIcon, or null if the path was invalid. */
    protected static ImageIcon createImageIcon(String path) {
        java.net.URL imgURL = UserInterface.class.getResource(path);
        if (imgURL != null) {
            return new ImageIcon(imgURL);
        } else {
            System.err.println("Couldn't find file: " + path);
            return null;
        }
    }
    
	
}
