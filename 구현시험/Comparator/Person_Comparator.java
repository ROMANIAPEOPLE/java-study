package Comparator;

import java.util.Arrays;
import java.util.Comparator;

class PersonAgeComparator implements Comparator<Person>{
	
	@Override
	public int compare(Person p1, Person p2) {
		//���� , ���̸� ���Ѵ�.
		int r = p1.age - p2.age;
		if( r!=0) return r; //���̸� ���� ���� 0 �� �ƴ϶��, �� ���̰� �������� �ʴٸ�
		// ���̸� ���� ����� �����Ѵ�.
		return p1.name.compareTo(p2.name); //else, ���̰� ���ٸ� �̸��� ���Ѵ�.
	}
}


class PersonNameComparator implements Comparator<Person>{
	@Override
	public int compare(Person p1, Person p2) {
		int r = p1.name.compareTo(p2.name);
		if(r !=0) return r;
		return p1.age-p2.age;	
		
	}
}







public class Person_Comparator {
	public static void main(String[] args) {
		Person[] a = new Person[] { new Person("ȫ�浿", 18), new Person("�Ӳ���", 22), new Person("����ġ", 23) };

		Arrays.sort(a, new PersonNameComparator());
		System.out.println(Arrays.toString(a));

		Arrays.sort(a, new PersonAgeComparator());
		System.out.println(Arrays.toString(a));
	}

}
