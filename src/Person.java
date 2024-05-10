public class Person {

    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;

    }
    public String toString() {
        return "Name:" + name + " Age: " + age;
    }

    public static void main(String[] args) {
        Person precious = new Person("Precious", 15);
        System.out.println(precious);
    }
}