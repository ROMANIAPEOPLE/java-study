package 구현시험1029;

import java.util.Arrays;

public class Exam03 {

	static boolean compareIdentity(Person[] a1, Person[] a2) {
		//�ΰ��� ��ü�� ������ ��ü����
		return a1==a2;
	}

	static boolean compareEquality(Person[] a1, Person[] a2) {
		return Arrays.equals(a1, a2);
	}

	public static void main(String[] args) {
		Person[] a1 = new Person[] { new Person("ȫ�浿", 18), new Person("�Ӳ���", 21) };
		Person[] a2 = new Person[] { new Person("ȫ�浿", 18), new Person("�Ӳ���", 21) };

		System.out.println(compareIdentity(a1, a2));
		System.out.println(compareEquality(a1, a2));
	}
}
