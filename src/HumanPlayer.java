package tic.tac.toe;

import java.util.Scanner;

//Extends the parent class "Player" to inheritate its variables and methods.
public class HumanPlayer extends Player {

    //Scanner to receive input from player
    Scanner scan = new Scanner(System.in);
    
    //Constructor to initialize the inheritated variables
    public HumanPlayer(String name, char mark) {
        this.name = name;
        this.mark = mark;
    }
    
    //Method to allow the player to make a move.
    public void makeMove(){
        
        int row;
        int col;
        
        //Keep looping until the player has entered a valid row and col.
        //If row and col are already occupied or if they are bigger or smaller
        //than the range of the board (0-2).
        do {
            
        System.out.println("Enter row number:");
        row = scan.nextInt();
        System.out.println("Enter column number:");
        col = scan.nextInt();
        
        } while (!isValidMove(row, col));
        
        //If we get here, then the player has entered valid coordinates(row, col)
        //So we can call placeMark() method to place the mark.
        GameDriver.placeMark(row, col, mark);
    }
}
