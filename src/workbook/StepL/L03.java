package workbook.StepL;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Date;
import java.text.SimpleDateFormat;

public class L03 {
	private int func;
	private int which;
	private boolean stop = true;
	
	public L03()
	{
		Scanner s = new Scanner(System.in);
		
		ArrayList<Order> u = new ArrayList<Order>();
		
		
		while(stop)
		{
			System.out.printf("--------------------------------------------------------\n");
			System.out.printf("1)주문 2)결제 3)리스트 4)종료 ==> ");
			func = s.nextInt();
			System.out.printf("--------------------------------------------------------\n");
			
			switch(func)
			{
				case 1:
					u.add(new Order(u.size()+1));
					break;
					
				case 2:
					print(u, func);
					System.out.printf("==> 결제하실 번호를 입력하세요 : ");
					which = s.nextInt();
					u.remove(--which);
					System.out.printf("==> 결제완료되었습니다.\n\n");
					break;
					
				case 3:
					print(u, func);
					break;
					
				case 4:
					System.out.printf("==> 종료되었습니다.\n\n");
					stop = false;
					break;
			}
		}
	}
	
	void print(ArrayList<Order> u, int func)
	{
		if(func == 2)
			System.out.printf("번호\t손님수\t스테이크\t스파게티\t파스타\t멤버쉽\t결제금액\t입장시간\n");
		else if(func == 3)
				System.out.printf("번호\t손님수\t스테이크\t스파게티\t파스타\t멤버쉽\t입장시간\n");
		for(int i=0; i<u.size(); i++)
		{
			u.get(i).output(func);
		}
	}

}

class Order{
	int num;
	int menu[] = new int[3];
	int price [] = {25000, 15000, 17000};
	int total = 0;
	String time;
	String membership;
	int table;
	
	Order(int table)
	{
		this.table = table;
		input();
	}

	void input()
	{
		Scanner s = new Scanner(System.in);
		
		Date date = new Date();
	
		SimpleDateFormat f = new SimpleDateFormat("YYYY년 MM월 dd일 HH:mm");
		time = f.format(date);
		
		System.out.printf("손님 수를 입력하세요 : ");
		num = s.nextInt();
		
		System.out.printf("스테이크, 스파게티, 파스타의 개수를 입력하세요 : ");
		for(int i=0; i<menu.length; i++)
		{
			menu[i] = s.nextInt();
		}
			
		
		System.out.printf("멤버쉽 카드가 있습니까?(Y:있음) ");
		membership = s.next();
		
		System.out.printf("들어오신 시간은 %s입니다.\n", time);
		System.out.printf("총 금액은 %d원입니다.\n\n", get_total());	
	}
	
	void output(int func)
	{
		if(func == 3)
			System.out.printf("["+table+"번]\t"+num+"\t"+menu[0]+"\t"+menu[1]+"\t"+menu[2]+"\t"+membership+"\t"+time+"\n");
		else if(func == 2)
			System.out.printf("["+table+"번]\t"+num+"\t"+menu[0]+"\t"+menu[1]+"\t"+menu[2]+"\t"+membership+"\t"+total+"\t"+time+"\n");
	}
	
	int get_total()
	{
		for(int i=0; i<menu.length; i++)
			total += menu[i]*price[i];
		
		if(membership.equalsIgnoreCase("y"))
		{
			total *= 0.9;
		}
		
		total *= (total<100000)? 1.07 : 1.1;
		
		total *= 1.1;
		
		return total;		
	}
}
	
