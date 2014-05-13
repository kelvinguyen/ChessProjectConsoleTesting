package View;

import java.util.ArrayList;

public class ChessUI {
	public void display(ArrayList<String> chessFile){
		String str ="";
		for(String test : chessFile){
			//System.out.println(test);
			if(test.matches("(^[KQBMRPkqbmrp][ldLD][a-hA-H][1-8]$)")){
				str = translate(test);
				System.out.println("Place the "+str.substring(0,str.indexOf(' '))+" on "+ str.substring(str.indexOf(' ')+1));
			}
			else if(test.matches("(^[a-hA-H][1-8]\\s[a-hA-H][1-8]$)")){
				System.out.println("moves the pieces at "+test.substring(0,test.indexOf(' '))+" to the square at "+ test.substring(test.indexOf(' ')+1));
			}
			else if(test.matches("(^[a-hA-H][1-8]\\s[a-hA-H][1-8]\\*$)")){
				test =test.replace('*', ' ');
				System.out.println("moves the pieces at "+test.substring(0,test.indexOf(' '))+" to "+ test.substring(test.indexOf(' ')+1) + "and capture the piece at "+test.substring(test.indexOf(' ')+1));
			}
			else if(test.matches("(^[a-hA-H][1-8]\\s[a-hA-H][1-8]\\s[a-hA-H][1-8]\\s[a-hA-H][1-8]$)")){
				String[]theSplit = test.split("\\s");
				System.out.println("moves the king from "+ theSplit[0]+" to "+theSplit[1]+" and moves the rook from "+ theSplit[2]+" to "+ theSplit[3]);
			}
		}
	}
	
	public String translate(String str){
		str.trim();
		String temp ="";
		int index = 0;
		String finalStr = "";
		for(int i = 0; i<str.length(); i+=2){
			index +=2;
			temp = str.substring(i,index);
			if(temp.equalsIgnoreCase("kl")){ finalStr += "WhiteKing ";}
			else if(temp.equalsIgnoreCase("kd")){finalStr += "BlackKing ";}
			else if(temp.equalsIgnoreCase("ql")){finalStr += "WhiteQween ";}
			else if(temp.equalsIgnoreCase("qd")){finalStr += "BlackQueen ";}
			else if(temp.equalsIgnoreCase("bd")){finalStr += "BlackBishop ";}
			else if(temp.equalsIgnoreCase("bl")){finalStr += "WhiteBishop ";}
			else if(temp.equalsIgnoreCase("nl")){finalStr += "WhiteKnight ";}
			else if(temp.equalsIgnoreCase("nd")){finalStr += "BlackKnight ";}
			else if(temp.equalsIgnoreCase("rl")){finalStr += "WhiteRook ";}
			else if(temp.equalsIgnoreCase("rd")){finalStr += "BlackRook ";}
			else if(temp.equalsIgnoreCase("pl")){finalStr += "WhitePawn ";}
			else if(temp.equalsIgnoreCase("pd")){finalStr += "BlackPawn ";}
			else{finalStr +=temp +" ";}
		}
		//System.out.println(finalStr);
		return finalStr;
	}
}
