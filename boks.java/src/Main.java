public class Main {
    public static void main( String[] args ) {
        Fighter ali = new Fighter("Ali" , 15 , 100, 90, 0);
        Fighter ata = new Fighter("Ata" , 10 , 95, 100, 0);
        Ring r = new Ring(ali,ata , 90 , 100);
        r.run();

    }
}