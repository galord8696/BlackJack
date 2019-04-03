package blackjack;

//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  - 

public class BlackJackCard extends Card
{
  	//constructors
        public BlackJackCard(){
            super(1, "SPADES");
        }
        public BlackJackCard(f,s){
            super(f,s);
        }
  	public int getValue()
  	{
            int i = getFace();
            if(i == 1){return 11;}
            if(i>=10){return 10;}
            return(i);
  	}
        public String toString(){
            return(super.toString() + + " | value = "+ getValue())
        }
  	
 }