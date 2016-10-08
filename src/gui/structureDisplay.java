package gui;

import chemistry.Convert;
import chemistry.Structure;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


/**
 * Created by Paul Lancaster on 26/09/16
 */
// Data from http://php.scripts.psu.edu/djh300/cmpsc221/p3s11-pt-data.htm

    // This uses VESPR to calculate the shapes so won't work for some elements like transition
    // metals
    // TODO add the ability to use molecular orbital theory instead


public class structureDisplay extends JFrame implements ActionListener{
    private JTextField inField;
    private OutputPanel outputPanel;

    public static void main(String[] args){
       new structureDisplay();
    }

    structureDisplay(){
        setSize(200,100);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BoxLayout(this, BoxLayout.LINE_AXIS));

        inField = new JTextField("AXnEy"); // Placeholder text
        add(inField);

        Button translateButton = new Button("Translate");
        translateButton.addActionListener(this);
        add(translateButton);

        outputPanel = new OutputPanel();
        add(outputPanel);
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        // Button to translate from AXE to structure pressed
        if (checkInput(inField.getText())) { // Runs if the input is ok
            Structure generatedStructure = Convert.convert(inField.getText()); // Convert the input into a structure
            outputPanel.display(generatedStructure); // Display the structure
        }else{
            // Input form incorrect
            System.out.println("Bad Input");
        }
    }

    // Checks given AXE input is in correct form and returns true if it is
    // Throws an error describing why it isn't valid if it isn't
    private boolean checkInput(String text) {
        if (text.length() < 3 || text.isEmpty()){
            throw new IllegalArgumentException("Invalid input, Input < 3");
        }
        return true;
    }
}
