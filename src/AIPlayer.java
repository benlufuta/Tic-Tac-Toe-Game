package tic.tac.toe;

import java.util.Random;
import java.util.Scanner;


//Extends the parent class "Player" to inheritate its variables and methods.
public class AIPlayer extends Player {

    Scanner scan = new Scanner(System.in);
    
    //Constructor to initialize variables inherited 
    public AIPlayer(String name, char mark) {
        this.name = name;
        this.mark = mark;
    }
    
    //Method to allow A.I player to make a move.
    public void makeMove(){
        
        int row;
        int col;
        
        //Use the random class to generate random row and col within the range(0-2)
        do {
            
            Random rand = new Random();
            
            row = rand.nextInt(3);
            col = rand.nextInt(3);
        
        } while (!isValidMove(row, col));
        
        //If we get here, then the A.I player has randomized valid coordinates(row, col)
        //So we can call placeMark() method to place the mark.
        GameDriver.placeMark(row, col, mark);
    }
}
