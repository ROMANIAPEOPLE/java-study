package regex;
public class Example2 {
    //matches   :  this 문자열과 정규식 문자열이 일치하면 true를 리턴한다.
    public static void main(String[] args) {
        String[] a = new String[] { "010-323-1232", "02-542-3322", "010-9930-1123", "032-431-2323" };
        String regex = "0(2|[1-9]{2})-[0-9]{3}-[0-9]{4}";
        //0은 필수로 들어가게 되고 ,2 또는 [1-9] 가 2개있는것을 ()로 묶고,   [0-9] 가 3개 있어야 하고, [0-9]가 4개 있어야 한다.

        //첫번째는 01X 에서  X 에 0이 들어갈수 없기 떄문에 false , 세번째는 9930이 3자리가 아니기 때문에 false
        
        for (String s : a) {
            if (s.matches(regex))
                System.out.printf("\"%s\" matches \"%s\"\n", s, regex);
            else
                System.out.printf("\"%s\" doesn't match \"%s\"\n", s, regex);
        }
    }

}
