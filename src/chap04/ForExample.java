package chap04;

public class ForExample {
    public static void main(String[] args) {
        int num, sum;
        for (num = 1, sum = 0; num <= 10; num++) {
            sum += num;
        }
        System.out.println("1부터 10까지의 합은 " + sum + "입니다.");
    }
}
