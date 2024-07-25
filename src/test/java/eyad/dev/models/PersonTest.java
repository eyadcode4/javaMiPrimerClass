package eyad.dev.models;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class PersonTest {

    @Test
    void testPersonHasAttributes() {
        Person pepa = new Person("pepa", "foo", "147852369Q", 2005, "spain", 'H');
        assertEquals(6, pepa.getClass().getDeclaredFields().length);
    }

    @Test
    void testGetName() {
        Person pepa = new Person("pepa", "foo", "147852369Q", 2005, "spain", 'H');
        assertEquals("pepa", pepa.getName());
    }

    @Test
    void testGetLastName() {
        Person pepa = new Person("pepa", "foo", "147852369Q", 2005, "spain", 'H');
        assertEquals("foo", pepa.getLastName());
    }
    @Test
    void testGetDni() {
        Person pepa = new Person("pepa", "foo", "147852369Q", 2005, "spain", 'H');
        assertEquals("147852369Q", pepa.getDni());
    }
    @Test
    void testGetBirthDay() {
        Person pepa = new Person("pepa", "foo", "147852369Q", 2005, "spain", 'H');
        assertEquals(2005, pepa.getBirthYear());
    }
    @Test
    void testGetCountryBirth() {
        Person pepa = new Person("pepa", "foo", "147852369Q", 2005, "spain", 'H');
        assertEquals("spain", pepa.getCountryBirth());
    }
    @Test
    void testGetPersonGenere() {
        Person pepa = new Person("pepa", "foo", "147852369Q", 2005, "spain", 'H');
        assertEquals('H', pepa.getPersonGenere());
    }

}
