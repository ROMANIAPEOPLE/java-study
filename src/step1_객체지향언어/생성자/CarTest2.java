package step1_객체지향언어.생성자;
/*
 * this : 인스턴스 자신을 가르키는 참조변수, 인스턴스의 주소가 저장되어 있다.
 * this() , this(매개변수) : 생성자, 같은 클래스의 다른 생성자를 호출할 때 사용한다. 
 */


class Car {
	String color;
	String gearType;
	int door;
	
	Car () {
		this("white","auto",4);
	}
	
	Car(String color) {
		this(color,"manual",4);
	}
	
	Car(String color, String gearType, int door){
		this.color = color;
		this.gearType = gearType;
		this.door = door;
	}
	
}
public class CarTest2 {
	public static void main(String[] args) {
		Car c1 = new Car();
		Car c2 = new Car("blue");
		System.out.println("c1의 color=" + c1.color + ", gearType =" + c1.gearType + ", door=" +c1.door);
		System.out.println("c2의 color=" + c2.color + ", gearType =" + c2.gearType + ", door=" +c2.door);
	}
}