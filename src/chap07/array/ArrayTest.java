package chap07.array;

public class ArrayTest {
    public static void main(String[] args) {
        int[] numbers = new int[3];

        int[] numbers2 = new int[] {1, 2, 3};

        System.out.println(numbers.length);


        System.out.println(numbers2.length);

        numbers[0] = 1;
        numbers[1] = 2;
        numbers[2] = 3;

        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }
        
    }
}
