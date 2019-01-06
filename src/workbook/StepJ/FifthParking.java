package workbook.StepJ;

import java.util.Scanner;

public class FifthParking {
	private int start_h; //주차시작 시
	private int start_m; //주차시작 분
	private int end_h; //주차종료 시
	private int end_m; //주차종료 분
	private int fee;
	private int total = 0;
	private String onemore;
	
	public void printSystem()
	{
		Scanner s = new Scanner(System.in);
		int i=0;
		while(true)
		{
			i++;
			
			System.out.printf("%d번 차량 주차 시작 시각 (시 분) : ", i);
			start_h = s.nextInt();
			start_m = s.nextInt();
			System.out.printf("%d번 차량 주차 종료 시각 (시 분) : ", i);
			end_h = s.nextInt();
			end_m = s.nextInt();
			
			fee = CalcParking(start_h, start_m, end_h, end_m);
			total += fee;
			
			System.out.printf("주차요금 : %d\n", fee);
			
			System.out.printf("더 입력하십니까?(Y/N) ");
			onemore = s.next();
			
			if(onemore.equalsIgnoreCase("N"))
				break;
		}
		System.out.printf("주차차량 %d대의 총 주차 요금은 %d원입니다.\n", i, total);
	}
	
	int CalcParking(int start_h, int start_m, int end_h, int end_m)
	{
		int cal =  (end_h*60+end_m) - (start_h*60+start_m);
		
		if(cal%60 == 0)
			return cal/10*500;
		else
			return (cal/10+1)*500;
	}

}
