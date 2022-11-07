package chap02;

public class ExplicitConversion {

    public static void main(String[] args) {
        int iNum = 1000;
        byte bNum = (byte)iNum;

        System.out.println(iNum);
        System.out.println(bNum);

        double dNum = 3.14;
        iNum = (int)dNum;

        System.out.println(dNum);
        System.out.println(iNum);
    }

}
