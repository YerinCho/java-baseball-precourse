
/*
 * @(#)Player.java		 2019/12/02
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

public class Player {
	private int num = 0;
	
	/*�÷��̾�� �� �Է� ��û�ϴ� �Լ�*/
	public void askNumber() {
		Scanner sc =new Scanner(System.in);
		String tmpnum ="";		//����ڰ� �Է��ϴ� ���� ������ ���� �����Ƿ�, ��Ʈ������ tmpnum ����
		
		while(true) {
			System.out.print("1���� 9������ ���� �ٸ� ���ڸ� ���ڸ� �Է����ּ��� : ");
			tmpnum=sc.next();
			
			/*�÷��̾ �Է��� ���� �ùٸ��� ó���ϴ� �Լ�*/
			if(checkInput(tmpnum)) {
				break;
			}
			else {
				System.out.println("�Է��� ���� �ùٸ��� �ʽ��ϴ�.");
			}
		}
		
		/*���ڿ��� ���� ������ ��ȯ*/
		this.num=Integer.parseInt(tmpnum);
	}
	
	
}