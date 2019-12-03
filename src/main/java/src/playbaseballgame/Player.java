
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
 * @version 0.4 2019�� 12�� 2��
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
			tmpnum=sc.nextLine();
			
			/*�÷��̾ �Է��� �� ���̿� ������ �ִ� ���, ���� �����ϴ� �Լ� ȣ��*/
			tmpnum=checkBlank(tmpnum);
			
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
		sc.close();
	}
	
	
	/*�÷��̾ �Է��� ���� ������ �����ϴ� �Լ�*/
	public String checkBlank(String input) {
		String tmp="";
		
		/*�Է°��� ���캸�鼭, ������ �ƴ� ���� tmp�� �߰�*/
		for(int i=0;i<input.length();i++) {
			if(input.charAt(i)!=' ') {
				tmp=tmp+input.charAt(i);
			}
		}
		return tmp;
	}
	
	/*�÷��̾ �Է��� ���� �ùٸ��� �Ǵ��ϴ� �Լ�, true ���� : �ùٸ�, false ���� : �ùٸ��� ����*/
	public boolean checkInput(String input) {
		boolean check=true;
		
		/*�÷��̾ �Է��� ���� ���ڸ����� Ȯ���ϴ� ���ǹ�*/
		if(checkLen(input)==false) {
			check = false;		//���ڸ��� �ƴѰ�� check�� false�� ����.
		}
		
		/*
		 *�Է��� ���� ���̰� 3�� �ƴ� ���, �ٸ� Ȯ�� ������ �� �ʿ䰡 �����Ƿ� 
		 *check ������ ���� ���� Ȯ�� �� �Ŀ� �ٸ� ������ Ȯ���Ѵ�.
		 *���� ���ǵ鵵 ���������̴�. 
		 * */
		
		/*�÷��̾ �Է��� ���� ���� ������ �Ǿ��ִ��� Ȯ���ϴ� ���ǹ�*/
		if(check) {
			if(checkStr(input)==false) {
				check = false;
			}
		}
		
		/*�÷��̾ �Է��� ���� ���� �ٸ��� Ȯ���ϴ� ���ǹ�*/
		if(check) {
			if(checkSame(input)==false) {
				check = false;
			}
		}
		
		/*�÷��̾ �Է��� ���� 0�� �ִ��� Ȯ���ϴ� ���ǹ�*/
		if(check) { 
			if (checkZero(input)==false) {
				check = false;
			}
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
	
	/*�÷��̾ �Է��� ���� 0�� �ִ��� Ȯ���ϴ� �Լ�*/
	public boolean checkZero(String input) {
		boolean zero=true;
		
		if(input.charAt(0)=='0') {
			zero=false;
		}
		
		if(input.charAt(1)=='0') {
			zero=false;
		}
		
		if(input.charAt(2)=='0') {
			zero=false;
		}
		
		return zero;
	}
	
	
	/*�÷��̾ �Է��� ���� �����ϴ� �Լ�*/
	public int returnAns() {
		return num;
	}
	
}