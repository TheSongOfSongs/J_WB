package workbook.StepB;

import java.util.Scanner;

public class CheckBMI {
	private int height, weight, bmi;
	 
	public CheckBMI() {input();}
	
	public void checkyours()
	{
		if(get_bmi()>=25)
			System.out.printf("당신은 비만이십니다.\n");
		else
			System.out.printf("당신은 비만이 아니시군요.\n");	
	}
	
	void input()
	{
		Scanner s = new Scanner(System.in);
		System.out.printf("신중(cm단위)을 입력하세요 ");
		this.height = s.nextInt();
		System.out.printf("체중(kg단위)을 입력하세요 ");
		this.weight = s.nextInt();
	}
	
	int get_bmi()
	{
		bmi = weight/(int)(height*height*0.01*0.01);
		return this.bmi;
	}

}