package _230502_1_Collection_List;

import java.util.Arrays;
import java.util.List;

public class ArraysListExample {

	public static void main(String[] args) {//�Ϲ� �迭�� ArrayList�� ��ȯ�ϱ�
		List<String> list1 = Arrays.asList("ȫ�浿", "�ſ��", "���ڹ�"); //error : asList()�� List�� �����ϸ� ���Ҹ� ���Ӱ� �߰��� �� ����
		for(String name: list1) {
			System.out.println(name);
		}
		
		List<Integer> list2 = Arrays.asList(1,2,3);
		for(int value : list2) {
			System.out.println(value);
		}
	}

}
