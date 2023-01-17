package chap11.classes;

public class ClassTest {
    public static void main(String[] args) throws ClassNotFoundException {
        Person person = new Person();

        Class pPerson1 = person.getClass();
        System.out.println(pPerson1.getName());
        Class pPerson2 = Person.class;
        System.out.println(pPerson2.getName());
        Class pPerson3 = Class.forName("chap11.classes.Person");
    }
}
