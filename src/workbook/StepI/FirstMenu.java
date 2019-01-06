package workbook.StepI;

import java.util.Scanner;

public class FirstMenu {
	private int order;
	private int price[] = {15000, 10000, 7000, 2000};
	private int total = 0;
	
	
	
	void ShowMenu()
	{
		Scanner s = new Scanner(System.in);
		while(true)
		{
			System.out.printf("1. 피자(15,000원) 2. 스파게티(10,000원) 3. 샐러드(7,000원) 4. 음료수(2,000원)\n메뉴를 선택해주세요.(종료 : 5)");
			order = s.nextInt();
			
			if(order == 5)
				break;
			
			total += price[order-1];
			System.out.printf("현재까지의 주문 금액은 %d원입니다.\n\n", total);	
		}
		
		System.out.printf("총 주문 금액은 %d원입니다.\n", total);
	}

}
