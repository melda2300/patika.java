public class Main {
    public static void main( String[] args ) {
        Employee employee = new Employee("Ali Veli", 6000, 45, 2015);

        System.out.println("Çalışan bilgileri: " + employee.toString());

        System.out.println("Vergi: " + employee.tax() + " TL");

        System.out.println("Bonus: " + employee.bonus() + " TL");

        employee.raiseSalary();

        System.out.println("Yeni maaş: " + employee.getSalary() + " TL");

    }
}