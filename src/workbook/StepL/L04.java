package workbook.StepL;

import java.util.Scanner;
import java.util.ArrayList;

public class L04 {
	private int func;
	private int fix;
	private String find;
	private String sure;
	private boolean stop = true;
	private int all = -1;
	
	public L04()
	{
		Scanner s = new Scanner(System.in);
		
		ArrayList<Student> u = new ArrayList<Student>();
		
		while(stop)
		{
			System.out.printf("\n1)학생등록 2)정보수정 3)삭제 4)리스트 5)이름검색 6)복학생리스트 7)주소검색 8)종료 ==> ");
			func = s.nextInt();
			System.out.printf("-----------------------------------\n");
			
			switch(func)
			{
				case 1:
					u.add(new Student());
					System.out.printf("총 %d명이 등록되었습니다.\n\n", u.size());
					break;
					
				case 2:
					print(u, all);
					System.out.printf("==> 수정할 번호를 입력하세요 : ");
					fix = s.nextInt();
					u.get(--fix).input();	
					System.out.printf("수정되었습니다.\n");
					break;
					
				case 3:
					print(u, all);
					System.out.printf("==> 삭제할 번호를 입력하세요 : ");
					fix = s.nextInt();
					System.out.printf("정말로 삭제하겠습니까?(Y/N) ");
					sure = s.next();
					if(sure.equalsIgnoreCase("N"))
							break;
					
					u.remove(--fix);
					System.out.printf("삭제되었습니다.\n");
					break;
					
				case 4:
					print(u, all);
					break;
					
				case 5:
					System.out.printf("검색하실 이름을 입력하세요 : ");
					find = s.next();
					finding(u, find);
					break;
					
				case 6:
					only_senior(u);
					break;
					
				case 7:
					System.out.printf("검색하실 이름을 입력하세요 : ");
					find = s.next();
					finding_address(u, find);
					System.out.printf("종료되었습니다.\n");
					break;
					
				case 8:
					System.out.printf("종료되었습니다.\n");
					stop = false;
					break;
			}
		}
	}
	
	void print(ArrayList<Student> u, int finding)
	{
		System.out.printf("번호\t이름\t학번\t\t성별\t주소\t\t전화번호\t\t복학생\n");
	
		if(finding != -1)
			u.get(finding).output(finding+1);
		else
		{
			for(int i=0; i<u.size(); i++)
			{
				u.get(i).output(i+1);
			}
		}
	}
	
	void finding(ArrayList<Student> u, String find)
	{
		for(int i=0; i<u.size(); i++)
		{
			if(u.get(i).namesearch(find))
			{
				System.out.printf("검색되었습니다.\n");
				print(u, i);
			}
		}
	}
	
	void only_senior(ArrayList<Student> u)
	{
		int count = 0;
		for(int i=0; i<u.size(); i++)
			if(u.get(i).RUSenior())
			{
				print(u, i);
				count++;
			}
		System.out.printf("복학생은 %d명입니다.\n\n", count);
	}
	
	void finding_address(ArrayList<Student> u, String find)
	{
		for(int i=0; i<u.size(); i++)
		{
			if(u.get(i).address_search(find))
			{
				print(u, i);
			}
		}
	}

}

class Student{
	String name; //이름
	int number; //학번
	String gender; //성별
	String address[] = new String[2];
	String phone; //전화번호
	String senior; //복학생
	
	Student()
	{
		input();
	}
	
	void input()
	{
		Scanner s = new Scanner(System.in);
		
		System.out.printf("학생이름, 학번, 성별을 입력하세요 : ");
		name = s.next();
		number =s.nextInt();
		gender = s.next();
		
		System.out.printf("주소를 입력하세요 : ");
		address[0] = s.next();
		address[1] = s.next();
		
		System.out.printf("전화번호를 입력하세요 : ");
		phone = s.next();
		
		System.out.printf("복학생입니까?(Y/N) ");
		senior = s.next();
	}

	void output(int index)
	{
		System.out.printf((index)+"\t"+name+"\t"+number+"\t"+gender+"\t"+address[0]+" "+address[1]+"\t"+phone+"\t"+senior+"\n");
	}
	
	boolean namesearch(String name)
	{
		if(this.name.contains(name))
			return true;
		else
			return false;
	}
	
	boolean RUSenior() 
	{
		if(senior.equalsIgnoreCase("y"))
			return true;
		else
			return false;
	}
	
	boolean address_search(String where)
	{
		for(int i=0; i<address.length; i++)
			if(address[i].contains(where))
				return true;
		return false;
	}
}
	
