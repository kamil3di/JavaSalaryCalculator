public class Employee {
    private String name;
    private int salary;
    private int workHours;
    private int hireYear;

    public Employee(String name, int salary, int workHours, int hireYear) {
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getWorkHours() {
        return workHours;
    }

    public void setWorkHours(int workHours) {
        this.workHours = workHours;
    }

    public int getHireYear() {
        return hireYear;
    }

    public void setHireYear(int hireYear) {
        this.hireYear = hireYear;
    }

    public double tax(){
        if (salary > 1000){
            return this.salary * 0.03;
        }
        return 0;
    }

    public double bonus(){
        if (this.workHours > 40) {
            return (this.workHours-40)*30;
        }
        return 0;
    }

    public double raiseSalary(){
        int currentYear = 2021;
        if (currentYear-this.hireYear < 10){
            return this.salary * 0.05;
        }
        else if(currentYear-this.hireYear < 20 && currentYear-this.hireYear > 9){
            return this.salary * 0.10;
        }
        return this.salary * 0.15;
    }

    public String toString(){
        return "Name:" + this.name + "\n" +
                "Salary:" + this.salary + "\n" +
                "Work hours:" + this.workHours + "\n" +
                "Hire year:" + this.hireYear + "\n" +
                "Tax:" + this.tax() + "\n" +
                "Bonus:" + this.bonus() + "\n" +
                "Raise salary:" + this.raiseSalary() + "\n" +
                "Tax and bonus added salary:" + (this.bonus()-this.tax()+this.salary) + "\n" +
                "Total salary:" + (this.bonus()-this.tax()+this.salary+this.raiseSalary());
    }
}