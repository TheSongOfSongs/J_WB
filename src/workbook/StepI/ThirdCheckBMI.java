package workbook.StepI;

import java.util.Scanner;

public class ThirdCheckBMI {
	private int height;
	private int weight;
	private int bmi;
	
	public ThirdCheckBMI()
	{
		input();
	}
	
	void input()
	{
		Scanner s = new Scanner(System.in);
		
		for(int i=0; i<10; i++)
		{
			System.out.printf("%d번째 사람의 신장(cm단위)과 체중(kg)을 입력하세요 ", (i+1));
			height = s.nextInt();
			weight = s.nextInt();
			
			 AskBiman(height, weight);
		}
	}

	void AskBiman(int height, int weight)
	{
		bmi = (int)(weight/(height*height*0.01*0.01));
		
		if(bmi>=30)
			System.out.printf("고도비만입니다.\n");
		else if(bmi>=25)
			System.out.printf("경도비만입니다.\n");
		else if(bmi>=23)
			System.out.printf("과체중입니다.\n");
		else if(bmi>=18.5)
			System.out.printf("정상체중입니다.\n");
		else
			System.out.printf("저체중입니다.\n");	
	}
}
