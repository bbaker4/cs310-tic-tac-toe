package edu.jsu.mcis;

public class TicTacToeView {

    private TicTacToeModel model;
    
    /* CONSTRUCTOR */
	
    public TicTacToeView(TicTacToeModel model) {
        
        this.model = model;
        
    }
	
    public void viewModel() {
        
        /* Print the board to the console (see examples) */
        
        /* INSERT YOUR CODE HERE */
        System.out.print("\n\n");
        System.out.print("  ");
        for(int e = 0; e < model.getWidth(); e++){
            System.out.print(e);
        }
        System.out.print("\n\n");
            for(int a = 0; a < model.getWidth(); a++){
                System.out.print(a + " ");
                for(int b = 0; b < model.getWidth(); b++){
                    System.out.print(model.getMark(a, b));

                }
                System.out.print("\n");
            }
            System.out.print("\n\n");
        }
    

    public void showNextMovePrompt() {

        /* Display a prompt for the player's next move (see examples) */

        /* INSERT YOUR CODE HERE */
        if(model.isXTurn()){
            System.out.print("Player one (x), make your move:");
        }
        else{
            System.out.print("Player two (O), make your move");
        }
        System.out.print("Enter the row and column numbers, separated by a space");

    }

    public void showInputError() {

        /* Display an error if input is invalid (see examples) */

        /* INSERT YOUR CODE HERE */
        System.out.println("Invalid input please try again");

    }

    public void showResult(String r) {

        /* Display final winner */

        System.out.println(r + "!");

    }
	
}