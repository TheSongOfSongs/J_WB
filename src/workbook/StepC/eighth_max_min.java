package workbook.StepC;

import java.util.Scanner;

public class eighth_max_min {
	private int num1, num2, num3;
	private int max_num, min_num;
	 
	public eighth_max_min() {input();}
	
	public void printNums()
	{
		System.out.printf("가장 큰 수는 "+get_max()+" 이고, 가장 작은 수는 "+get_min()+ "입니다.\n");
	}
	
	void input()
	{
		Scanner s = new Scanner(System.in);
		System.out.printf("첫번째 숫자를 입력하세요.");
		this.num1 = s.nextInt();
		System.out.printf("두번째 숫자를 입력하세요.");
		this.num2 = s.nextInt();
		System.out.printf("세번째 숫자를 입력하세요.");
		this.num3 = s.nextInt();
	}
	
	int get_max()
	{
		if((num1>=num2)&&(num1>=num3))
			max_num=num1;
		else if((num2>=num1)&&(num2>=num3))
			max_num=num2;
		else
			max_num=num3;
		return this.max_num;
	}
	
	int get_min()
	{
		if((num1<=num2)&&(num1<=num3))
			min_num=num1;
		else if((num2<=num1)&&(num2<=num3))
			min_num=num2;
		else
			min_num=num3;
		return this.min_num;
	}

}