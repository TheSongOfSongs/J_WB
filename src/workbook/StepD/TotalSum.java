package workbook.StepD;

import java.util.Scanner;

public class TotalSum {
	private int number; // 입력받은 수
	private int count=0; // 입력받은 숫자의 개수
	private int totalsum; // 총합계
	private double average; // 평균 값

	public TotalSum(){input();}
	
	public void printThird()
	{
		System.out.printf("입력한 "+count+" 개의 숫자들의 총합계는 "+totalsum+" 이고, 평균 값은 "+average+" 입니다.\n");
	}
	
	void input()
	{
		Scanner s = new Scanner(System.in);
		count = 0;
		totalsum = 0;
		average = 0;
		
		while(true)
		{
			System.out.printf("0부터 100 사이의 숫자를 입력하세요 ");
			this.number = s.nextInt();
			if(number<0 || number>100)
				break;
			
			count++;
			totalsum += number;
		}
		
		average = (double)totalsum/(double)count;
	}
}
