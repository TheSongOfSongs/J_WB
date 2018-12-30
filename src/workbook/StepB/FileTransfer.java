package workbook.StepB;

import java.util.Scanner;

public class FileTransfer {
	private int megabytes;
	private long bytes;
	private String usb2; // if using usb2.0 or not
	private int time;
	
	public FileTransfer()
	{ input(); }
	
	void input()
	{
		Scanner s = new Scanner(System.in);
		System.out.printf("파일 용량을 메가바이트 단위로 입력하세요 ");
		this.megabytes = s.nextInt();
		System.out.printf("USB 포트가 2.0이면 Y, 아니면 N을 입력하세요 ");
		this.usb2 = s.next();
	}
	
	public void printOther()
	{
		System.out.printf("파일 전송시간은 %d 초 입니다.\n", get_time());
	}
	
	int get_time()
	{
		if(usb2.equalsIgnoreCase("N"))
			time = (int)(get_bytes()/1500000);
		else
			time = (int)(get_bytes()/60000000);
		return this.time;
	}
	
	long get_bytes()
	{
		bytes = megabytes*1024*1024;
		return this.bytes;
	}
	

}
