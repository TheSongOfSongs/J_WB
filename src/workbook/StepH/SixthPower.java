package workbook.StepH;

import java.util.Scanner;

public class SixthPower {
	private int number[] = new int[5]; // 입력받은 5개의 숫자 리스트
	private int pow_value[][] = new int[5][5]; //임의의 두 수 a, b로 만들 수 있는 ab의 값 들, 5 * 5 리스트
	private int max, min; // 최댓값과 최솟값
	private int max_a, max_b; // 최댓값을 만들어 내는 경우의 a와 b의 값
	private int min_a, min_b; // 최솟값을 만들어 내는 경우의 a와 b의 값

	public SixthPower()
	{
		input();
	}
	
	public void printResult()
	{
		System.out.println();
		System.out.printf("입력하신 5개의 수로 제곱수를 만들면...\n");
		fill_blank();
		finding();
		System.out.printf("가장 큰 수는 %d의 %d승인 %d 입니다.\n", max_a, max_b, max);
		System.out.printf("가장 작은 수는 %d의 %d승인 %d 입니다.\n", min_a, min_b, min);
		
	}
	
	void input()
	{
		Scanner s = new Scanner(System.in);
		
		System.out.printf("2에서 9사이의 숫자 5개를 입력하세요. ");
		for(int i=0; i<number.length; i++)
			number[i] = s.nextInt();
	}
	
	void fill_blank()
	{
		for(int i=0; i<pow_value.length; i++)
			for(int j=0; j<pow_value[i].length; j++)
				pow_value[i][j] = (int)(Math.pow(number[i],number[j])); // i^j		
	}
	
	void finding()
	{
		max = pow_value[0][1];
		min = pow_value[0][1];
		
		for(int i=0; i<pow_value.length; i++)
			for(int j=0; j<pow_value.length; j++)
			{
				if( i != j)
				{
					if(pow_value[i][j]>=max)
					{
						max = pow_value[i][j];
						max_a = number[i];
						max_b = number[j];
					}
					
					if(pow_value[i][j]<=min)
					{
						min = pow_value[i][j];
						min_a = number[i];
						min_b = number[j];
					}
				}
			}
	}
	
	
}
