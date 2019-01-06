package workbook.StepJ;

import java.util.Scanner;

public class SeventhPower {
	private int num;
	
	public SeventhPower()
	{
		input();
	}
	
	void input()
	{
		Scanner s = new Scanner(System.in);
		
		while(true)
		{
			System.out.printf("숫자를 입력하시오. (0.종료) : ");
			num = s.nextInt();
			
			if(num == 0)
				break;
			else
				System.out.printf("2의 %d승은 : %d\n", num, poweroftwo(num));
		}
	}
	
	
	int poweroftwo(int n)
	{
		if(n == 1)
			return 2;
		else
			return 2*poweroftwo(n-1);
	}

}
