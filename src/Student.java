public class Student {
    String name, stuNo;
    int classes;
    Course matamatik;
    Course kimya;
    Course fizik;
    Course biyoloji;
    double avarage;
    boolean isPass;

    Student( String name, int classes, String stuNo, Course matamatik, Course fizik, Course kimya, Course biyoloji, boolean isPass ) {
        this.name = name;
        this.classes = classes;
        this.stuNo = stuNo;
        this.matamatik = matamatik;
        this.biyoloji = biyoloji;
        this.fizik = fizik;
        this.kimya = kimya;
        this.isPass = false;
    }

}
