package chemistry;// All input preformatted to the form AXnEy with n being >= 1 and y being >=0

// chemistry.Convert from AXnEy form into a structure with a name, angles and electon pairs etc.
public class Convert {
	public static Structure convert(String input) {
		int X = Integer.parseInt(String.valueOf(input.charAt(2)));
		int E = Integer.parseInt(String.valueOf(input.charAt(4)));
		int stericNo = X + E;
		switch (stericNo) {
			case 2: // Linear based
				switch (X) {
					case (1):
					case (2):
						return Structure.LINEAR;
					default:
						throw new IllegalArgumentException("Ligands > steric number 2)");
				}
			case 3: // Trigonal based
				switch (X) {
					case (1):
						return Structure.LINEAR;
					case (2):
						return Structure.BENT_ONE;
					case (3):
						return Structure.TRIGONAL_PLANAR;
					default:
						throw new IllegalArgumentException("Ligands > steric number (3)");
				}
			case 4: // Tetrahedral based
				switch (X) {
					case (1):
					case (2):
					case (3):
					case (4):
					default:
						throw new IllegalArgumentException("Ligands > steric number (4)");
				}
			case 5:
				switch (X) {
					case (1):
					case (2):
					case (3):
					case (4):
					case (5):
					default:
						throw new IllegalArgumentException("Ligands > steric number (5)");
				}
			case 6: // Hexagonal Based
				switch (X) {
					case (1):
					case (2):
					case (3):
					case (4):
					case (5):
					case (6):
					default:
						throw new IllegalArgumentException("Ligands > steric number (6)");
				}
			case 7:
				switch (X) {
					case (1):
					case (2):
					case (3):
					case (4):
					case (5):
					case (6):
					case (7):
					default:
						throw new IllegalArgumentException("Ligands > steric number (7)");
				}
			case 8:
				switch (X) {
					case (1):
					case (2):
					case (3):
					case (4):
					case (5):
					case (6):
					case (7):
					case (8):
					default:
						throw new IllegalArgumentException("Ligands > steric number (8)");
				}
			default:
				throw  new IllegalArgumentException("Steric number > 8 -- UNSUPPORTED");
		}
	}
}