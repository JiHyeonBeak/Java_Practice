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
			System.out.println("�ý��� ����");
			return;
		default:
			System.out.println("���� ������ �Ѿ����ϴ�.");
			
		}
		
	}

}
