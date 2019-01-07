/******** including class Point **********/

package workbook.StepK;

import java.util.Scanner;

public class K03 {
	private int location[] = {0, 0, 0, 0};
	public K03()
	{
		Point num = new Point();
		num.input(0);
		
		System.out.printf("좌표의 X, Y 값을 입력하시오 --> ");
		System.out.printf("=======================================\n");
		
		location[num.output(0)-1]++;
		
		for(int i=0; i<location.length; i++)
			System.out.printf("%d사분면의 좌표는 모두 %d개입니다.\n", (i+1), location[i]);
	}

}

class Point{
	private double x;
	private double y;
	private int count;
	
	void input(int where)
	{
		Scanner s = new Scanner(System.in);
		
		System.out.printf("%d좌표의 X, Y 값을 입력하시오 --> ", (where+1));
		x = s.nextDouble();
		y = s.nextDouble();
	}
	
	int output(int where)
	{
		count = get_area(x, y);
		System.out.printf("%d번째 좌표는 %d사분면에 위치합니다.\n", (where+1), count);
		
		return count;
	}
	
	int get_area(double x, double y)
	{
		if(x>0 && y>0)
			return 1;
		else if(x<0 && y>0)
			return 2;
		else if(x<0 && y<0)
			return 3;
		else if(x>0 && y<0)
			return 4;
		else
			return 0;
	}
}
