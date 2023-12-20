package Task3;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Person person = new Person();
        person.setName(input.nextLine());
        person.setAge(input.nextInt());
        System.out.println("name: " + person.getName());
        System.out.println("age: "+ person.getAge());
    }
}