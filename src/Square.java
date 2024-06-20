public class Square {

    private int side1;

    public Square(int side1) {

        setSide1(side1);
    }

    public int getSide1() {
        return side1;
    }

    public void setSide1(int side) {

        this.side1 = side;
    }

    public int getPer() {

        return getSide1() * 4;
    }

    public int getArea() {

        return getSide1() * getSide1();
    }

    @Override
    public String toString() {

        return "Square with side " + getSide1() + " has perimeter " + getPer() + " and area " + getArea();
    }
}
