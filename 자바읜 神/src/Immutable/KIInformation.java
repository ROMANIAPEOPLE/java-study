package Immutable;

public class KIInformation {
    private int age;
    private String hobby;

    public KIInformation(int age, String hobby) {
        this.age =age;
        this.hobby =hobby;
    }

    public int getAge() {
        return age;
    }

    public String getHobby() {
        return hobby;
    }

    public KIInformation addAgeAndChangeHobby(int plusAge, String hobby) {
        return new KIInformation(age+plusAge,hobby);
    }


}
