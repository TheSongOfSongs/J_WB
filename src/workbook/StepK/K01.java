
/********* including class MenuPan ********/

package workbook.StepK;

import java.util.Scanner;

public class K01 {
	public K01()
	{
		MenuPan user = new MenuPan();
		user.input();
		System.out.printf("=======================================\n");
		System.out.printf("메뉴번호\t메뉴이름\t원산지\t1인분가격\n");
		user.output();
	}
}


class MenuPan{
	int num; //메뉴 번호
	String name; //메뉴명
	String origin; //원산지
	private int price; //가격

	void input()
	{
		Scanner s = new Scanner(System.in);
		
		System.out.printf("메뉴의 번호, 메뉴명, 원산지, 가격을 입력하시오. ");
		num = s.nextInt();
		name = s.next();
		origin = s.next();
		price = s.nextInt();
	}
	
	void output()
	{
		System.out.printf(num+"\t"+name+"\t"+origin+"\t"+price+"\n");
	}

}