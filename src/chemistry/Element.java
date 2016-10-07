package chemistry;

import java.awt.*;

public class Element{
    private final int ATOMIC_NUMBER;
    private final String ATOMIC_SYMBOL;
    private final String ATOMIC_NAME;
    private Color colour;
    private Integer outerElectrons;

    Element(int atomicNumber, String symbol, String name, String colourCode, String configuration){
        ATOMIC_NUMBER = atomicNumber;
        ATOMIC_SYMBOL = symbol;
        ATOMIC_NAME = name;
        colour = colourConvert(colourCode);
        int[] electronConfig = getConfig(configuration);

    }

    // Returns the electron configuration as an int array with the first index being
    // 1s then 2s,2p,3s,3p,3d,4s,4p,4d,4f
    private int[] getConfig(String configuration) {
        return null;
    }

    private Color colourConvert(String colourCode) {
        return Color.blue;
    }
}
