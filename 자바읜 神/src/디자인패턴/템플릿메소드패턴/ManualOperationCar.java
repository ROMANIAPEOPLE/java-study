package 디자인패턴.템플릿메소드패턴;

public class ManualOperationCar {
    public void playWithOwner() {
        System.out.println("시동 켜기");
        System.out.println("사이드 브레이크 해제");

        System.out.println("클러치 상태에서 2단 넣기");
        System.out.println("기어 수동 조작");

        System.out.println("브레이크");
    }
}