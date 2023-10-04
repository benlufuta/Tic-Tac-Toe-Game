/**
 * Project: Tic-Tac-Toe game
 * Description: This is Tic-Tac-Toe game that can be played by two people, or 
 * just one person and A.I. The game checks for any possible win or draw.
 * Concepts used: Classes, Array, Scanner, Random, Static variables and methods.
 * Date: 10/02/2023
 * @author Ben Lufuta
 */
package tic.tac.toe;

public class TicTacToe {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        GameDriver driver = new GameDriver();
        //The game can be played by two humans or
        //a human and A.I
        HumanPlayer p1 = new HumanPlayer("Jason", 'X');
        
        //If two humans are playing, uncomment line 22 and
        //comment line 24. Otherwise, leave everything as is.
        //HumanPlayer p2 = new HumanPlayer("Jason", 'X');

        AIPlayer p2 = new AIPlayer("A.I.", 'O');
        
        Player currPlayer;
        
        currPlayer = p1;
        
        //Use an infinite while loop to keep the game going until someone wins
        while(true){
            
            System.out.println(currPlayer.name + " turn");
        
        //Call makeMove() method to place a mark on the board
        currPlayer.makeMove();
        
        //Go ahead and display the update board after the most recent move.
        GameDriver.displayBoard();
        
        //Now check if someone won. 
        if (GameDriver.checkWin()){
            
            //If so print a message to the console, and then exit the loop..
            System.out.println(currPlayer.name + " has won!");
            break;
            
        } else if (GameDriver.checkDraw()) {
        
            //In case it is a draw, print a message too, and then exit the loop.
            System.out.println("It is a draw!");
            break;
            
        } else {
            //If the above two checks fail, update the current player and repeat
            //the whole loop again.
            if (currPlayer == p1){
                
                currPlayer = p2;
            } else {
                
                currPlayer = p1;
            } 
          }
        }
    }
    
    
}
