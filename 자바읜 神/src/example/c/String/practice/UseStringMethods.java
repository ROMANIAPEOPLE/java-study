package example.c.String.practice;

public class UseStringMethods {
    public static void main(String[] args) {
        UseStringMethods u = new UseStringMethods();
        String str ="The String class represents character strings";
        u.printWords(str);
        u.findString(str,"string");
    }
    public void printWords(String str){
        String [] s  = str.split(" ");
        for (String value : s) {
            System.out.println(value);
        }
    }
    public void findString(String str, String findStr){
        int value = str.indexOf(findStr);
        System.out.println(findStr + " is appeared at " + value);
    }
}
