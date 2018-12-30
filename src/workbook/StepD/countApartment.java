package workbook.StepD;

import java.util.Scanner;

public class countApartment {
	private double m2_area; // 면적 (제곱미터)
	private double pyung_area; // 면적 (평수)
	private int count1 = 0; //소형아파트개수
	private int count2 = 0; // 중소형 아파트 개수
	private int count3 = 0; //중형아파트개수
	private int count4 = 0; //대형아파트개수
	
	public countApartment()
	{
		input();
	}
	
	public void printArea()
	{
		System.out.printf("\"소형 아파트\"의 개수는 %d 입니다.\n", count1);
		System.out.printf("\"중소형 아파트\"의 개수는 %d 입니다.\n", count2);
		System.out.printf("\"중형 아파트\"의 개수는 %d 입니다.\n", count3);
		System.out.printf("\"대형 아파트\"의 개수는 %d 입니다.\n", count4);
	}
	
	void input()
	{
		Scanner s = new Scanner(System.in);
		for(int i=0; i<10; i++)
		{
			System.out.printf("아파트의 분양 면적(제곱미터)을 입력하시오.");
			m2_area = s.nextDouble();
			check_area();
		}
	}
	
	void check_area()
	{
		pyung_area = m2_area / 3.305;
		System.out.printf("--> 이 아파트의 평형은 %.1f 입니다.\n", pyung_area);
		if(pyung_area<15)
			count1++;
		else if(pyung_area<30)
			count2++;
		else if(pyung_area<50)
			count3++;
		else
			count4++;
	}
	
	     
}
