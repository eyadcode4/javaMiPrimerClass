package eyad.dev;

import eyad.dev.models.Person;

/**
 * Hello world!
 */
public final class App {
    private App() {
    }

    /**
     * Says hello to the world.
     * @param args The arguments of the program.
     */
    public static void main(String[] args) {
        Person p1 = new Person("eyad","jose","159874523p",2007,"spain",'H');
        Person p2 = new Person("jorge","maria","15748963L",2011,"Germany",'H');
        
        p1.print();        
        p2.print();
    }
}
