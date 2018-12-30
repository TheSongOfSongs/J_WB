package workbook.StepA;

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
		System.out.printf("직사각형의 넓이는 " + getArea() + "입니다.\n");
	}
	
	void input()
	{
		Scanner a = new Scanner(System.in);
		Scanner b = new Scanner(System.in);
		System.out.printf("직사각형의 가로 크기를 입력하십시오");
		this.width = a.nextInt();
		System.out.printf("직사각형의 세로 크기를 입력하십시오");
		this.height = b.nextInt();
	}
	
	int getArea()
	{
		area = width*height;
		return this.area;
	}
	

}
