package gui;

import chemistry.Structure;

import javax.swing.*;

/**
 * Created by Paul Lancaster on 07/10/16
 */

// Output panel which encapsulates all the information that is outputted by the program
public class OutputPanel extends JPanel {

    private int lonePairs;
    private int bondedPairs;
    private JLabel nameLabel, pairLabel;

    OutputPanel(){
        String PLACEHOLDER_NAME = "Name: N/A";
        String PLACEHOLDER_PAIR = "n bonded pairs and y lone pairs";

        this.setLayout( new BoxLayout(this, BoxLayout.PAGE_AXIS));

        nameLabel = new JLabel(PLACEHOLDER_NAME); // Place holder text
        pairLabel = new JLabel(PLACEHOLDER_PAIR); // Place holder text
        this.add(nameLabel);
        this.add(pairLabel);
    }

    @Override
    private void setName(String name){
        nameLabel.setText("Name: " + name);
    }

    private void setLonePairs(int lonePairs) {
        this.lonePairs = lonePairs;
        pairLabel.setText(bondedPairs + " bonded pairs and " + this.lonePairs + " lone pairs");
    }

    private void setBondedPairs(int bondedPairs) {
        this.bondedPairs = bondedPairs;
        pairLabel.setText(this.bondedPairs + " bonded pairs and " + lonePairs + " lone pairs");
    }

    public void display(Structure generatedStructure) {
        generatedStructure.toString();
    }
}
