package edu.jsu.mcis;

public class TicTacToeModel {
    
    private static final int DEFAULT_WIDTH = 3;
    
    /* Mark (represents X, O, or an empty square */
    
    public enum Mark {
        
        X("X"), 
        O("O"), 
        EMPTY("-");

        private String message;
        
        private Mark(String msg) {
            message = msg;
        }
        
        @Override
        public String toString() {
            return message;
        }
        
    };
    
    /* Result (represents the final state of the game: X wins, O wins, a tie,
       or NONE if the game is not yet over) */
    
    public enum Result {
        
        X("X"), 
        O("O"), 
        TIE("Tie"), 
        NONE("none");

        private String message;
        
        private Result(String msg) {
            message = msg;
        }
        
        @Override
        public String toString() {
            return message;
        }
        
    };
    
    public Mark[][] grid; /* Game grid */
    private boolean xTurn; /* True if X is current player */
    private int width;     /* Size of game grid */
    
    /* DEFAULT CONSTRUCTOR */
    
    public TicTacToeModel() {
        
        /* No arguments (call main constructor; use default size) */
        
        this(DEFAULT_WIDTH);
        
    }
    
    /* CONSTRUCTOR */
    
    public TicTacToeModel(int width) {
        
        /* Initialize width; X goes first */
        
        this.width = width;
        xTurn = true;

        /* Create grid (width x width) as a 2D Mark array */

        /* INSERT YOUR CODE HERE */
		grid = new Mark[width][width];
       
         /* Initialize grid by filling every square with empty marks */

        /* INSERT YOUR CODE HERE */
        for(int i = 0; i < width; ++i){
            for(int j = 0; j < width; ++j){
             grid[i][j] = Mark.EMPTY;   
            }
        }
        System.out.println(grid);
    }
	
    public boolean makeMark(int row, int col) {
        
        /* Place the current player's mark in the square at the specified
           location, but only if the location is valid and if the square is
           empty! */
        
        /* INSERT YOUR CODE HERE */
        

        boolean result  = false;

        if ( isValidSquare(row,col) && isSquareMarked(row,col) ) {

            result = true;
        }

        return result; /* remove this line! */
        
    }
	
    private boolean isValidSquare(int row, int col) {
        
        /* Return true if specified location is within grid bounds */
        
        /* INSERT YOUR CODE HERE */
        if(row < width && row >= 0){
            if(col < width && col >= 0){
                return true;
               
           }
        }
        return false;
        
    }
	
    private boolean isSquareMarked(int row, int col) {
        
        /* Return true if square at specified location is marked */
        
        /* INSERT YOUR CODE HERE 
    if(){
        if(){

        }
    }
    */
        return false;  //remove this line! */
            
    }
	
    public Mark getMark(int row, int col) {
        
        /* Return mark from the square at the specified location */
        
        
        /* INSERT YOUR CODE HERE */

        return null; /* remove this line! */
            
    }
	
    public Result getResult() {
        
        /* Use isMarkWin() to see if X or O is the winner, if the game is a
           tie, or if the game is not over, and return the corresponding Result
           value */
        
        /* INSERT YOUR CODE HERE */
        
       /*for(int a = 0; a > width; a++){
           for(int b = 0; b > width; b++){
            
           }
       }
        */
        return null; /* remove this line! */

    }
	
    private boolean isMarkWin(Mark mark) {
        
        /* Check the squares of the board to see if the specified mark is the
           winner */
        
        /* INSERT YOUR CODE HERE 
        for(int o = 0; 0 < width; o++){
            for(int p = 0; p <width; p++){
                if(!grid[o].equals(Mark.EMPTY) && grid[o].equals(o + 1) && grid[o].equals(o + 2)){                        /*Horizontal win 
                    return true;
               }
               else if(!grid[p].equals(Mark.EMPTY)){                   /*verical win 
                    return true;
               }            
               else if(!grid[0][0].equals(Mark.EMPTY) && grid[o][p].equals(grid[o][p] && grid[o][p].equals(grid[o][p]))
               || !grid[p][o].equals(Mark.EMPTY && grid[p][o].equals(grid[p][o])) && grid[p][o].equals(grid[p][o])){                   /*diagonal win */ 
    //               return true;
     //          }
      //      }
       // }

        return false; /* remove this line! */

    }
	
    private boolean isTie() {
        
        /* Check the squares of the board to see if the game is a tie */

        /* INSERT YOUR CODE HERE */
        for(int a = 0; a < width; ++a){
            for(int b = 0; b < width; ++b){
               if(grid[a][b] != Mark.EMPTY){
                   return true;
               }
            }
        }
       

        return false; /* remove this line! */
        
    }

    public boolean isGameover() {
        
        /* Return true if the game is over */
        
        return Result.NONE != getResult();
        
    }

    public boolean isXTurn() {
        
        /* Getter for xTurn */
        
        return xTurn;
        
    }

    public int getWidth() {
        
        /* Getter for width */
        
        return width;
        
    }
    
}