package workbook.StepC;

import java.util.Scanner;

public class ninth_tax {
	private int income;
	private int tax;
	
	public ninth_tax()
	{
		input();
	}
	
	public void printTax()
	{
		System.out.printf("연봉 금액에 대한 소득세는 "+get_tax()+"원 입니다.\n");
	}
	
	void input()
	{
		Scanner s = new Scanner(System.in);
		System.out.printf("연봉(원 단위)을 숫자로 입력하세요 ");
		this.income = s.nextInt();
	}
	
	int get_tax()
	{
		if(income<10000000)
			tax = (int)(income*0.095);
		else if(income<40000000)
			tax = (int)(income*0.19);
		else if(income<80000000)
			tax = (int)(income*0.28);
		else
			tax = (int)(income*0.37);
		
		return this.tax;
	}

}
