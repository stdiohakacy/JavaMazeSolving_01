package MazeSolving;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileReader {
	private int[][] map;
	private String fileName;
	private int numOfRows;
	private int numOfCols;
	private int startPositionCol;
	private int startPositionRow;

	public FileReader(String fileName, int numOfRows, int numOfCols) {
		super();
		this.fileName = fileName;
		this.numOfRows = numOfRows;
		this.numOfCols = numOfCols;
		this.map = new int[numOfRows][numOfCols];
	}
	
	public void parseFile() throws FileNotFoundException {
		Scanner scanner = new Scanner(new File(fileName));
		for (int i = 0; i < this.numOfRows; i++) {
			for (int j = 0; j < this.numOfCols; j++) {
				if (scanner.hasNextInt()) {
					map[i][j] = scanner.nextInt();
					if(map[i][j] == 2) {
						startPositionCol = j;
						startPositionRow = i;
					}
				}
			}
		}

		scanner.close();
	}
	
	public void showMap() {
		
		for (int i = 0; i < this.numOfRows; i++) {
			for (int j = 0; j < this.numOfCols; j++) {
				System.out.printf("%5d", this.map[i][j]);
			}
			System.out.println();
		}
	}
	
	public int[][] getMap() {
		return map;
	}

	public void setMap(int[][] map) {
		this.map = map;
	}

	public int getStartPositionCol() {
		return startPositionCol;
	}

	public void setStartPositionCol(int startPositionCol) {
		this.startPositionCol = startPositionCol;
	}

	public int getStartPositionRow() {
		return startPositionRow;
	}

	public void setStartPositionRow(int startPositionRow) {
		this.startPositionRow = startPositionRow;
	}

}
