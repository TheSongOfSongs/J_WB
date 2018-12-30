package workbook.StepB;

import java.util.Scanner;

public class CalculateArea {
	private int width; // 가로크기
	private int height; // 세로크기
	private int area; // 직사각형의 넓이
	
	public CalculateArea()
	{
		input();
	}
	
	public void printArea()
	{
		System.out.printf("직사각형의 넓이는 " + getArea() + " 이고\n");
		if(width == height)
			System.out.printf("정사각형입니다.\n");
		else
			System.out.printf("정사각형이 아닙니다.\n");
	}
	
	void input()
	{
		Scanner s = new Scanner(System.in);
		System.out.printf("직사각형의 가로 크기를 입력하십시오 ");
		this.width = s.nextInt();
		System.out.printf("직사각형의 세로 크기를 입력하십시오 ");
		this.height = s.nextInt();
	}
	
	int getArea()
	{
		area = width*height;
		return this.area;
	}
	

}
