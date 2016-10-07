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
    JTextField inField;
    Button translateButton;

    public static void main(String[] args){
       new structureDisplay();
    }

    structureDisplay(){
        setSize(200,100);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BoxLayout(this, BoxLayout.LINE_AXIS));

        inField = new JTextField("AXnEy"); // Placeholder text
        add(inField);

        translateButton = new Button("Translate");
        translateButton.addActionListener(this);
        add(translateButton);

        OutputPanel outputPanel = new OutputPanel();
        add(outputPanel);
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        // Button to translate from AXE to structure pressed
        try {
            Structure generateStructure = Convert.convert(inField.getText());
        } catch (Exception e){
            e.printStackTrace();
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
