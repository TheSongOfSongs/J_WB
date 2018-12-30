package workbook.StepF;

import java.util.Scanner;

public class FindSecond {
	private int num[] = new int[10]; // 숫자를 담을 리스트
	private int first; // 첫 번째로 큰 수
	private int second; // 두 번째로 큰 수
	private int first_max_index; // 첫 번째로 큰 수의 인덱스
	private int second_max_index; // 두 번째로 큰 수의 인덱스
	
	public FindSecond()
	{
		Scanner s = new Scanner(System.in);
		for(int i = 0; i<num.length; i++)
		{
			System.out.printf((i+1)+"번 숫자를 입력하시오. ");
			num[i] = s.nextInt();
			
			if(i==0) // 첫 번째 수 입력
			{
				first = num[i];
				first_max_index = 0;
			}
			else if(num[i]>first) // 가장 큰 수 입력
			{
				second = first;
				first = num[i];
				second_max_index = first_max_index;
				first_max_index = i;
			}
			else if(num[i]>second) // 두 번째 큰 수 입력
			{
				second_max_index = i;
				second = num[i];
			}
		}
	}
	
	public void printFind()
	{
		System.out.printf("두 번째로 큰 수는 "+(second_max_index+1)+"번째 수 "+second+"입니다.\n");
	}
}
