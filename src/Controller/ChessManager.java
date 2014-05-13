package Controller;

import File_IO.FileIO;
import View.ChessUI;

public class ChessManager {
	public void run(){
		FileIO file = new FileIO();
		file.load();
		ChessUI dis = new ChessUI();
		dis.display(file.chessFile);
	}
	
	public static void main(String []args){
		ChessManager manager = new ChessManager();
		manager.run();
	}
}
