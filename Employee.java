public class Employee {
    private String name;
    private double salary;
    private int workHours;
    private int hireYear;

    public Employee(String name, double salary, int workHours, int hireYear) {
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }

    public double tax() {
        if (salary <= 1000) {
            return 0;
        } else {
            return salary * 0.03;
        }
    }

    public double bonus() {
        if (workHours > 40) {
            return (workHours - 40) * 30;
        } else {
            return 0;
        }
    }

    public void raiseSalary() {
        int currentYear = 2021;
        int yearsOfService = currentYear - hireYear;

        if (yearsOfService < 10) {
            salary += salary * 0.05;
        } else if (yearsOfService >= 10 && yearsOfService < 20) {
            salary += salary * 0.10;
        } else if (yearsOfService >= 20) {
            salary += salary * 0.15;
        }
    }

    @Override
  public String toString() {
    return "Çalışan{" +
            "isim='" + name + '\'' +
            ", maaş=" + salary +
            ", çalışma saatleri=" + workHours +
            ", işe başlangıç yılı=" + hireYear +
            '}';
    }
}
