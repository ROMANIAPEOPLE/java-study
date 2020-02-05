package step1_객체지향언어.상속;

public class PointTest {
	public static void main(String[] args) {

	}
}

class Point2 {
	int x;
	int y;

	Point2(int x, int y) {
		this.x = x;
		this.y = y;
	}

	String getLocation() {
		return "x :" + x + ", y : " + y;
	}
}

class Point3D extends Point {
	int z;
	Point3D(int x, int y, int z) {
		// super();가 여기 자동으로 삽입된다.
		this.x = x;
		this.y = y;
		this.z = z;
	}

}