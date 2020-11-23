package Immutable;

public class Person {
    private final KIInformation kiInformation;

    public Person(KIInformation information) {
        this.kiInformation = information;
    }



    public static void main(String[] args) {
        KIInformation information = new KIInformation(26,"programming");
        Person person1 = new Person(information);


        System.out.println(person1.kiInformation.toString());

    }
}
