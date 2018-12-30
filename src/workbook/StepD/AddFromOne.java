package workbook.StepD;

import java.util.Scanner;

public class AddFromOne {
	private int number;	// 입력받은 수
	private int totalsum; // 1부터 더한 계산 결과 값 
	private int i; // 반복문 사용을 위한 변수

	public AddFromOne(){input();}
	
	public void printFirst()
	{
		if(number<1)
			System.out.printf("잘못 입력하였습니다.\n");
		else
			System.out.printf("1부터 입력한 숫자까지의 모든 정수를 더한 값은 "+getTotal()+" 입니다.\n");
	}	
	
	void input()
	{
		Scanner s = new Scanner(System.in);
		System.out.printf("숫자를 입력하세요 ");
		this.number = s.nextInt();
	}	
	
	int getTotal()
	{
		totalsum = 0;
		for (int i=1; i<=number; i++)
			totalsum += i;
		return this.totalsum;
	}	
}