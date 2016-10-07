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
    JLabel outLabel;
    Button translateButton;

    public static void main(String[] args){
       new structureDisplay();
    }

    structureDisplay(){
        setSize(200,100);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        inField = new JTextField("AX2E2");
        translateButton = new Button("Translate");
        outLabel = new JLabel("Sucks fam");
        translateButton.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        // Button to translate from AXE to structure pressed
        try {
            Structure generateStructure = convert(inField.getText());
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

    // converts from AXE to structure
    private Structure convert(String text) {
        if (checkInput(text)) { // Check input valid and return converted structure if it is
            return null;
        }
    }
}
