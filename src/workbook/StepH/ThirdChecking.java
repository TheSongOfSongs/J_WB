package workbook.StepH;

import java.util.Scanner;
import java.util.Random;

public class ThirdChecking {
	private int lotto_com[] = new int[6]; // 컴퓨터가 만들어 낸 로또 번호 리스트
	private int lotto_user[] = new int[6]; // 사용자가 입력한 로또 번호 리스트
	private int match_count; // 일치하는 로또 번호의 갯수 (0~6)
	
	public ThirdChecking()
	{
		generator();
		input();
	}
	
	public void printFind()
	{
		System.out.printf("이번 주의 로또 당첨 번호는 ");
		for(int i=0; i<lotto_com.length; i++)
		{
			System.out.print(lotto_com[i]+" ");
			
			for(int count=0; count<lotto_user.length; count++)
			{
				if(lotto_com[i] == lotto_user[count])
					match_count++;
			}
			
		}
		System.out.printf("입니다.\n\n");
		System.out.printf("일치하는 로또 번호는 %d개입니다.\n", match_count);
		
	}
	
	void input()
	{
		Scanner s = new Scanner(System.in);
		
		for(int count=0; count<lotto_user.length; count++)
		{
			System.out.printf("원하는 %d번째 로또를 입력하세요 ", (1+count));
			lotto_user[count] = s.nextInt();
			
			for(int i=0; i<count; i++)
				if(lotto_user[count] == lotto_user[i])
				{
					count--;
					System.out.printf("==> 잘못 입력하셨습니다.\n");
					break;	
				}
		}
	}
	
	void generator()
	{
		Random generator = new Random();
		
		for(int i=0; i<lotto_com.length; i++)
			lotto_com[i] = generator.nextInt(45) + 1;

	}
	 

}
