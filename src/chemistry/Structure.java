package chemistry;

/**
 * Created by Paul Lancaster on 06/10/16
 */
public enum Structure {
    // Data on VSPER structures
    // Angle one, angle 2, ligand count, lone pair count
    LINEAR(180,0,2,0),
    BENT_ONE(120,0,2,1),
    BENT_TWO(109,0,2,2),
    TRIGONAL_PLANAR(120,0,3,0),
    TETRAHEDRAL(109,0,4,0),
    OCTAHEDRAL(90,0,6,0),

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
