package workbook.StepD;

import java.util.Scanner;

public class countRect {
	private int width, height;// 가로크기, 세로크기
	private int count1; // "정사각형"의 개수
	private int count2; // "좌우로 길쭉한 직사각형"의 개수
	private int count3; // "위아래로 길쭉한 직사각형"의 개수
	private int count4; // "일반적인 가로형 직사각형"의 개수
	private int count5; // "일반적인 세로형 직사각형"의 개수
	

	public countRect(){input();}
	
	public void printFifth()
	{
		System.out.printf("\"정사각형\"의 개수는 %d 입니다.\n", count1);
		System.out.printf("\"좌우로 길쭉한 직사각형\"의 개수는 %d 입니다.\n", count2);
		System.out.printf("\"위아래로 길쭉한 직사각형\"의 개수는 %d 입니다.\n", count3);
		System.out.printf("\"일반적인 가로형 직사각형\"의 개수는 %d 입니다.\n", count4);
		System.out.printf("\"일반적인 세로형 직사각형\"의 개수는 %d 입니다.\n", count5);
	}
	
	void input()
	{
		Scanner s = new Scanner(System.in);
		while(true)
		{
			System.out.printf("직사각형의 가로 크기와 세로 크기를 입력하시오. :");
			width = s.nextInt();
			height = s.nextInt();
			
			if(width<0 || height<0)
				break;
			
			check_count();
			
		}
	}
	
	void check_count()
	{
		if(width == height)
			count1++;
		else if(width >= height*2)
			count2++;
		else if(height >= width*2)
			count3++;
		else if(width > height)
			count4++;
		else if(width < height)
			count5++;
	}
}
