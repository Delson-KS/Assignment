package Task2;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Person person = new Person();
        Scanner input = new Scanner(System.in);
        person.name =input.nextLine();
        person.age = input.nextInt();
        person.printDetails();
    }
}