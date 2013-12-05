package memory_game;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JToggleButton;


public class CardButton extends JToggleButton {
	/**
	 * Serialize this type of CardButton extention of JToggleButton
	 */
	private static final long serialVersionUID = 1L;
	private String cardName;	// card name to determine which image to load, which file name
    private Icon imgIcon;       // "Front" picture for the card
    private Icon bgIcon;        // "Back" image of the card
    private boolean isFaceUp; 	// Whether if picture is shown or not
    
    public CardButton(String CardName)
    {
    	//Card Button Constructor initial fields
        cardName  = CardName;
        isFaceUp = false;        
        ImageIcon card_back = createImageIcon("images/card_back.gif");
        ImageIcon card_front = createImageIcon("images/card_"+ cardName +".gif");
        //set the card back icon to every card
        bgIcon = card_back;
        //set the particular front image for the card
        imgIcon = card_front;
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
    
    public String getName()
    {
        return cardName;
    }
    public boolean equals(CardButton card)
    {
        return cardName == card.cardName ? true : false;
    }
    
    public void setFaceUp()
    {
        //setIcon(imgIcon);
        isFaceUp = true;
    }
    
    public void setFaceDown()
    {
        //setIcon(bgIcon);
        isFaceUp = false;
    }
    
    public boolean isFaceUp()
    {
        return isFaceUp;
    }
    
    public int getWidth()
    {
        return imgIcon.getIconWidth();
    }
    
    public int getHeight()
    {
        return imgIcon.getIconHeight();
    }
    
    public String toString()
    {
        return "Card Name: " + cardName + "; " + super.toString();
    }
}
