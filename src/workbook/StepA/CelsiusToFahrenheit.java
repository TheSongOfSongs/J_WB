package workbook.StepA;

import java.util.Scanner;

public class CelsiusToFahrenheit {
	private double c_degree;
	private double f_degree;
	
	public CelsiusToFahrenheit()
	{
		input();
	}
	
	public void printFahrenheit()
	{
		System.out.printf("화씨온도는 %.1f 도 입니다\n", get_f_degree());
	}
	
	void input()
	{
		Scanner s = new Scanner(System.in);
		System.out.printf("섭씨 온도를 입력하십시오.");
		this.c_degree = s.nextDouble();
	}
	
	double get_f_degree()
	{
		f_degree = c_degree*1.8+32;
		return this.f_degree;
	}

}
