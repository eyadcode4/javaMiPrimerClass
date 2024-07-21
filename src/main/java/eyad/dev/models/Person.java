package eyad.dev.models;

public class Person {

    private String name;
    private String lastName;
    private String dni;
    private int birthDay;

    public Person(String name, String lastName, String dni, int birthDay) {
        this.name = name;
        this.lastName = lastName;
        this.dni = dni;
        this.birthDay = birthDay;
    }
   
    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }
    public String getDni() {
        return dni;
    }

    public int getBirthDay() {
        return birthDay;
    }

    public void print() {
        System.out.println("Person: " + name + "," + lastName);
        
    }



   
    
}
