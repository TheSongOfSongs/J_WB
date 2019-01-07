package workbook.StepL;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Date;
import java.text.SimpleDateFormat;

public class L02 {
	private int max;
	private int func;
	private int menu;
	private int fix;
	private boolean stop = true;
	
	public L02()
	{
		Scanner s = new Scanner(System.in);
		
		System.out.printf("주차할 수 있는 차의 개수를 입력하세요 : ");
		max = s.nextInt();
		System.out.printf("총 %d대를 주차할 수 있습니다.\n\n", max);
		
		ArrayList<Parking> u = new ArrayList<Parking>();
		
		
		while(stop)
		{
			System.out.printf("--------------------------------------------------------\n");
			System.out.printf("1)입차 2)출차 3)리스트 4)입차 총 개수 5)주차 잔여개수 6)종료 ==> ");
			func = s.nextInt();
			System.out.printf("--------------------------------------------------------\n");
			
			SimpleDateFormat f, ff;
			Date date = new Date();
		
			f = new SimpleDateFormat("YYYY-MM-dd");
			ff = new SimpleDateFormat("HH:mm");
			String today = f.format(date);
			String time = ff.format(date);
			
			switch(func)
			{
				case 1:
					u.add(new Parking(today, time, u.size()+1));
					u.get(u.size()-1).input(u.size());
					System.out.printf(" 입차되었습니다.\n\n");
					break;
					
				case 2:
					print(u);
					System.out.printf("==> 출차 번호를 입력하세요 : ");
					fix = s.nextInt();
					u.get(fix).fee(time);
					
					u.remove(--fix);
					today = today.replaceAll("", "");
					System.out.printf("==> 현재 시간은 ["+today+" "+time+"]이므로 주차금액은 "+u.get(fix).fee(time)+"원 입니다.\n");
					System.out.printf("==> 정산되었습니다.\n\n");
					break;
					
				case 3:
					print(u);
					System.out.printf("%d대 주차가능.\n\n", max-u.size());
					break;
					
				case 4:
					print(u);
					System.out.printf("총 %d대가 주차되어 있습니다.\n\n", u.size());
					break;
					
				case 5:
					System.out.printf("주차 가능한 자리는 %d대입니다.\n\n", max-u.size());
					break;
					
				case 6:
					System.out.printf("종료되었습니다.\n\n");
					stop = false;
					break;
			}
		}
	}
	
	void print(ArrayList<Parking> u)
	{
		for(int i=0; i<u.size(); i++)
		{
			u.get(i).output(i);
		}
	}

}

class Parking{
	int number; // 차 번호
	String name; // 차 종류
	String date; // 들어온 날짜
	String time; // 들어온 시간
	int area;
	
	Parking(String date, String time, int area)
	{
		Scanner s = new Scanner(System.in);
		
		System.out.printf("입차할 차의 번호와 차종을 입력하세요. ");
		number = s.nextInt();
		name = s.next();

		this.date = date;
		this.time = time;
		this.area = area;
	}

	void input(int index)
	{
		String dates = date.replace("-", "년 ");
		dates = dates.replace("-", "월 ") + "일";
		String times = time.replace(":", "시") +"분";
		
		System.out.printf("["+area+"번]\t"+number+"\t"+name+"\t"+dates+"\t"+times);
	}
	
	void output(int index)
	{
		System.out.printf("["+area+"번]\t"+number+"\t"+name+"\t"+date+"\t"+time+"\n");
	}
	
	int fee(String time)
	{
		time = time.replace(":", "");
		this.time = time.replace(":", "");
		int pay = Integer.parseInt(time) - Integer.parseInt(this.time);
		
		return  ((pay%10 == 0)? pay*500 : (pay+1)*500);
	}
}
	
