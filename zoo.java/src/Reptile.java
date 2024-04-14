public class Reptile extends Animal {
    public Reptile(String name, double weight, int age) {
        super(name, weight, age);
    }

    @Override
    public double getDosage() {
        // implementation for reptile animals
        return 0;
    }

    @Override
    public String getFeedSchedule() {
        // implementation for reptile animals
        return "";
    }
}