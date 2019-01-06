package workbook.StepI;

import java.util.Random;

public class SixthRandom {
	private int number;
	private int random;
	private int big = 0;
	private int middle = 0;
	private int small = 0;
	
	public void printResult()
	{
		System.out.printf("10개의 숫자를 생성합니다.\n");
		
		for(int i=0; i<10; i++)
		{
			number = GetRandom();
			
			if(number == 0)
				big++;
			else if(number == 1)
				middle++;
			else if(number == 2)
				small++;
		}
		System.out.println();
		System.out.printf("1. 대 (70점 이상) : " + big + "회 생성\n");
		System.out.printf("2. 중 (40점 이상) : " + middle + "회 생성\n");
		System.out.printf("3. 소 (40점 미만) : " + small + "회 생성\n");
	}
	
	byte GetRandom()
	{
		Random generator = new Random();
		random = generator.nextInt(100) + 1;
		System.out.printf("생성된 임의의 숫자는 %d입니다.\n", random);
		
		if(random>=70)
			return 0;
		else if(random>=40)
			return 1;
		else
			return 2;
	}


}
