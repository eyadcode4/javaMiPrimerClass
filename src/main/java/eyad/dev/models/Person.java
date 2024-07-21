package eyad.dev.models;

public class Person {

    private String name;
    private String lastName;
    private String dni;
    private int birthDay;
    private String countryBirth;
    private char personGenere;

    public Person(String name, String lastName, String dni, int birthDay, String countryBirth, char personGenere) {
        this.name = name;
        this.lastName = lastName;
        this.dni = dni;
        this.birthDay = birthDay;
        this.countryBirth = countryBirth;
        this.personGenere = personGenere;
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

    public String getCountryBirth() {
        return countryBirth;
    }

    public char getPersonGenere() {
        return personGenere;
    }



    public void print() {
        System.out.println("Person: " + name + "," + lastName);
        
    }



   
    
}
