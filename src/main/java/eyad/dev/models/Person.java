package eyad.dev.models;

public class Person {

    private String name;
    private String lastName;
    private String dni;
    private int birthYear;
    private String countryBirth;
    private char personGenere;

    public Person(String name, String lastName, String dni, int birthYear, String countryBirth, char personGenere) {
        this.name = name;
        this.lastName = lastName;
        this.dni = dni;
        this.birthYear = birthYear;
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
        return birthYear;
    }

    public String getCountryBirth() {
        return countryBirth;
    }

    public char getPersonGenere() {
        return personGenere;
    }

    public void print() {
        System.out.println("Name = " + name);
        System.out.println("Last Name = " + lastName);
        System.out.println("DNI = " + dni);
        System.out.println("Birth Year = " + birthYear);
        System.out.println("Birth Country = " + countryBirth);
        System.out.println("Gender = " + personGenere);
    }

}
