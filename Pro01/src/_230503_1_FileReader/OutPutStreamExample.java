package _230503_1_FileReader;


import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;

public class OutPutStreamExample {

	public static void main(String[] args) throws Exception {
		FileOutputStream fos = new FileOutputStream("C:/Temp/miso.txt");
		Writer writer = new OutputStreamWriter(fos);
		
		String data = "나의 꿈과 희망 미소";
		writer.write(data);
		
		writer.flush();
		writer.close();
		System.out.println("파일 저장이 끝났습니다.");
		
	}
}