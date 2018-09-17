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
    
    private Mark[][] grid; /* Game grid */
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
		 [][] grid = Mark[width][width];
       
         /* Initialize grid by filling every square with empty marks */

        /* INSERT YOUR CODE HERE */
        for(int i = 0; i < width; ++i){
            for(int j = 0; j < width; ++j){
             grid[i][j] = EMPTY;   
            }
            System.out.println(grid);
        }
        
    }
	
    public boolean makeMark(int row, int col) {
        
        /* Place the current player's mark in the square at the specified
           location, but only if the location is valid and if the square is
           empty! */
        
        /* INSERT YOUR CODE HERE */
        boolean result  = false;
        isValidSquare(row, col);
        isSquareMarked(row, col); 
		Mark[][] isSquareMarked;
        Mark isValidSquare;
        if (/*grid[row][col] == isValidSquare && grid[row][col] != isSquareMarked[row][col]*/) {
            if(){}
           // result = true;
        }

        return result; /* remove this line! */
        
    }
	
    private boolean isValidSquare(int row, int col) {
        
        /* Return true if specified location is within grid bounds */
        
        /* INSERT YOUR CODE HERE */
        boolean a = false;
        if(row < width && col < width){
             a = true;
            
        }
        else{
            System.out.println("Invalid input, please try again");
        }
         return a; /* remove this line! */
        
    }
	
    private boolean isSquareMarked(int row, int col) {
        
        /* Return true if square at specified location is marked */
        
        /* INSERT YOUR CODE HERE */
        boolean b = false;
        Mark blot = Mark.EMPTY;
        if (grid[row][col] != blot) {
            b = true;
        }
        else{
            System.out.println("Invalid option, the area is already marked. Please input a new area");
        }

        return b; /* remove this line! */
            
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
        
        if(){
            System.out.println("Congrats, You are the winner");
        }
        else{
            System.out.println("Congrats, You are the winner!");
        }

        return null; /* remove this line! */

    }
	
    private boolean isMarkWin(Mark mark) {
        
        /* Check the squares of the board to see if the specified mark is the
           winner */
        
        /* INSERT YOUR CODE HERE */
        for(int l = 0; l < width; ++l){
            for(int k = 0; k < width; ++k){
               
            }
        }

        return false; /* remove this line! */

    }
	
    private boolean isTie() {
        
        /* Check the squares of the board to see if the game is a tie */

        /* INSERT YOUR CODE HERE */
        boolean tie = false;
        int turn = 0;
        int turn2 = 0;
        int counter = 9;
        for (int k =0; k > counter; ++k){
            ++turn;
            ++turn2;
            if(turn > counter || turn2 > counter){
                tie = true;
                break;
            }
            System.out.println("The match is a tie!");
        }

        return tie; /* remove this line! */
        
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