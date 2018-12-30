package workbook.StepE;

import java.util.Scanner;

public class OrderedMulti {
	private int mode; // 출력모드(1: 홀수단, 2: 짝수단)
	private int column; // 열 개수

	public OrderedMulti() {input();}
	
	public void printOrdered()
	{
		for(int i=mode; i<=9; i=i+2)
		{
			for(int j=1;j<=9; j++)
			{
				System.out.printf("%d x %d = %d   ", i, j, i*j );
				if(i*j<10) //자릿수 정렬
					System.out.printf(" ");
				if(j%column==0)
					System.out.println();
			}
			System.out.println();
		}
	}
	
	void input()
	{
		Scanner s = new Scanner(System.in);
		System.out.printf("구구단의 출력모드(1:홀수단, 2:짝수단)를 입력하시오.");
		mode = s.nextInt();
		System.out.printf("한 줄에 출력할 갯수를 입력하시오. ");
		column = s.nextInt();
		if(mode==1)
			mode += 2;
	}

}
