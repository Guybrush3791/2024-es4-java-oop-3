public class App {
    public static void main(String[] args) throws Exception {

        squareTest();
        rectTest();
    }

    public static void squareTest() {

        Square s1 = new Square(5);
        System.out.println(s1);
    }

    public static void rectTest() {

        Rect r1 = new Rect(5, 10);
        System.out.println(r1);
    }
}
