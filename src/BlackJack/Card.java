package BlackJack;

//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  - 


public abstract class Card
{
	public static final String FACES[] = {"ZERO","ACE","TWO","THREE","FOUR",
			"FIVE","SIX","SEVEN","EIGHT","NINE","TEN","JACK","QUEEN","KING"};

	private String suit;
	private int face;

  	//constructors
        public Card(){
            suit = "SPADES";
            face = 1;
        }
        public Card(int f, String s){
            suit = s;
            face = f;
        }


	// modifiers
        
        public void setFace(int x){
            face = x;
        }
        public void setSuit(String x){
            suit = x;
        }
 

  	//accessors
        
        public int getFace(){
            return(face);
        }
        public String getSuit(){
            return(suit);
        }


  	public abstract int getValue();

	public boolean equals(BlackJackCard obj)
	{
            if (getFace() == obj.getFace() && getSuit().equals(obj.getSuit())){
                return(true);
            }
            return(false);
	}

  	//toString
        public String toString(){
            return(FACES[face] + " of " + getSuit());
        }
        
  	
 }