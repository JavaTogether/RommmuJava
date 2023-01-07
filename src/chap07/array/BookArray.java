package chap07.array;

public class BookArray {
    public static void main(String[] args) {
        // int[] intarr = new int[10];

        Book[] library = new Book[5];

        for(int i = 0; i < library.length; i++) {
            System.out.println(library[i]);
        }
    }
}
