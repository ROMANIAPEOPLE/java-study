package String_pool;

public class Main {

    /**
     * new 키워드를 사용한 String 객체는 heap 영역 내의 string pool로 저장되지 않기때문에  서로 다른 객체로 처리함.
     * 리터럴 형식으로 생성한 String 객체는 heap 영역 내의 String pool로 저장되기 때문에 같은 문자열인 경우 이미 존재하는 string pool 내의
     * 주소값을 참조하기 때문에 새로운 객체를 만들지 않음. (JVM의 효과적인 메모리 관리 방법)
     */

    public static void main(String[] args) {
        String s = "12345";
        String s2 = new String("12345");

        String s3 = "12345";

        System.out.println(s.equals(s2)); // true
        System.out.println(s == s2); // false

        System.out.println(s == s3); // true
    }

}
