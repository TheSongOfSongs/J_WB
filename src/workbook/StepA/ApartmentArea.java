package workbook.StepA;

import java.util.Scanner;

public class ApartmentArea {
	private double m2_area;
	private double pyung_area;
	 
	public ApartmentArea() {input();}
	
	public void printArea()
	{
		System.out.printf("아파트의 평형은 %.1f 입니다.\n", get_area() );
	}
	
	void input()
	{
		Scanner s = new Scanner(System.in);
		System.out.printf("아파트의 분양 면적을 입력하시오.");
		m2_area = s.nextDouble();
	}
	
	double get_area()
	{
		pyung_area = m2_area / 3.305;
		return this.pyung_area;
	}

}
