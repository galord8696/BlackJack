package blackjack;

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
        public Card();
        public Card(f, s);


	// modifiers
        
        public void setFace(x);
        public void setSuit(x);
 

  	//accessors
        
        public int getFace();
        public String getSuit();


  	public abstract int getValue();

	public boolean equals(Object obj)
	{
            if (getFace() == obj.getFace() && getSuit.equals(obj.getSuit())){
                return(true);
            }
            return false;
	}

  	//toString
        public String toString(){
            return(FACES[face] + " of " + getSuit());
        }
        
  	
 }