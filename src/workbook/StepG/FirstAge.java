package workbook.StepG;

import java.util.Scanner;

public class FirstAge {
	private int birth_year; // 입력받은 태어난 년도
	private int age[] = new int[100]; // 각 사람들의 나이 (최대 100명)
	private int count_person = 0; // 입력된 인원 수
	private int group_count[] = new int[6];
	private String group[] = {"유아는 ", "어린이는 ", "청소년은 ","청년은 ", "중년은 ", "노년은 "};
	
	public FirstAge()
	{
		input();
	}
	
	public void printFirst()
	{
		for(int i=0; i<count_person; i++)
			System.out.printf((i+1)+"번째 사람의 나이는 "+age[i]+" 입니다.\n");
		get_count(age);
		for(int i=0; i<group.length; i++)
			System.out.printf(group[i]+group_count[i]+"명 입니다.\n");
	}
	
	void input()
	{
		Scanner s = new Scanner(System.in);
		
		for(int i=0; i<age.length; i++)
		{
			System.out.printf((i+1)+"번째 사람의 태어난 년도를 입력하시오. ");
			birth_year = s.nextInt();
			
			if(birth_year > 2018)
				break;
			else
				age[i] = 2018-birth_year+1;
			
			count_person++;
		}
	}
	
	void get_count(int[] age)
	{
		for(int i=0; i<count_person; i++)
		{
			if(0<age[i] && age[i]<7)
				group_count[0]++;
			else if(0<age[i] && age[i]<13)
				group_count[1]++;
			else if(0<age[i] && age[i]<20)
				group_count[2]++;
			else if(0<age[i] && age[i]<30)
				group_count[3]++;
			else if(0<age[i] && age[i]<60)
				group_count[4]++;
			else
				group_count[5]++;
		}
	}
	
}
