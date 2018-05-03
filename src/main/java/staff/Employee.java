package staff;

public abstract class Employee {

    private String name;
    private int niNmunber;
    private double salary;

    public Employee(String name, int niNmunber, double salary) {
        this.name = name;
        this.niNmunber = niNmunber;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public int getNiNmunber() {
        return niNmunber;
    }

    public double getSalary() {
        return salary;
    }

    public void raiseSalary(double increase){
        this.salary += increase;
    }

    public double payBonus(){
        double bonus = 0;
        bonus = (this.salary/100);
        return bonus;
    }

}
