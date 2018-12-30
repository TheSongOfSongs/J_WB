package workbook.StepD;

import java.util.Scanner;

public class FindMaxMin {
	private int number; // 입력받은 수
	private int max_num, min_num; // 가장 큰 숫자, 가장 작은 숫자

	public FindMaxMin(){input();}
	
	public void printMaxmin()
	{
		System.out.printf("입력된 숫자들 중 가장 큰 수는 %d이고, 가장 작은 수는 %d입니다.\n", max_num, min_num);
	}
	
	void input()
	{
		max_num = 0;
		min_num = 100;
		Scanner s = new Scanner(System.in);
	
		while(true)
		{
			System.out.printf("0부터 100 사이의 숫자를 입력하세요 ");
			this.number = s.nextInt();
			if(number<0 || number>100)
				break;
			if(max_num<number)
				max_num = number;
			if(min_num>number)
				min_num = number;
			
		}
	}	
}
