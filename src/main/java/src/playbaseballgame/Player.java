
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
	
	/*�÷��̾ �Է��� ���� �ùٸ��� �Ǵ��ϴ� �Լ�, true ���� : �ùٸ�, false ���� : �ùٸ��� ����*/
	public boolean checkInput(String input) {
		boolean check=true;
		
		/*�÷��̾ �Է��� ���� ���ڸ����� Ȯ���ϴ� ���ǹ�*/
		if(checkLen(input)) {
			check = false;		//���ڸ��� �ƴѰ�� check�� false�� ����.
		}
		
		/*�÷��̾ �Է��� ���� ���� ������ �Ǿ��ִ��� Ȯ���ϴ� ���ǹ�*/
		if(check && checkStr(input)) {
			check = false;
		}
		
		/*�÷��̾ �Է��� ���� ���� �ٸ��� Ȯ���ϴ� ����*/
		if(check && checkSame(input)) {
			check = false;
		}
		
		return check;
	}
	
	/*�÷��̾ �Է��� ���� ���ڸ����� Ȯ���ϴ� �Լ�*/
	public boolean checkLen(String input) {
		boolean len=false;
		
		if (input.length()==3) {
			len= true;
		}
		return len;
	}
	
	/*�÷��̾ �Է��� ���� ���ڰ� �ƴ� ���� ������ �Ǿ��ִ��� Ȯ���ϴ� �Լ�*/
	public boolean checkStr(String input) {
		boolean str=false;
		
		/*�Է¹��� ���ڿ��� ������ ��ȯ�Ǵ��� Ȯ���ϴ� ���ǹ�*/
		if(isStringDouble(input)) {	
			str=true;
		}
		
		return str;
	}
	
	/*�Է¹��� ���ڿ��� ������ true, �ƴϸ� false ��ȯ*/
	public static boolean isStringDouble(String s) {
	    try {
	        Double.parseDouble(s);
	        return true;
	    } catch (NumberFormatException e) {
	        return false;
	    }
	  }
	
	/*�÷��̾ �Է��� ���� ���� �ٸ��� Ȯ���ϴ� �Լ�*/
	public boolean checkSame(String input) {
		boolean same=true;
		
		if(input.charAt(0)==input.charAt(1)) {
			same=false;
		}
		
		if(input.charAt(0)==input.charAt(2)) {
			same=false;
		}
		
		if(input.charAt(1)==input.charAt(2)) {
			same=false;
		}
		
		return same;
	}
	
	
}