package workbook.StepI;

import java.util.Scanner;

public class FourthMenu {
	private int order;
	private int price[] = {15000, 10000, 7000, 2000};
	private int total = 0;
	private int return_price;
	
	public void pirntPrice()
	{
		while(true)
		{
			if(SelectMenu() != -1)
			{
				total += return_price;
				System.out.printf("현재까지의 주문금액은 %d원입니다.\n\n", total);
			}
			else
				break;
		}
		
		System.out.printf("\n총 주문 금액은 %d원입니다.\n", total);
	}
	
	int SelectMenu()
	{
		Scanner s = new Scanner(System.in);
		
		System.out.printf("1. 피자(15,000원) 2. 스파게티(10,000원) 3. 샐러드(7,000원) 4. 음료수(2,000원)\n메뉴를 선택해주세요.(종료 : 5) ");
		order = s.nextInt();
			
		return_price = (order == 5)? -1 : price[order-1];
		
		return return_price;
	}

}
