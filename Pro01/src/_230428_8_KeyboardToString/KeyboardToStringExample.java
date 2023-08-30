package _230428_8_KeyboardToString;
import java.io.IOException;

public class KeyboardToStringExample {

	public static void main(String[] args) throws IOException {
		byte[] bytes = new byte[100];
		
		
		System.out.print("입력 : ");
		int readByteNo = System.in.read(bytes);
		
		String str = new String(bytes,0,readByteNo-2);     //줄바꿈 10과 엔터 13
		System.out.println(str);
		
		for (int i=0; i<bytes.length; i++) {
			System.out.print( bytes[i] + " ");
		}
		System.out.println();
		for (byte b : bytes) {
			System.out.print(b + " ");
		}
	}

}
