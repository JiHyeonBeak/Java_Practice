package RedHood;

import java.io.IOException;
import java.util.List;
import java.util.Random;
import java.util.Scanner;


public class GameMethod {
	Scanner sc = new Scanner(System.in);
	
	public int menu() {
		System.out.println("*~*~*~*~빨간모자 여행기~*~*~*~*");
		System.out.println("         1.시작             ");
		System.out.println("         2.종료             ");
		int menu = sc.nextInt();
		return menu;
	}
	public void start(List<Game> gm) {
		Game g = new Game();
		System.out.println("빨간 모자의 이름은?");
		g.setName(sc.next());
		gm.add(g);
		System.out.println(g.getName()+"아, 밖은 위험하니 도구를 챙겨가렴.\n1.호미\n2.유리병\n3.과도");
		int weapon = sc.nextInt();
		
		boolean b = true;
		while(b) {
		switch(weapon) {
		case 1:
			System.out.println("빨간모자는 호미를 챙겼다.");
			g.setRhp(4);
			gm.add(g);
			b = false;
			break;
		case 2:
			System.out.println("빨간모자는 유리병을 챙겼다.");
			g.setRhp(5);
			gm.add(g);
			b = false;
			break;
		case 3:
			System.out.println("빨간모자는 과도를 챙겼다.");
			g.setRhp(3);
			gm.add(g);
			b = false;
			break;
		default:
			System.out.println("도구를 골라주세요.");
			break;
		}
	}
	}
	public void battle(List<Game> gm) throws IOException {
		Random rd = new Random();
		int wrp = 4;
		for(Game mm : gm) {
		System.out.println(mm.getName()+"은 골짜기에 다다랐다.");
		System.out.println("잠깐 쉬었다 갈까?\n1.쉰다\n2.그냥 간다");
		int select = sc.nextInt();
		switch(select) {
		case 1:
			System.out.println("바위에 앉아 쉬고있는 "+mm.getName()+"에게 늑대가 나타났다!");
			if(mm.getRhp() == 5) {
				System.out.println("빨간 모자는 유리병을 가지고있다.");
				System.out.println("1.싸운다 2.도망친다");
				int bet = sc.nextInt();
				switch(bet) {
				case 1:
					while(wrp >= 1 || mm.getRhp() >= 1) {
					System.out.println(mm.getName()+"은 유리병으로 늑대를 때렸다!");
					int dam = rd.nextInt(2);
					System.out.println(dam+"의 데미지를 입혔다.");
					wrp = wrp - dam;
					System.out.println("늑대가 "+mm.getName()+"을 때린다.");
					int endam = rd.nextInt(3);
					System.out.println(mm.getName()+"은"+endam+"의 데미지를 입었다.");
					mm.setRhp(mm.getRhp()-endam);
					System.out.println("\n엔터를 누르세요.\n");
					pause();
					
					}
					if(wrp == 0) {
						System.out.println(mm.getName()+"은 늑대를 물리치고 무사히 할머니 집에 도착했다.");
						return;}
					else if(mm.getRhp() == 0) {
						System.out.println(mm.getName()+"은 늑대에게 패배했다.\nGAME OVER");
						return;}
					else {
						System.out.println(mm.getName()+"과 늑대는 동시에 쓰러졌다.\nGAME OVER");
						return;}
				case 2:
					int run = rd.nextInt(10);
					if(run > 3) {
						System.out.println(mm.getName()+"은 무사히 도망쳐 할머니 집에 도착했다.");
						return;}
					else {
						System.out.println("도망에 실패했다!\nGAME OVER");
						return;}
				default:
					System.out.println("선택해주세요.");	
					break;
				}
			}
			else if(mm.getRhp() == 4) {
				System.out.println("빨간 모자는 호미를 가지고있다.");
				System.out.println("1.싸운다 2.도망친다");
				int bet = sc.nextInt();
				switch(bet) {
				case 1:
					while(wrp >= 1 || mm.getRhp() >= 1) {
					System.out.println(mm.getName()+"은 호미로 늑대를 때렸다!");
					int dam = rd.nextInt(3);
					System.out.println(dam+"의 데미지를 입혔다.");
					wrp = wrp - dam;
					System.out.println("늑대가 "+mm.getName()+"을 때린다.");
					int endam = rd.nextInt(3);
					System.out.println(mm.getName()+"은"+endam+"의 데미지를 입었다.");
					mm.setRhp(mm.getRhp()-endam);
					System.out.println("\n엔터를 누르세요.\n");
					pause();
					}
					if(wrp == 0) {
						System.out.println(mm.getName()+"은 늑대를 물리치고 무사히 할머니 집에 도착했다.");
						return;}
					else if(mm.getRhp() == 0) {
						System.out.println(mm.getName()+"은 늑대에게 패배했다.\nGAME OVER");
						return;}
					else {
						System.out.println(mm.getName()+"과 늑대는 동시에 쓰러졌다.\nGAME OVER");
						return;}
				case 2:
					int run = rd.nextInt(10);
					if(run > 3) {
						System.out.println(mm.getName()+"은 무사히 도망쳐 할머니 집에 도착했다.");
						return;}
					else {
						System.out.println("도망에 실패했다!\nGAME OVER");
						return;}
				default:
					System.out.println("선택해주세요.");
					break;
				}
			}
			else if(mm.getRhp() == 3){
				System.out.println("빨간 모자는 과도를 가지고있다.");
				System.out.println("1.싸운다 2.도망친다");
				int bet = sc.nextInt();
				switch(bet) {
				case 1:
					while(wrp >= 1 || mm.getRhp() >= 1) {
					System.out.println(mm.getName()+"은 과도로 늑대를 때렸다!");
					int dam = rd.nextInt(5);
					System.out.println(dam+"의 데미지를 입혔다.");
					wrp = wrp - dam;
					System.out.println("늑대가 "+mm.getName()+"을 때린다.");	
					int endam = rd.nextInt(3);
					System.out.println(mm.getName()+"은"+endam+"의 데미지를 입었다.");
					mm.setRhp(mm.getRhp()-endam);
					System.out.println("\n엔터를 누르세요.\n");				
					pause();
					}
					if(wrp == 0) {
						System.out.println(mm.getName()+"은 늑대를 물리치고 무사히 할머니 집에 도착했다.");
						return;}
					else if(mm.getRhp() == 0) {
						System.out.println(mm.getName()+"은 늑대에게 패배했다.\nGAME OVER");
						return;}
					else {
						System.out.println(mm.getName()+"과 늑대는 동시에 쓰러졌다.\nGAME OVER");
						return;}
				case 2:
					int run = rd.nextInt(10);
					if(run > 3) {
						System.out.println(mm.getName()+"은 무사히 도망쳐 할머니 집에 도착했다.");
					return;}
					else {
						System.out.println("도망에 실패했다!\nGAME OVER");
						return;
					}
				default:
					System.out.println("선택해주세요.");
					break;
					
				}
			}
			break;
		case 2:
			System.out.println("빨간모자 "+mm.getName()+"은 쉬지않고 걸어가 마침내 할머니 집에 도착했다!");
			return;
			
		default:
			System.out.println("선택해주세요.");
			break;
		}
		
	}
}
	public void  pause() throws IOException{
		   System.in.read();
	}

}