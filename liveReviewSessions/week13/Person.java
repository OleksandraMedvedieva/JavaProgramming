package week13;

public class Person {
    private String firstName, lastName;
    private int age;
    private static String planet = "Earth";

    public Person() {
        this.firstName = "undefined";
        this.lastName = "undefined";
        this.age = -1;
    }
    public Person(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }
    public static String getPlanet(){
        return planet;
    }


    public int getAge() {
        return age;
    }
    public void setAge(int age){
        this.age = age;
    }

    public static void main(String[] args) {

        Person personOne = new Person("Michael", "Scolfoeld", 30);
        System.out.println("person planet: " + Person.getPlanet());



    }
}
