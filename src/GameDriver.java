
package tic.tac.toe;

public class GameDriver {
    
    //Create a 2D array of char to hold the board.
    static char [][] gameBoard;

    public GameDriver() {
        
        //Initialize the array
        gameBoard = new char [3][3];
        
        //When an object of this class is created, call initializeBoard() to 
        //ensure that the board is initialized.
        initializeBoard(); 
    }
    
    private void initializeBoard(){
        
        //Use loops to initialize the 2D array, so that it contains empty spaces
        for (int i = 0; i< gameBoard.length; i++){
            
            for (int j = 0; j < gameBoard[i].length; j++){
                
                gameBoard[i][j] = ' ';
            }
        }
    }
    
    //Display the board to the console
    static void displayBoard(){
        
        System.out.println("------------");
        
         for (int i = 0; i< gameBoard.length; i++){
             
            System.out.print("| ");
             
            for (int j = 0; j < gameBoard[i].length; j++){
                
                System.out.print(gameBoard[i][j] + " | ");
            }
            
            System.out.println();
            System.out.println("------------");
        }
    }
    
    
    static void placeMark (int row, int column, char mark){
        
        //Place the mark in the appropriate coordinates, or print a message
        //indicating that wrong coordinates were entered.
        if ((row >= 0 && row <= 2) && (column >= 0 && column <= 2)) {
            
            gameBoard[row][column] = mark;
        } else {
            
            System.out.println("Invalid Coordinates provided!");
        }
    }
    
    static boolean checkWin(){
        
        //Check Column win
        for (int j = 0; j <=2; j++){
            
            if (gameBoard[0][j] != ' ' && gameBoard[0][j] == gameBoard[1][j] && gameBoard[1][j] == gameBoard[2][j] ) {
                System.out.println("There is a column win!");
                return true;
            }
        }
        
        //Check Row win
        for (int i = 0; i <=2; i++){
            
            if (gameBoard[i][0] != ' ' && gameBoard[i][0] == gameBoard[i][1] && gameBoard[i][1] == gameBoard[i][2] ) {
                System.out.println("There is a row win!");
                return true;
            }
        }
        
        //Check Diagonal Win
        if ((gameBoard[0][0] != ' ' && gameBoard[0][0] == gameBoard[1][1] && gameBoard[1][1] == gameBoard[2][2] )
                
        || (gameBoard[0][2] != ' ' && gameBoard[0][2] == gameBoard[1][1] && gameBoard[1][1] == gameBoard[2][0] )){
            System.out.println("There is a diagonal win!");
            return true;
        } else {
             return false;
        }
        
       
    }
    
    //Check for Draw
    static public boolean checkDraw(){
        
        //If there is still at least one spot that is empty return draw is false,
        //else return true to indicate that the game is a draw.
        for(int i = 0; i <=2; i++){
            
            for (int j = 0; j<= 2; j++){
            
                if (gameBoard[i][j] != ' '){
                    return false;
                }
            }
        }
        
        return true;
    }
    
}
