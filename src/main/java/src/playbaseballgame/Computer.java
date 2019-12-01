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
	
	/*��Ʈ����ũ�� ���� ������ Ȯ���ϰ�, ��±��� ���ִ� �Լ�*/
	public boolean checkStrikeBall(int input) {
		boolean finish;
		
		int s=checkStrike(input);
		int b=checkBall(input);
		
		finish=print(s,b);
		
		return finish;
	}
	
	/*Strike ������ �� ������ �����ϴ� �Լ�*/
	public int checkStrike(int input) {
		
		int strike=0;			//��Ʈ����ũ�� ���� ī��Ʈ�� ����
		int tmp_ans=this.rand_answer;
		int tmp_input=input;
		
		/*����° �ڸ� �� ��*/
		if ((tmp_ans%10) == (tmp_input%10)) {
			strike++;			//������ ���� ī��Ʈ
		}
		
		/*�ι�° �ڸ� �� �񱳸� ���� �� ����*/
		tmp_ans/=10;
		tmp_input/=10;
		
		/*�ι�° �ڸ� �� ��*/
		if((tmp_ans%10)==(tmp_input%10)) {
			strike++;
		}
		
		/*ù��° �ڸ� �� �񱳸� ���� �� ����*/
		tmp_ans/=10;
		tmp_input/=10;
		
		/*ù��° �ڸ� �� ��*/
		if(tmp_ans==tmp_input) {
			strike++;
		}
		
		return strike;
	}
	
	/*�� ������ �����ϴ� �Լ�*/
	int checkBall(int input) {
		
		int ball=0;			//�� ������ ī��Ʈ�� ����
		int tmpans=this.rand_answer;
		int tmpin=input;
		
		int tmp_ans[] = new int [3];		//������ �� �ڸ����� ������ �迭 ����
		int tmp_input[ ]= new int [3];		//����� �Է°��� �� �ڸ����� ������ �迭 ����
		
		
		/*
		 * ����� ����� �Է°��� �� �ڸ����� �����ϱ� ���� �ݺ���
		 * ����° �ڸ����� �����Ѵ�
		 * */
		for (int i=2;i>=0;i--) {
			tmp_ans[i]=tmpans%10;
			tmp_input[i]=tmpin%10;
			
			tmpans/=10;
			tmpin/=10;
		}
		
		/*���� ������ �ڸ����� �ٸ� ��쿡 ball ī��Ʈ*/
		if ((tmp_ans[0]==tmp_input[1]) || (tmp_ans[0]==tmp_input[2])) {
			ball++;
		}
		
		if ((tmp_ans[1]==tmp_input[0]) || (tmp_ans[1]==tmp_input[2])) {
			ball++;
		}
		
		if ((tmp_ans[2]==tmp_input[0]) || (tmp_ans[2]==tmp_input[1])) {
			ball++;
		}
		
		return ball;
	}
}