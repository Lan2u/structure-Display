/**
 * Created by Paul Lancaster on 06/10/16
 */
public enum Structure {
    // Data on VSPER structures
    // Angle one, angle 2, ligand count, lone pair count
    LINEAR(180,0,2,0),
    BENT_ONE(),
    BENT_TWO(),
    TRIGONAL_PLANAR(120, ),
    TETRAHEDRAL(),
    OCTAHEDRAL(),

    ;

    public double[] bondAngles;
    public int X;
    public int E;


    Structure(double angleOne, double angleTwo, int X, int E){
        this.bondAngles = new double[]{angleOne,angleTwo};
        this.X = X;
        this.E = E;
    }
}
