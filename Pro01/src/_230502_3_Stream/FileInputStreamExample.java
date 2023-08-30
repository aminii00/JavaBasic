package _230502_3_Stream;

import java.io.FileInputStream;

public class FileInputStreamExample {
	public static void main(String[] args) {
		try {
			FileInputStream fis = new FileInputStream("C:/Users/Administrator/eclipse-workspace/Pro01/src/_230502_3_Stream/FileInputStreamExample.java");
			int data;
			while( (data = fis.read()) != -1) {
				System.out.write(data);
			}
			fis.close();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}