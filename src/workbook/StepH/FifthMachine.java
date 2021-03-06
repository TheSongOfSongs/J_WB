package workbook.StepH;

import java.util.Scanner;
import java.util.Random;

public class FifthMachine {
	private int coins; // 사용자의 코인 수. (최초에 입력받음)
	private int number[] = new int[3]; // 랜덤하게 만들어진 슬롯 머신의 숫자 3개의 리스트
	private int dummy; // 게임스타트를 위한 의미 없는 입력 숫자
	
	public FifthMachine()
	{
		input();
	}
	
	public void playing()
	{
		Random generator = new Random();
		Scanner s = new Scanner(System.in);
		
		int many = 1;
		while(coins > 0)
		{
			System.out.printf("게임 %d회 Start!!! (아무 숫자나 입력하세요) ", many++);
			dummy = s.nextInt();
			
			System.out.printf("게임 결과 : ");
			for(int i=0; i<number.length; i++)
			{
				number[i] = generator.nextInt(9) + 1;
				System.out.printf("%d ",number[i]);
			}
			
			System.out.printf("남아있는 코인은 %d개입니다.\n", leftCoins()); 
		}
		
		System.out.printf("\n게임 종료!!\n");
	} 
	
	void input()
	{
		Scanner s = new Scanner(System.in);
		
		System.out.printf("사용하실 코인의 개수를 입력하세요. ");
		coins = s.nextInt();
	}
	
	
	int leftCoins()
	{
		int a = 0;
		
		if(number[0] == number[1])
			a++;
		if(number[0] == number[2])
			a++;
		if(number[1] == number[2])
			a++;
		
		if(a>=2)
		{
			System.out.printf("숫자 3개 일치, 코인 4개 증정\n");
			coins += 4;
		}
		else if(a==1)
		{
			System.out.printf("숫자 2개 일치, 코인 2개 증정\n");
			coins += 2;
		}
		else
			System.out.printf("꽝입니다... 아쉽군요...\n");

		return --coins;
	}
}
