package BlackJack;

//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  - 

import static java.lang.System.*;
import java.util.Scanner;

public class BlackJack
{
	//add in Player instance variable
        private Dealer dealer;
        private Player player;
	//add in Dealer instance variable

	public BlackJack()
	{
            dealer = new Dealer();
            player = new Player();

	}

	public void playGame()
	{
            Scanner keyboard = new Scanner(System.in);
            char choic = 0;

            player.hit();
            dealer.hit();



	}
	
	public static void main(String[] args)
	{
		BlackJack game = new BlackJack();
		game.playGame();
	}
}