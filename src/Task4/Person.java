package Task4;
public class Person {
    int age;
    String name;
    public Person(String name1, int age1) {
        age = age1;
        name = name1;
    }
    public void printDetails(){
        System.out.println("Name: " + name);
        System.out.print("Age: "+ age);
    }
}
