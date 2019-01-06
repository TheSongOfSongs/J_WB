package workbook.StepJ;

import java.util.Scanner;

public class FirstAge {
	private int birthyear; // 입력받은 태어난 년도
	private int age;
	private int group_num;
	private int count_person = 0; // 입력된 인원 수
	private int group_count[] = {0, 0, 0, 0, 0, 0};
	private String group[] = {"유아는 ", "어린이는 ", "청소년은 ","청년은 ", "중년은 ", "노년은 "};
	
	
	public FirstAge()
	{
		input();
	}
	
	public void printGroup()
	{
		for(int i=0; i<group.length; i++)
			System.out.printf(group[i]+group_count[i]+"명 입니다.\n");
	}
	
	void input()
	{
		Scanner s = new Scanner(System.in);
		
		for(int i=0; i<100; i++)
		{
			System.out.printf((i+1)+"번째 사람의 태어난 년도를 입력하시오. ");
			birthyear = s.nextInt();
			
			if(birthyear > 2018)
				break;
			else
				AskGroup(birthyear);
			count_person++;
		}
	}
	
	void AskGroup(int birthyear)
	{
		group_num = AskAge(birthyear);
		if(group_num == 0)
			group_count[0]++;
		else if(group_num == 1)
			group_count[1]++;
		else if(group_num == 2)
			group_count[2]++;
		else if(group_num == 3)
			group_count[3]++;
		else if(group_num == 4)
			group_count[4]++;
		else if(group_num == 5)
			group_count[5]++;
	}
	
	int AskAge(int birthyear)
	{
		age = 2018-birthyear+1;
		System.out.printf("나이는 %d입니다.\n", age);
		
		if(0<age && age<7)
			return 0;
		else if(0<age && age<13)
			return 1;
		else if(0<age && age<20)
			return 2;
		else if(0<age && age<30)
			return 3;
		else if(0<age && age<60)
			return 4;
		else
			return 5;
	}

}
