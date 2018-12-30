package workbook.StepC;

import java.util.Scanner;

public class third_rectangle {
	private int width, height;
	
	public third_rectangle() {input();}
	
	public void printRectangle() {
		if(width == height)
			System.out.printf("정사각형입니다.\n");
		else if(width > 2*height)
			System.out.printf("좌우로 길쭉한 직사각형입니다.\n");
		else if(height > 2*width)
			System.out.printf("위아래로 길쭉한 직사각형입니다.\n");
		else if(width > height)
			System.out.printf("일반적인 가로형 직사각형입니다.\n");
		else
			System.out.printf("일반적인 세로형 직사각형입니다.\n");
	}	
	
	void input() {
		Scanner s = new Scanner(System.in);
		System.out.printf("직사각형의 가로 크기를 입력하세요 ");
		this.width = s.nextInt();
		System.out.printf("직사각형의 세로 크기를 입력하세요 ");
		this.height = s.nextInt();
	}		
}