package abstractAndInterface;

/**
 * 수영을 추상클래스(Creature)로 구현하지 않은 이유는, 사람과 동물 모두 수영을 못하는 생명체가 있기 때문이다.
 */
public interface Swimable {
    void swimDown(int yDistance);
}
