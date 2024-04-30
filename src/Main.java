public class Main {


    public static void main(String[] args) {

        Builder builder = new Builder("Alex","cakt",20,"via delle palme");
        Builder builder1 = new Builder("Melo","Tittok",21,"Via della colomba112");
        Person person = new Person( builder);
        Person person1 = new Person(builder1);

        System.out.println("L'oggetto creato è : " + person);
        System.out.println("L'oggetto creato è : " + person1);

    }
}