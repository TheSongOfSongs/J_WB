package workbook.StepH;

import java.util.Scanner;
import java.util.Random;

public class FirstNumber {
	private int answer; //컴퓨터가 만들어 낸 1부터 100사이의 임의의 숫자
	private int number_try = 0; // 사용자가 제시한 숫자
	private int count; // 사용자가 맞추려고 시도한 횟수
	private boolean bool = true;
	
	public FirstNumber()
	{
		Random generator = new Random();
		answer = generator.nextInt(100) + 1;
	}
	
	void user_try()
	{
		Scanner s = new Scanner(System.in);
		
		while(bool)
		{
			count++;
			System.out.printf("1부터 100까지의 숫자 하나를 맞춰보세요\n");
			number_try = s.nextInt();
			
			if(number_try == answer)
			{
				System.out.printf("%d번만에 숫자를 맞추셨습니다.\n", count);
				bool = false;
			}
			else if(number_try>answer)
				System.out.printf("좀 더 작은 수입니다.\n");
			else if(number_try<answer)
				System.out.printf("좀 더 큰 수입니다.\n");
		}
		
	}
	 
	
}
