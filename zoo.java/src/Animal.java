public abstract class Animal {
    private String name;
    private double weight;
    private int age;

    public Animal(String name, double weight, int age) {
        this.name = name;
        this.weight = weight;
        this.age = age;
    }

    public abstract double getDosage();

    public abstract String getFeedSchedule();

    // getters and setters for name, weight, and age

    public double getWeight() {
        return weight;
    }

    public void setWeight( double weight ) {
        this.weight = weight;
    }

}

