package regex;
public class Example2 {
    //matches   :  this ���ڿ��� ���Խ� ���ڿ��� ��ġ�ϸ� true�� �����Ѵ�.
    public static void main(String[] args) {
        String[] a = new String[] { "010-323-1232", "02-542-3322", "010-9930-1123", "032-431-2323" };
        String regex = "0(2|[1-9]{2})-[0-9]{3}-[0-9]{4}";
        //0�� �ʼ��� ���� �ǰ� ,2 �Ǵ� [1-9] �� 2���ִ°��� ()�� ����,   [0-9] �� 3�� �־�� �ϰ�, [0-9]�� 4�� �־�� �Ѵ�.

        //ù��°�� 01X ����  X �� 0�� ���� ���� ������ false , ����°�� 9930�� 3�ڸ��� �ƴϱ� ������ false
        
        for (String s : a) {
            if (s.matches(regex))
                System.out.printf("\"%s\" matches \"%s\"\n", s, regex);
            else
                System.out.printf("\"%s\" doesn't match \"%s\"\n", s, regex);
        }
    }

}
