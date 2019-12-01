/*
 * @(#)PlayBaseballGame.java		 2019/12/02
 * 
 * 
 * Copyright (c) YerinCho
 * 
 * 
 */

package playbaseballgame;

import java.util.Scanner;

/**
 * 
 * @version 0.1 2019�� 12�� 2��
 * @author YerinCho
 */

public class PlayBaseballGame {
	Scanner sc = new Scanner(System.in);
	
	private Computer com = new Computer();
	private Player player = new Player(); 
	
	public void run() { 
		
		System.out.println("���� �߱� ���� ����!");
		com.makeAnswer();
		int playerans=0;		//�÷��̾ �Է��� �� ������ ����
		
		/*�÷��̾ ���� ������ ������ ����ȴ�. ���缭 �ƿ��� �Ǹ� �ݺ��� Ż��*/
		while(true) {
			player.askNumber();
			playerans=player.returnAns();
			
			/*�ƿ��̸� ���� ���� ����*/
			if(com.checkStrikeBall(playerans)==false) {
				break;
			}
		}
		
		isStop();			//������ ���� �������� �Ǵ�
		return;
		
	}
	
	
	/*������ ���� ��������, ������ �Ǵ��ϴ� �Լ�*/
	public void isStop() {
		String restart;
		
		System.out.println("������ ���� �����Ϸ���  1, �����Ϸ��� 2�� �Է��ϼ���.");
		restart=sc.next();
		
		switch (restart) {
		case "1" :
			run();
			break;
		
		case "2":
			System.out.println("������ �����մϴ�.");
			break;
		
			
		/*1,2 �� �ٸ� ���� �ԷµǾ��� �� ���� ���� ����*/
		default :
			System.out.println("�߸��� �Է��Դϴ�. ������ �����մϴ�.");
			break;
		}
	}
}

