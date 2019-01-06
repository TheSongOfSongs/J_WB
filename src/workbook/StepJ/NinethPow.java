package workbook.StepJ;

import java.util.Scanner;

public class NinethPow {
	private int num1;
	private int num2;
	
	public NinethPow()
	{
		input();
	}
	
	public void printPow()
	{
		Scanner s = new Scanner(System.in);
		
		System.out.printf("%d의 %d승은 %d 입니다.\n ", num1, num2, power(num1, num2));
	}
	
	void input()
	{
		Scanner s = new Scanner(System.in);
		
		System.out.printf("숫자 2개를 입력하시오. ");
		
		num1 = s.nextInt();
		num2 = s.nextInt();
	}

	int power(int num1, int num2)
	{
		if(num2 == 0)
			return 1;
		else if(num2 == 1)
			return num1;
		else if(num2>1 && num2%2==0)
			return power(num1, num2/2)*power(num1, num2/2);
		else
			return power(num1, num2/2)*power(num1, num2/2)*num1;
	}
}
