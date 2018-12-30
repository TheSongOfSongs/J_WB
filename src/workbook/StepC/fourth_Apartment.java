package workbook.StepC;

import java.util.Scanner;

public class fourth_Apartment {
	private double m2_area;
	private double pyung_area;
	
	public fourth_Apartment() {input();}
	
	public void printApartment() {
		get_pyung_area();
		
		if(pyung_area<15)
			System.out.printf("소형 아파트 입니다.\n");
		else if(pyung_area<30)
			System.out.printf("중소형 아파트 입니다.\n");
		else if(pyung_area<50)
			System.out.printf("중형 아파트 입니다.\n");
		else
			System.out.printf("대형 아파트 입니다.\n");
	}	
	
	void input() {
		Scanner s = new Scanner(System.in);
		System.out.printf("아파트의 분양 면적(제곱미터)을 입력하시오. ");
		this.m2_area = s.nextDouble();
	}
	
	void get_pyung_area()
	{
		pyung_area = m2_area/3.305;
		System.out.printf("아파트의 평형은 %.1f 입니다.\n", pyung_area);
	}
	
}