package Task5;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String name = input.next();

        int age = input.nextInt();


        Person person = new Person(name, age);

        System.out.println("Name: " + person.getName());
        System.out.println("Age: " + person.getAge());
        String newName = input.next();
        person.setName(newName);
        int newAge = input.nextInt();

        person.setAge(newAge);

        System.out.println("Name: " + person.getName());
        System.out.println("Age: " + person.getAge());
    }
}
