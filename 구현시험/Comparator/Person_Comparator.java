package Comparator;

import java.util.Arrays;
import java.util.Comparator;

class PersonAgeComparator implements Comparator<Person>{
	
	@Override
	public int compare(Person p1, Person p2) {
		//먼저 , 나이를 비교한다.
		int r = p1.age - p2.age;
		if( r!=0) return r; //나이를 비교한 값이 0 이 아니라면, 즉 나이가 동일히자 않다면
		// 나이를 비교한 결과를 리턴한다.
		return p1.name.compareTo(p2.name); //else, 나이가 같다면 이름을 비교한다.
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
		Person[] a = new Person[] { new Person("홍길동", 18), new Person("임꺽정", 22), new Person("전우치", 23) };

		Arrays.sort(a, new PersonNameComparator());
		System.out.println(Arrays.toString(a));

		Arrays.sort(a, new PersonAgeComparator());
		System.out.println(Arrays.toString(a));
	}

}
