package BlackJack;

//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  - 

import static java.lang.System.*;
import java.util.Scanner;



public class Player extends AbstractPlayer{
    public Player(){
        super();
    }
    
    
    public boolean hit(){
        addCardToHand(Deck.nextCard());
        return(getHandValue() <= 21);
    }
}