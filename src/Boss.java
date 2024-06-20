public class Boss extends Employee {

    // private String name;
    // private String lastname;
    // private int wage;

    private int bonus;

    public Boss(
            String name, String lastname,
            int wage, int bonus) {

        super(name, lastname, wage);

        setBonus(bonus);
    }

    public int getBonus() {

        return bonus;
    }

    public void setBonus(int bonus) {

        this.bonus = bonus;
    }

    @Override
    public int getYearSalary() {

        return getWage() * 12 + getBonus();
    }
}
