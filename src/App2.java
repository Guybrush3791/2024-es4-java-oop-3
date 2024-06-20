public class App2 {

    public static void main(String[] args) {

        oopTest1();
    }

    public static void oopTest1() {

        System.out.println("--------------------");

        Person p1 = new Person("Guybrush", "Threepwood");
        System.out.println(p1);

        System.out.println("--------------------");

        Employee e1 = new Employee("Elaine", "Marley", 1800);
        System.out.println(e1);

        System.out.println("--------------------");

        Boss b1 = new Boss("LeChuck", "The Evil Pirate", 3000, 1000);
        System.out.println(b1);
    }
}
