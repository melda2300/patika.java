
public class zoo {
    public static void main( String[] args ) {

        // hayvanları oluştur
        HoofedAnimal at = new HoofedAnimal("at", 500.0, 5);
        Felidae kaplan = new Felidae("kaplan", 150.0, 3);
        Reptile yilan = new Reptile("yılan", 10.0, 1);

        // dosajı ve yem verme zamanlamasını yazdır
        System.out.println("At dosajı: " + at.getDosage());
        System.out.println("At yem verme zamanlaması: " + at.getFeedSchedule());
        System.out.println("Kaplan dosajı: " + kaplan.getDosage());
        System.out.println("Kaplan yem verme zamanlaması: " + kaplan.getFeedSchedule());
        System.out.println("Yılan dosajı: " + yilan.getDosage());
        System.out.println("Yılan yem verme zamanlaması: " + yilan.getFeedSchedule());

    }
}