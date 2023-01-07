package chap07.array;

public class BookArray2 {
    public static void main(String[] args) {
        // int[] intarr = new int[10];

        Book[] library = new Book[5];

        library[0] = new Book("강아지", "멍멍");
        library[1] = new Book("고양이", "야옹");
        library[2] = new Book("병아리", "삐약");
        library[3] = new Book("소", "음메");
        library[4] = new Book("쥐", "찍찍");

        for(int i = 0; i < library.length; i++) {
            System.out.println(library[i]);
        }

        for(int i = 0; i < library.length; i++) {
            library[i].showBookInfo();
        }
    }
}
