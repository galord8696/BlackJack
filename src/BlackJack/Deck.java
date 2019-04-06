package BlackJack;

//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  - 

import java.util.ArrayList;
import java.util.Collections;

public class Deck
{
	public static final int NUMFACES = 13;
	public static final int NUMSUITS = 4;
	public static final int NUMCARDS = 52;

	public static final String SUITS[] = {"CLUBS","SPADES","DIAMONDS","HEARTS"};

	private static int topCardIndex;
	private static ArrayList<Card> stackOfCards;

	public Deck ()
	{
		//initialize data - stackOfCards - topCardIndex
            stackOfCards = new ArrayList<Card>();
            for (int i = 0; i < 13; i++){
                for (String suit : SUITS){
                    stackOfCards.add(new BlackJackCard(i, suit));
                    topCardIndex = 51;
                }
            }
		
	}

	//modifiers
   public void shuffle ()
	{
            Collections.shuffle(stackOfCards);
	}

   //accessors
	public int  size ()
	{
		return(stackOfCards.size());
	}

	public int numCardsLeft()
	{
		return(topCardIndex);
	}

	public static Card nextCard()
	{   
                int t = topCardIndex;
                topCardIndex--;
		return(stackOfCards.get(t));
	}

	public String toString()
	{
		return stackOfCards + "   topCardIndex = " + topCardIndex;
	} 
}