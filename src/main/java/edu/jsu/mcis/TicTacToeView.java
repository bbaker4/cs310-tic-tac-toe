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
        System.out.println();
        System.out.println();
      System.out.print(" ");
        for(int e = 0; e < model.getWidth(); e++){
            System.out.println(e);
        }
        System.out.println('\n');
            for(int a = 0; a < model.getWidth(); a++){
                System.out.println(a + " ");
                for(int b = 0; b < model.getWidth(); b++){
                    System.out.print(model.getMark(a, b));

                }
                System.out.println('\n');
            }
        }
    

    public void showNextMovePrompt() {

        /* Display a prompt for the player's next move (see examples) */

        /* INSERT YOUR CODE HERE */

    }

    public void showInputError() {

        /* Display an error if input is invalid (see examples) */

        /* INSERT YOUR CODE HERE */

    }

    public void showResult(String r) {

        /* Display final winner */

        System.out.println(r + "!");

    }
	
}