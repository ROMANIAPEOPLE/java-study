package set;

import java.util.HashSet;

public class HashSetEx4 {
	public static void main(String[] args) {
		HashSet set = new HashSet();

		set.add("abc");
		set.add("abc");
		set.add(new Person2("David", 10));
		set.add(new Person2("David", 10));

		System.out.println(set);
	}
}

class Person2 {
	String name;
	int age;

	Person2(String name, int age) {
		this.name = name;
		this.age = age;
	}

//	@Override
//	public int hashCode() {
//		return (name+age).hashCode();
//	}
//
//
//	@Override
//	public boolean equals(Object obj) {
//		if(obj instanceof Person2) {
//			Person2 temp = (Person2)obj;
//			return name.equals(temp.name) && this.age == temp.age;
//		}
//		return false;
//	}

	public String toString() {
		return name + ":" + age;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + age;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Person2 other = (Person2) obj;
		if (age != other.age)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

}