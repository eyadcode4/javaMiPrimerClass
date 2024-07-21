package eyad.dev.models;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class PersonTest {

    @Test
    void testPersonHasAttributes() {
        Person pepa = new Person("pepa", "foo", "147852369Q", 2005);
        assertEquals(4, pepa.getClass().getDeclaredFields().length);
    }

    @Test
    void testGetName() {
        Person pepa = new Person("pepa", "foo", "147852369Q", 2005);
        assertEquals("pepa", pepa.getName());
    }

    @Test
    void testGetLastName() {
        Person pepa = new Person("pepa", "foo", "147852369Q", 2005);
        assertEquals("foo", pepa.getLastName());
    }
    @Test
    void testGetDni() {
        Person pepa = new Person("pepa", "foo", "147852369Q", 2005);
        assertEquals("147852369Q", pepa.getDni());
    }
    @Test
    void testGetBirthDay() {
        Person pepa = new Person("pepa", "foo", "147852369Q", 2005);
        assertEquals(2005, pepa.getBirthDay());
    }

}
