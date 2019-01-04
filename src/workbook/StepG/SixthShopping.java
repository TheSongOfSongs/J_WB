package workbook.StepG;

import java.util.Scanner;

public class SixthShopping {
	private int order[] = {0,0,0}; // 입력받는 구매 제품 개수 리스트 [가죽장갑, 털장갑, 비닐장갑] 
	private int sale; // 계산한 판매금액
	private int total_sale = 0; // 총 매출액 총액
	private int total_order[] = {0,0,0}; // 총 판매 개수 리스트 [가죽장갑, 털장갑, 비닐장갑]
	private int price[] = {10000, 6000, 3000};  // 제품별 가격
	
	public SixthShopping()
	{
		System.out.printf("세 종류의 제품이 있습니다.\n(1.가죽장갑 1만원, 2.털장갑 6천원, 3.비닐장갑 3천원)\n\n");
		input();
	}
	
	public void printSale()
	{
		System.out.printf("지금까지의 총 매출액은 %d원입니다.\n", total_sale);
	}
	
	void input()
	{
		Scanner s = new Scanner(System.in);
		while(true)
		{
			sale = 0;
			
			for(int i=0; i<order.length; i++)
			{
				System.out.printf("%d번 제품은 몇 개를 구입하실래요? ", (i+1));
				
				order[i] = s.nextInt();
				total_order[i] += order[i];
				sale += order[i]*price[i];
				total_order[i] += order[i];
			}
			
			if(order[0] == 0 && order[1] == 0 && order[2] == 0)
				break;
			else
			{
				System.out.printf("판매금액은 %d원입니다.\n\n", sale);
				total_sale += sale;
			}
				
		}
	}
	


}
