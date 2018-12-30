package workbook.StepB;

import java.util.Scanner;

public class CelsiusToFahrenheit {
	private double input_degree;
	private double output_degree;
	private String Kind;
	
	public CelsiusToFahrenheit()
	{
		input();
	}
	
	public void printFahrenheit()
	{
		System.out.printf("변환된 온도는 %.1f 입니다\n", get_degree());
	}
	
	void input()
	{
		Scanner s = new Scanner(System.in);
		System.out.printf("온도를 입력하세요 ");
		this.input_degree = s.nextDouble();
		System.out.printf("입력하신 온도가 섭씨온도이면 C를, 화씨온도이면 F를 입력하세요 ");
		this.Kind = s.next();
	}
	
	double get_degree()
	{
		if(Kind.equals("C"))
			output_degree = input_degree*1.8+32;
		else
			output_degree = (input_degree-32)/1.8;	
		
		return this.output_degree;
	}

}
