package chap07.array;

public class ObjectArray {
    public static void main(String[] args) {
        Book[] bookArray1 = new Book[3];
        Book[] bookArray2 = new Book[3];

        bookArray1[0] = new Book("강아지", "멍멍");
        bookArray1[1] = new Book("고양이", "야옹");
        bookArray1[2] = new Book("소", "음메");

        System.arraycopy(bookArray1, 0, bookArray2, 0, 3);

        for(int i = 0; i < bookArray2.length; i++) {
            bookArray2[i].showBookInfo();
        }

        bookArray1[0].setBookName("돼지");
        bookArray2[0].setAuthor("꿀꿀");

        for(int i = 0; i < bookArray1.length; i++) {
            bookArray1[i].showBookInfo();
        }
    }
}
