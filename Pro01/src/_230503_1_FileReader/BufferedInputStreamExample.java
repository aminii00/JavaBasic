package _230503_1_FileReader;

import java.io.BufferedInputStream;
import java.io.FileInputStream;

public class BufferedInputStreamExample {

	public static void main(String[] args) throws Exception {
		long start = 0;
		long end = 0;
		
		FileInputStream fis1 = new FileInputStream("C:/Temp/cat.jpg");
		start =System.currentTimeMillis();
		while(fis1.read() != -1) {}
		end = System.currentTimeMillis();
		System.out.println("사용 X : " + (end-start) + "ms");
		fis1.close();
		
		
		FileInputStream fis2 = new FileInputStream("C:/Temp/cat.jpg");
		BufferedInputStream bis = new BufferedInputStream(fis2);
		start =System.currentTimeMillis();
		while(bis.read() != -1) {}
		end = System.currentTimeMillis();
		System.out.println("사용 O : " + (end-start) + "ms");
		fis1.close();      
		
	}

}                
