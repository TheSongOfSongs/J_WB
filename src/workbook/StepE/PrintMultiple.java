package workbook.StepE;

import java.util.Scanner;

public class PrintMultiple {
	private int mode;

	public PrintMultiple() {input();}
	
	public void printMulti()
	{
		for(int i=mode; i<=9; i=i+2)
		{
			for(int j=1;j<=9; j++)
			{
				System.out.printf("%d x %d = %d   ", i, j, i*j );
				if(i*j<10) //자릿수 정렬
					System.out.printf(" ");
				if(j%3==0)
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
		if(mode==1)	
			mode += 2;
	}

}
