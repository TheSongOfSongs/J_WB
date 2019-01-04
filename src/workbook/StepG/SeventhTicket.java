package workbook.StepG;

import java.util.Scanner;

public class SeventhTicket {
	private int team_count; // 방문한 팀수
	private int charge[] = {5000, 10000, 15000, 3000};
	private int count[] = new int[4]; // 입력받은 연령별 인원 수
	private int v_count[] = {0, 0, 0, 0}; // 연령별 방문자 합계
	private int total_count = 0; // 총 방문자 수
	private int sum; // 팀별 계산한 요금
	private int total_sum = 0; // 총 요금
	private int membership; // 할인카드 종류(카드없음:0, 일반등급 카드 : 1, VIP 등급 카드 : 2)
	private String whatNumber[] = {"초등학생", "청소년", "일반인", "경로대상"};
	
	
	public SeventhTicket()
	{input();}
	
	public void printTotal()
	{
		System.out.printf("\n오늘 총 방문자 수는 %d명입니다.\n", total_count);
		for (int i=0; i<whatNumber.length; i++)
			System.out.printf(whatNumber[i] + " 수는 "+ v_count[i] + "명입니다.\n");
		System.out.printf("\n총 입장료는 %d원입니다.\n", total_sum);
	}
	
	void input()
	{
		Scanner s = new Scanner(System.in);
		System.out.printf("오늘 방문한 팀 수를 입력하세요. ");
		team_count = s.nextInt();
		
		for(int i=0; i<team_count; i++)
		{
			System.out.printf("%d번팀 인원수(초등학생, 청소년, 일반, 경로대상)를 입력하세요. ", (i+1));
			sum = 0;
			for(int j=0; j<count.length; j++)
			{
				count[j] = s.nextInt();
				v_count[j] += count[j];
				total_count += count[j];
				sum += charge[j]*count[j];
			}
				
			
			System.out.printf("%d번팀 할인카드 종류(카드없음:0, 일반등급:1, VIP등급:2)를 입력하세요. ", (i+1));
			membership = s.nextInt();
			
			sum = get_discount(membership);
			
			total_sum += sum;
			System.out.printf("%d번팀 입장료는 %d원입니다.\n", (i+1), sum);
		}
	}
	
	int get_discount(int membership)
	{
		switch(membership) {
		case 0:
			return sum;
		case 1:
			return (int)(sum*0.9);
		case 2:
			return (int)(sum*0.8);
		default:
			return sum;
		}
	}
	

	

}
