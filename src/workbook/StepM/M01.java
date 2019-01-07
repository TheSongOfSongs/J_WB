package workbook.StepM;

import java.util.Scanner;
import java.util.ArrayList;
import java.io.IOException;
import java.io.PrintWriter;

public class M01 {
	private int func;
	private int fix;
	private boolean stop = true;
	
	public M01()
	{
		Scanner s = new Scanner(System.in);
		
		ArrayList<MenuPan> u = new ArrayList<MenuPan>();
		
		while(stop)
		{
			System.out.printf("\n1)추가 2)수정 3)삭제 4)리스트 5)총개수 6)종료 ==> ");
			func = s.nextInt();
			System.out.printf("-----------------------------------\n");
			
			switch(func)
			{
				case 1:
					u.add(new MenuPan());
					break;
					
				case 2:
					print(u);
					System.out.printf("==> 수정할 번호를 입력하세요 : ");
					fix = s.nextInt();
					u.get(--fix).revise();	
					System.out.printf("수정되었습니다.\n");
					break;
					
				case 3:
					print(u);
					System.out.printf("==> 삭제할 번호를 입력하세요 : ");
					fix = s.nextInt();
					u.remove(--fix);
					System.out.printf("삭제되었습니다.\n");
					break;
					
				case 4:
					print(u);
					break;
					
				case 5:
					System.out.printf("%d개의 메뉴가 등록되었습니다.\n", u.size());
					break;
					
				case 6:
					System.out.printf("종료되었습니다.\n");
					try{
						saving(u);
					}catch (IOException e)
					{
						System.out.printf("에러가 발생했습니다.\n");
					}
					stop = false;
					break;
			}
		}
	}
	
	void print(ArrayList<MenuPan> u)
	{
		System.out.printf("메뉴번호\t메뉴이름\t원산지\t1인분가격\n");
	
		for(int i=0; i<u.size(); i++)
		{
			u.get(i).output(i+1);
		}
	}
	
	void saving (ArrayList<MenuPan> u) throws IOException 
	{
		 PrintWriter pw = new PrintWriter("test.txt");
		 
		 pw.write("메뉴번호\t메뉴이름\t원산지\t1인분가격\n");
		
		 for(int i=0; i<u.size(); i++)
			pw.write((i+1)+"\t"+u.get(i).name+"\t"+u.get(i).origin+"\t"+u.get(i).price+"\n");
	     pw.close();
	}
}

class MenuPan{
	String name; //메뉴명
	String origin; //원산지
	int price; //가격
	
	MenuPan()
	{
		input();
	}
	
	void input()
	{
		Scanner s = new Scanner(System.in);
		
		System.out.printf("메뉴명, 원산지, 가격을 입력하시오. ");
		name = s.next();
		origin = s.next();
		price = s.nextInt();
		System.out.printf("입력되었습니다.\n");
	}
	
	void revise()
	{
		Scanner s = new Scanner(System.in);
		
		System.out.printf("==> 메뉴명, 원산지, 가격을 입력하시오. ");
		name = s.next();
		origin = s.next();
		price = s.nextInt();
	}

	void output(int index)
	{
		System.out.printf((index)+"\t"+name+"\t"+origin+"\t"+price+"\n");
	}
}
