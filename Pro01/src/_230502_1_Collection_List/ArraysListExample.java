package _230502_1_Collection_List;

import java.util.Arrays;
import java.util.List;

public class ArraysListExample {

	public static void main(String[] args) {//일반 배열을 ArrayList로 변환하기
		List<String> list1 = Arrays.asList("홍길동", "신용권", "감자바"); //error : asList()로 List를 생성하면 원소를 새롭게 추가할 수 없음
		for(String name: list1) {
			System.out.println(name);
		}
		
		List<Integer> list2 = Arrays.asList(1,2,3);
		for(int value : list2) {
			System.out.println(value);
		}
	}

}
