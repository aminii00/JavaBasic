package _230503_1_FileReader;

import java.io.File;
import java.io.FileWriter;


public class FileWriterExample {
	public static void main(String[] args) throws Exception {
		
		File file = new File("C:/Temp/file.txt");
		FileWriter fw = new FileWriter(file, true);
		
		fw.write("FileWriter�� �ѱ۷� ��" + "\r\r");
		fw.write("���ڿ��� �ٷ� ����� �� �ִ�."  + "\r\r");
		fw.flush();
		fw.close();
		System.out.println("���Ͽ� ����Ǿ����ϴ�.");
	}

}
