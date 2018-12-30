package workbook.StepF;

import java.util.Scanner;

public class InputNumber {
	private int number[] = new int[10]; // 사용자가 입력한 숫자 10개
	private int newnum; // 입력받은 숫자
	private int count = 0; // 현재까지 입력된 숫자의 개수(0~10)
	private boolean dup = true; // 중복검사 통과 여부 (true : 중복, false : 중복없음)
	
	public InputNumber()
	{
		Scanner s = new Scanner(System.in);
		System.out.println("1부터 100사이의 숫자를 입력하시오.");
		
		while(dup)
		{
			System.out.printf((count+1) + "번째 숫자를 입력하시오. ");
			newnum = s.nextInt();
			number[count] = newnum;
			
			for(int i=0; i<count; i++)
			{
				if(newnum<1 || newnum>100 || number[i] == newnum)
				{
					System.out.println("잘못 입력하였습니다. 다시 입력하세요.");
					count--;
					break;
				}
			}
			
			if(++count == 10)
				dup = false;
		}
	}
	
	public void printNum()
	{
		for(int i=0; i<number.length; i++)
			System.out.println((i+1) + "번째 숫자는 "+number[i] + "입니다.");
	}
}
