package chap10.interfaceex;

public class CalcTest {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 5;
        Calc calc = new CompleteCalc();

        System.out.println(calc.add(num1, num2));
        System.out.println(calc.subtract(num1, num2));
        System.out.println(calc.times(num1, num2));
        System.out.println(calc.divide(num1, num2));

        calc.description();

        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8};
        int sum = Calc.total(arr);
    }
}
