package numberguessergui.src;
import java.util.Random;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Main {
    public static int screenHeight = 400;
    public static int screenWidth = 500;
    public static void main(String[] args)
    {
        // Creating instance of JFrame
        JFrame frame = new JFrame();
    
        // Creating instance of JButton
        JButton button = new JButton("Guess");
        button.setBounds(140, 170, 200, 50);

        JTextField guessField = new JTextField("100", 10);
        guessField.setBounds(187, 100, 100, 50);

        JLabel label1 = new JLabel("Pick a number between 1 - 100!");
        label1.setBounds(150, 50, 300, 20);
    
        frame.add(button);
        frame.add(guessField);
        frame.add(label1);
        frame.setSize(screenWidth, screenHeight);
        frame.setLayout(null);
        frame.setVisible(true);

        Random rand = new Random(); //  Create new Random
        int randomNumber = rand.nextInt(100 - 1 + 1) + 1;    //  Only select random numbers from 1 to 100

        // Add an ActionListener to the button
        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                int guessedNumber = Integer.parseInt(guessField.getText());
                if(guessedNumber == randomNumber){
                    System.out.println("You got it right! Random number was: " + randomNumber);
                }
                if(guessedNumber < randomNumber){
                    System.out.println("Pick a higher number! Number guessed: " + guessedNumber);
                }
                if(guessedNumber > randomNumber){
                    System.out.println("Pick a lower number! Number guessed: " + guessedNumber);
                }
            }
        });
    }
}
