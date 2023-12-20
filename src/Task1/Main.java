package Task1;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Person person = new Person();
        Scanner input = new Scanner(System.in);
        person.name =input.nextLine();
        person.age = input.nextInt();
        System.out.println("Name: " + person.name);
        System.out.print("Age : " + person.age);
    }
}
