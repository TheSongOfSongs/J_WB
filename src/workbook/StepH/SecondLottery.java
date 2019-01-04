package workbook.StepH;

import java.util.Scanner;
import java.util.Random;

public class SecondLottery {
	private int lotto[] = new int[6]; // 컴퓨터가 만들어 낸 로또 번호 리스트
	private String onemore;  // 반복여부를 입력하는 문자 (Y/N)
	
	public SecondLottery()
	{
		generating();
	}
	
	public void printOnemore()
	{
		
		Scanner s = new Scanner(System.in);
		
		while(true)
		{
			generating();
			
			System.out.printf("생성된 로또 번호는 ");
			
			for(int i=0; i<lotto.length; i++)
			{
				System.out.printf(" "+lotto[i]+" ");
			}
			
			System.out.printf(" 입니다.\n더 만드시겠습니까? (Y/N)");
			onemore = s.next();
			if(onemore.equalsIgnoreCase("N"))
				break;
		
		}
	}

	
	void generating()
	{
	 	Random generator = new Random();
		for(int count=0; count<lotto.length; count++)
		{
			lotto[count] = generator.nextInt(45) + 1;
			
			for(int i=0; i<count; i++)
				if(lotto[count] == lotto[i])
				{
					count--;
					break;	
				}
		}
	}
	
	
}
