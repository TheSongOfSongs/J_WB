package workbook.StepD;

import java.util.Scanner;

public class whereXY {
	private int a, b; // 1차 메소드의 계수 a, b
	private int x_begin, x_end; // x좌표의 시작 값과 끝 값
	private int x, y; // x좌표, y좌표 

	public whereXY()
	{
		input();
	}
	
	public void printXY()
	{
		for(int x=x_begin; x<=x_end; x++)
		{
			System.out.printf("좌표 (%d, %d)\n", x, get_y(x));
		}
	}
	
	int get_y(int x)
	{
		y=a*x+b;
		return y;
	}
	
	void input()
	{
		Scanner s = new Scanner(System.in);
		System.out.printf("1차 함수 y=ax+b의 계수 a와 b를 입력하시오. ");
		a = s.nextInt();
		b = s.nextInt();
		System.out.printf("x좌표의 시작 값과 끝 값을 입력하시오. ");
		x_begin = s.nextInt();
		x_end = s.nextInt();
	}
}
