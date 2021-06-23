package RedHood;

import java.io.IOException;
import java.util.List;
import java.util.Random;
import java.util.Scanner;


public class GameMethod {
	Scanner sc = new Scanner(System.in);
	
	public int menu() {
		System.out.println("*~*~*~*~�������� �����~*~*~*~*");
		System.out.println("         1.����             ");
		System.out.println("         2.����             ");
		int menu = sc.nextInt();
		return menu;
	}
	public void start(List<Game> gm) {
		Game g = new Game();
		System.out.println("���� ������ �̸���?");
		g.setName(sc.next());
		gm.add(g);
		System.out.println(g.getName()+"��, ���� �����ϴ� ������ ì�ܰ���.\n1.ȣ��\n2.������\n3.����");
		int weapon = sc.nextInt();
		
		boolean b = true;
		while(b) {
		switch(weapon) {
		case 1:
			System.out.println("�������ڴ� ȣ�̸� ì���.");
			g.setRhp(4);
			gm.add(g);
			b = false;
			break;
		case 2:
			System.out.println("�������ڴ� �������� ì���.");
			g.setRhp(5);
			gm.add(g);
			b = false;
			break;
		case 3:
			System.out.println("�������ڴ� ������ ì���.");
			g.setRhp(3);
			gm.add(g);
			b = false;
			break;
		default:
			System.out.println("������ ����ּ���.");
			break;
		}
	}
	}
	public void battle(List<Game> gm) throws IOException {
		Random rd = new Random();
		int wrp = 4;
		for(Game mm : gm) {
		System.out.println(mm.getName()+"�� ��¥�⿡ �ٴٶ���.");
		System.out.println("��� ������ ����?\n1.����\n2.�׳� ����");
		int select = sc.nextInt();
		switch(select) {
		case 1:
			System.out.println("������ �ɾ� �����ִ� "+mm.getName()+"���� ���밡 ��Ÿ����!");
			if(mm.getRhp() == 5) {
				System.out.println("���� ���ڴ� �������� �������ִ�.");
				System.out.println("1.�ο�� 2.����ģ��");
				int bet = sc.nextInt();
				switch(bet) {
				case 1:
					while(wrp >= 1 || mm.getRhp() >= 1) {
					System.out.println(mm.getName()+"�� ���������� ���븦 ���ȴ�!");
					int dam = rd.nextInt(2);
					System.out.println(dam+"�� �������� ������.");
					wrp = wrp - dam;
					System.out.println("���밡 "+mm.getName()+"�� ������.");
					int endam = rd.nextInt(3);
					System.out.println(mm.getName()+"��"+endam+"�� �������� �Ծ���.");
					mm.setRhp(mm.getRhp()-endam);
					System.out.println("\n���͸� ��������.\n");
					pause();
					
					}
					if(wrp == 0) {
						System.out.println(mm.getName()+"�� ���븦 ����ġ�� ������ �ҸӴ� ���� �����ߴ�.");
						return;}
					else if(mm.getRhp() == 0) {
						System.out.println(mm.getName()+"�� ���뿡�� �й��ߴ�.\nGAME OVER");
						return;}
					else {
						System.out.println(mm.getName()+"�� ����� ���ÿ� ��������.\nGAME OVER");
						return;}
				case 2:
					int run = rd.nextInt(10);
					if(run > 3) {
						System.out.println(mm.getName()+"�� ������ ������ �ҸӴ� ���� �����ߴ�.");
						return;}
					else {
						System.out.println("������ �����ߴ�!\nGAME OVER");
						return;}
				default:
					System.out.println("�������ּ���.");	
					break;
				}
			}
			else if(mm.getRhp() == 4) {
				System.out.println("���� ���ڴ� ȣ�̸� �������ִ�.");
				System.out.println("1.�ο�� 2.����ģ��");
				int bet = sc.nextInt();
				switch(bet) {
				case 1:
					while(wrp >= 1 || mm.getRhp() >= 1) {
					System.out.println(mm.getName()+"�� ȣ�̷� ���븦 ���ȴ�!");
					int dam = rd.nextInt(3);
					System.out.println(dam+"�� �������� ������.");
					wrp = wrp - dam;
					System.out.println("���밡 "+mm.getName()+"�� ������.");
					int endam = rd.nextInt(3);
					System.out.println(mm.getName()+"��"+endam+"�� �������� �Ծ���.");
					mm.setRhp(mm.getRhp()-endam);
					System.out.println("\n���͸� ��������.\n");
					pause();
					}
					if(wrp == 0) {
						System.out.println(mm.getName()+"�� ���븦 ����ġ�� ������ �ҸӴ� ���� �����ߴ�.");
						return;}
					else if(mm.getRhp() == 0) {
						System.out.println(mm.getName()+"�� ���뿡�� �й��ߴ�.\nGAME OVER");
						return;}
					else {
						System.out.println(mm.getName()+"�� ����� ���ÿ� ��������.\nGAME OVER");
						return;}
				case 2:
					int run = rd.nextInt(10);
					if(run > 3) {
						System.out.println(mm.getName()+"�� ������ ������ �ҸӴ� ���� �����ߴ�.");
						return;}
					else {
						System.out.println("������ �����ߴ�!\nGAME OVER");
						return;}
				default:
					System.out.println("�������ּ���.");
					break;
				}
			}
			else if(mm.getRhp() == 3){
				System.out.println("���� ���ڴ� ������ �������ִ�.");
				System.out.println("1.�ο�� 2.����ģ��");
				int bet = sc.nextInt();
				switch(bet) {
				case 1:
					while(wrp >= 1 || mm.getRhp() >= 1) {
					System.out.println(mm.getName()+"�� ������ ���븦 ���ȴ�!");
					int dam = rd.nextInt(5);
					System.out.println(dam+"�� �������� ������.");
					wrp = wrp - dam;
					System.out.println("���밡 "+mm.getName()+"�� ������.");	
					int endam = rd.nextInt(3);
					System.out.println(mm.getName()+"��"+endam+"�� �������� �Ծ���.");
					mm.setRhp(mm.getRhp()-endam);
					System.out.println("\n���͸� ��������.\n");				
					pause();
					}
					if(wrp == 0) {
						System.out.println(mm.getName()+"�� ���븦 ����ġ�� ������ �ҸӴ� ���� �����ߴ�.");
						return;}
					else if(mm.getRhp() == 0) {
						System.out.println(mm.getName()+"�� ���뿡�� �й��ߴ�.\nGAME OVER");
						return;}
					else {
						System.out.println(mm.getName()+"�� ����� ���ÿ� ��������.\nGAME OVER");
						return;}
				case 2:
					int run = rd.nextInt(10);
					if(run > 3) {
						System.out.println(mm.getName()+"�� ������ ������ �ҸӴ� ���� �����ߴ�.");
					return;}
					else {
						System.out.println("������ �����ߴ�!\nGAME OVER");
						return;
					}
				default:
					System.out.println("�������ּ���.");
					break;
					
				}
			}
			break;
		case 2:
			System.out.println("�������� "+mm.getName()+"�� �����ʰ� �ɾ ��ħ�� �ҸӴ� ���� �����ߴ�!");
			return;
			
		default:
			System.out.println("�������ּ���.");
			break;
		}
		
	}
}
	public void  pause() throws IOException{
		   System.in.read();
	}

}