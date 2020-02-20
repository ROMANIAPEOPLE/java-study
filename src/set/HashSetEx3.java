package set;

import java.util.HashSet;

public class HashSetEx3 {

	public static void main(String[] args) {
		HashSet set = new HashSet();
		
		set.add("abc");
		set.add("abc");
		set.add(new Person("David", 10));
		set.add(new Person("David", 10));
	
		
		System.out.println(set);
	}

}

class Person {
	String name;
	int age;
	
	Person(String name, int age){
		this.name=name;
		this.age=age;
	}

	
	public String toString() {
		return name+":"+ age;
	}

}

/*
실행결과, David : 10 이 두번 출력되는데 이것은 자바가 아이덴티티비교를 하기 때문
*/