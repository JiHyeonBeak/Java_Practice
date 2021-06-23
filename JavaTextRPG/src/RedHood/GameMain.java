package RedHood;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class GameMain {
	static List<Game> gm = new ArrayList<Game>();
	static GameMethod gmm = new GameMethod();
	
	public static void main(String[] args) throws IOException {
		
		int menu = gmm.menu();
		switch(menu) {
		case 1: 
			gmm.start(gm);
			gmm.battle(gm);
			break;
		case 2:
			System.out.println("시스템 종료");
			return;
		default:
			System.out.println("선택 범위를 넘었습니다.");
			
		}
		
	}

}
