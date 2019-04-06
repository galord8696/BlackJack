/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BlackJack;
import static java.lang.System.*;
import java.util.ArrayList;
import java.util.Scanner;
/**
 *
 * @author dekel
 */
public class Multiplayer extends BlackJack
{
    private ArrayList<Playerable> players; //you cannot have any other instance variables
    
    public Multiplayer() 
    {
        super();
    }
    
    public static void main( String args[ ] ) {
        BlackJack game = new BlackJack();
        game.playGame();
    }
}