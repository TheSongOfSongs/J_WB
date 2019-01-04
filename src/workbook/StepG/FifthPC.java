package workbook.StepG;

import java.util.Scanner;

public class FifthPC {
	private int hour, minute; // 이용한 시간, 분
	private int charge; // 이용료
	private int total_charge = 0; // 이용료 총액
	 
	public FifthPC()
	{
		input();
	}
	
	public void printCharge()
	{
		System.out.printf("지금까지의 이용료 총 금액은 %d원입니다.\n", total_charge);
	}
	
	void input()
	{
		Scanner s = new Scanner(System.in);
		while(true)
		{
			System.out.printf("사용한 시간을 시간과 분으로 입력하세요 : ");
			hour = s.nextInt();
			minute = s.nextInt();
			
			if(hour==0 && minute==0)
				break;
			else
			{
				get_charge();
				if(2<=hour && hour<3)
					charge = (int)(charge*0.95);
				else if(3<=hour && hour<5)
					charge = (int)(charge*0.9);
				else if(hour>5)
					charge = (int)(charge*0.8);
			}
			
			total_charge += charge;
			System.out.printf("고객님의 이용료는 %d원입니다.\n", charge);
		}
	}
	
	void get_charge()
	{
		if(minute == 0)
			charge = hour*2000;
		else if(minute<=30)
			charge = (hour*2+1)*1000;
		else
			charge = (hour+1)*2000;
	}
}
