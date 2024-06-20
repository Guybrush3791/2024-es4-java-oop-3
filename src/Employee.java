public class Employee extends Person {

    // private String name;
    // private String lastname;
    private int wage;

    public Employee(String name, String lastname, int wage) {

        super(name, lastname);

        setWage(wage);
    }

    public int getWage() {

        return wage;
    }

    public void setWage(int wage) {

        this.wage = wage;
    }

    public int getYearSalary() {

        return getWage() * 13;
    }

    @Override
    public String toString() {

        return super.toString() + " - year salary: " + getYearSalary();
    }
}
