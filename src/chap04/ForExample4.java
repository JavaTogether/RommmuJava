package chap04;

public class ForExample4 {
    public static void main(String[] args) {
        int dan, times;

        for (dan = 2; dan <= 9; dan++) {
            for (times = 1; times <= 9; times++) {
                if (dan % 2 == 1) {
                    break;
                }
                System.out.println(dan + "X" + times + "=" + dan * times);
            }
            System.out.println();
        }
    }
}
