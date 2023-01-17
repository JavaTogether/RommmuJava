package chap11.string;

public class StringTest {
    public static void main(String[] args) {
        String str1 = new String("abc");
        String str2 = "abc";

        System.out.println(str1 == str2);

        String str3 = "abc";

        System.out.println(str2 == str3);
    }
}
