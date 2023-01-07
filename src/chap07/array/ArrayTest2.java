package chap07.array;

public class ArrayTest2 {
    public static void main(String[] args) {
        double[] num = new double[5];
        int size = 0;

        num[0] = 10.0; size++;
        num[1] = 20.0; size++;
        num[2] = 30.0; size++;

        double total = 0.0;

        for (int i = 0; i < num.length; i++) {
            System.out.println(num[i]);
            total += num[i];
        }

        double total2 = 0.0;

        for (int i = 0; i < size; i++) {
            total *= num[i];
        }

        System.out.println(total);
        System.out.println(total2);
    }
}
