
public class superBoard {
	static private int width;
	static private int height;
	static private int wallPos;
	static private boolean[][] grid;
	static private boolean DEBUG = false;
	static private boolean committed;
	static private int maxHeight;
	static private int TotalWidths[];
	static private int TotalWidthsBackup[];
	static private int heights[];
	static private int heightsBackup[] ;
	//backup ivars for undo
	static private boolean[][] gridBackup;
	
	
	
	public superBoard(int width, int height) {
		this.width = width;
		this.height = height;
		grid = new boolean[width][height];
		committed = true;

		TotalWidths = new int[height];

		heights = new int[width];

		//initialize backup arrays
		gridBackup = new boolean[width][height];
		TotalWidthsBackup = new int[height];

		heightsBackup = new int[width];

	}
}
