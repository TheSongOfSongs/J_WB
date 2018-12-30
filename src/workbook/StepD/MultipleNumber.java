package workbook.StepD;

import java.util.Scanner;

public class MultipleNumber {
	private int num1, num2; //입력받은 두 수
	
	public MultipleNumber()
	{
		input();
	}
	
	void input()
	{
		Scanner s = new Scanner(System.in);
		System.out.printf("2개의 숫자를 입력하시오. ");
		num1 = s.nextInt();
		num2 = s.nextInt();
	}
	
	void printMulti()
	{
		for(int i=1; i<=100; i++)
		{
			if(i%num1==0 || i%num2==0)
				System.out.printf("%d, ", i);
		}
		System.out.printf("\n");
	}
}
