/*
 * @(#)Computer.java		 2019/12/01
 * 
 * 
 * Copyright (c) YerinCho
 * 
 * 
 */

package playbaseballgame;

/**
 * 
 * @version 0.1 2019�� 12�� 1��
 * @author YerinCho
 */

class Computer {
	
	private int rand_answer=0;           //������ �� �ڸ��� ��
	
	/*������ �� �ڸ��� �� ����� �Լ�*/
	public void makeAnswer() {
		
		int first=0;			//���� ù��°, �ι�°, ����° �ڸ� �� 
		int second=0;
		int third=0;     
		first=(int)(Math.random()*9)+1;		//ù��° �ڸ� �� ����
		while (first!=second) {
			
			/*�ι�° �ڸ��� ���� ù��°�� ��ġ�� �ʱ� ���� �ݺ���*/
			second=(int)(Math.random()*9)+1;
		}
		while((third!=second) && (third!=first)) {
			
			/*����° �ڸ��� ���� ù��°, �ι�°�� ��ġ�� �ʱ� ���� �ݺ���*/
			third=(int)(Math.random()*9)+1;
		}
		
		this.rand_answer=first*100 + second * 10 + third;
	}
	
}