package example.c;

public enum EnumTest {
    LEVEL_ONE(1000,1),
    LEVEL_TWO(2000,2),
    LEVEL_THREE(3000,3),
    LEVEL_FOUR(4000,4);

    private final int salary;
    private final int ratio;
    EnumTest(int salary,int ratio) {
        this.salary=salary;
        this.ratio=ratio;

    }
    public int getRatio(int ratio){
        return ratio;
    }
}
