public class Person {

    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }


    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public static void main(String[] args) {
        Person precious = new Person("Precious", 15);
        Person joy = new Person("Joy", 25);
        System.out.println("First person's name is:" + precious.getName());
        System.out.println("First person's age is:" + precious.getAge());
        System.out.println("Second person's name is:" + precious.getName());
        System.out.println("Second person's age is:" + joy.getName());
    }

}
