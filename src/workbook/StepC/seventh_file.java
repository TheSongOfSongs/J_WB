package workbook.StepC;

import java.util.Scanner;

public class seventh_file {
	private int megabytes;
	private long bytes;
	private byte kind;
	private double time;
	
	public seventh_file()
	{ input(); }
	
	void input()
	{
		Scanner s = new Scanner(System.in);
		System.out.printf("파일 용량을 메가바이트 단위로 입력하세요 ");
		this.megabytes = s.nextInt();
		System.out.printf("전송방식을 1:Wi-Fi, 2:BlueTooth, 3:LTE, 4:USB 에서 입력하세요 ");
		this.kind = s.nextByte();
		bytes = get_bytes();
	}
	
	public void printTime()
	{
		System.out.printf("파일 전송시간은 %.1f 초 입니다.\n", get_time());
	}
	
	double get_time()
	{
		if(kind==1)
			time = bytes/1500000;
		else if(kind==2)
			time = bytes/300000;
		else if(kind==3)
			time = bytes/1000000;
		else
			time = bytes/60000000;
		return this.time;
	}
	
	long get_bytes()
	{
		bytes = megabytes*1024*1024;
		return this.bytes;
	}
	

}
