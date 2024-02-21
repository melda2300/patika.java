public class Main {
    public static void main( String[] args ) {
        Course matamatk = new Course("Matematik", "MAT101", "MAT");
        Course fizik = new Course("Fizik", "FZK101", "FZK");
        Course kimya = new Course("Kimya", "KMY101", "KMY");
        Course biyoloji=new Course("Biyoloji","BYJ101","BYJ");
        
        Student s1 = new Student("İnek Şaban", 4, "140144015", matamatk, fizik, kimya, biyoloji);
        s1.addBulexamnote(50, 20, 40, 50);
        s1.isPass();

        Student s2 = new Student("Güdük Necmi", 4, "2211133", matamatk, fizik, kimya, biyoloji);
        s2.addBulexamnote(100, 50, 40,30);
        s2.isPass();

        Student s3 = new Student("Hayta İsmail", 4, "221121312", matamatk, fizik, kimya, biyoloji);
        s3.addBulexamnote(50, 20, 40, 66);
        s3.isPass();
    }
}
