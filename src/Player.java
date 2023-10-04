package tic.tac.toe;

abstract class Player {

    //Variables.
    String name;
    char mark;
    
    //This method is abstract because it will allow every child class to 
    //implement it based on its own needs.
    abstract void makeMove();
    
    //This method is not abstract because it will the same in every child's class.
    public boolean isValidMove(int row, int col){
        
        return ((row >= 0 && row <= 2) && (col >= 0 && col <= 2) 
                
            &&  GameDriver.gameBoard[row][col] == ' ');
    }
}
