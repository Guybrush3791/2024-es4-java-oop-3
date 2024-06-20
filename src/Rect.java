public class Rect extends Square {

    // private int side1;
    private int side2;

    public Rect(int side1, int side2) {

        super(side1);

        // setSide1(side1);
        setSide2(side2);
    }

    // public int getSide1() {
    // return side1;
    // }

    // public void setSide1(int side1) {
    // this.side1 = side1;
    // }

    public int getSide2() {
        return side2;
    }

    public void setSide2(int side2) {

        this.side2 = side2;
    }

    @Override
    public int getPer() {

        return (getSide1() + getSide2()) * 2;
    }

    @Override
    public int getArea() {

        return getSide1() * getSide2();
    }

    @Override
    public String toString() {

        return "Rectangle with sides " + getSide1() + " and " + getSide2() + " has perimeter " + super.getPer()
                + " and area "
                + getArea();
    }
}
