package workbook.StepJ;

public class TenthGolden {
	private double ratio = 0;
	private double pre_ratio = 0;
	
	public TenthGolden()
	{
		findingFibonacci();
	}
	
	void findingFibonacci()
	{
		int i=0;
		while(true)
		{
			++i;
			
			ratio = (double)fibonacci(i+1) / fibonacci(i);
			
			if(i<10)
				System.out.printf(" %d번째 : 비율 (%d/%d) : %f\n", i, fibonacci(i+1), fibonacci(i), ratio);
			else
				System.out.printf("%d번째 : 비율 (%d/%d) : %f\n", i, fibonacci(i+1), fibonacci(i), ratio);
	
		if(Math.abs(ratio - pre_ratio) < 0.000001)
				break;
			pre_ratio = ratio;
		}
	}
	
	int fibonacci(int n)
	{
		if(n == 1)
			return 1;
		else if(n == 2)
			return 1;
		else
			return fibonacci(n-1)+fibonacci(n-2);
	}

}
