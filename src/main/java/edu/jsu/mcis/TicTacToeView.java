package edu.jsu.mcis;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;



public class TicTacToeView extends JPanel implements ActionListener {
    
    private static final long serialVersionUID = 1L;

    private TicTacToeModel model;

    private JButton[][] squares;
    private JPanel squaresPanel;
    private JLabel resultLabel;

    public TicTacToeView(TicTacToeModel model) {

        this.model = model;

        int width = model.getWidth();

        this.setLayout(new BoxLayout(this, BoxLayout.PAGE_AXIS));
        squares = new JButton[width][width];
        squaresPanel = new JPanel(new GridLayout(width,width));
        resultLabel = new JLabel();
        resultLabel.setName("ResultLabel");
        
        for (int row = 0; row < width; row++){
            
            for (int col = 0; col < width; col++){
                
                squares[row][col] = new JButton(); 
                squares[row][col].addActionListener(this);
                squares[row][col].setName("Square" + row + col);
                squares[row][col].setPreferredSize(new Dimension(64,64));
                squaresPanel.add(squares[row][col]);
                
            }
            
        }

        this.add(squaresPanel);
        this.add(resultLabel);
        
        resultLabel.setText("Welcome to Tic-Tac-Toe!");

    }

    @Override
    public void actionPerformed(ActionEvent event) {
        
        /* Handle button clicks.  Extract the row and col values from the name
           of the button that was clicked, then make the mark in the grid using
           the Model's "makeMark()" method.  Finally, use the "updateSquares()"
           method to refresh the View.  If the game is over, show the result
           (from the Model's "getResult()" method) in the result label. */
        
        String button = ((JButton) event.getSource()).getName(); // Get button name
        
        
        int row = Integer.parseInt(button.substring(6,7));
        int col = Integer.parseInt(button.substring(7,8));
        model.makeMark(row, col);
        updateSquares();
       

        if(model.isGameover()) {
            showResult((model.getResult().toString()));
            for(int i = 0; i < model.getWidth(); i++){
                for(int j = 0; j < model.getWidth(); j++){
                    squares[i][j].setEnabled(false);
                }
            }
        }
    }
        
    public void updateSquares() {

        /* Loop through all View buttons and (re)set the text of each button
           to reflect the grid contents (use the Model's "getMark()" method). */

        int width = model.getWidth();
        
        for(int a = 0; a < width; a++) {
            for(int v = 0; v < width; v++) {
                squares[a][v].setText(model.getMark(a,v).toString());
            }
        }
    }
        
    public void showResult(String message) {
        resultLabel.setText(message.toUpperCase());
    }

}