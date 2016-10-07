package chemistry;

/**
 * Created by Paul Lancaster on 06/10/16
 */
public enum Structure {
    // Data on VSPER structures
    // Angle one, angle 2, bonded electron pairs from ligands count, lone pair count
    LINEAR(180,0,2,0),
    BENT_ONE(120,0,2,1),
    BENT_TWO(109,0,2,2),
    TRIGONAL_PLANAR(120,0,3,0),
    TETRAHEDRAL(109,0,4,0),
    OCTAHEDRAL(90,0,6,0),
    TRIGONAL_PYRAMIDAL(106.7,0,3,1),
    SEESAW_DISPHENOIDAL(180,120, 5, 0), //Also 90 degrees
    SQUARE_PYRAMIDAL(180,90,5,1),
    SQUARE_PLANAR(180,90,4,2),
    T_SHAPED(180,90,3,3),
    LINEAR_THREE(180,0,2,3),
    PENTAGONAL_PYRAMIDAL(0,0,0,0), // TODO Needs updating
    LINEAR_FOUR(180,0,2,4),
    PENTAGONAL_BIPYRAMIDAL(90,72,7,0);

    ;

    public double[] bondAngles; // contains 2 entries at index 0 and 1 for the 2 different angles
    public int X; // number of bonded electron pairs from ligands (a ligand can provide 2 electron pairs)
    public int E; // number of lone pairs


    Structure(double angleOne, double angleTwo, int X, int E){
        this.bondAngles = new double[]{angleOne,angleTwo};
        this.X = X;
        this.E = E;
    }
}
