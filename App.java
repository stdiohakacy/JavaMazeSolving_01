package MazeSolving;

import java.io.FileNotFoundException;

public class App {
	public static void main(String[] args) throws FileNotFoundException {
		FileReader fileReader = new FileReader("src/MazeSolving/map.txt", 5, 5);
		fileReader.parseFile();
		fileReader.showMap();
		System.out.println();
		System.out.println();
		
		MazeSolver mazeSolve = new MazeSolver(
				fileReader.getMap(), 
				fileReader.getStartPositionCol(), 
				fileReader.getStartPositionRow()
		);
		mazeSolve.findWayOut();
	}
}
