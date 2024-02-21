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


    public void addBulexamnote( int matamatik, int fizik, int kimya, int biyoloji ) {
        if (matamatik >= 0 && matamatik <= 100) {
            this.matamatik.note = matamatik;
        }
        if (biyoloji >= 0 && biyoloji <= 100) {
            this.biyoloji.note = biyoloji;
        }
        if (fizik >= 0 && fizik <= 100) {
            this.fizik.note = fizik;
        }

        if (kimya >= 0 && kimya <= 100) {
            this.kimya.note = kimya;
        }
    }

    public void isPass() {
        if (this.matamatik.note == 0 || this.fizik.note == 0 || this.kimya.note == 0 ||this.biyoloji.note==0) {
            System.out.println("Notlar tam olarak girilmemiş");
        } else {
            this.isPass = isCheckPass();
            printNote();
            System.out.println("Ortalama : " + this.avarage);
            if (this.isPass) {
                System.out.println("Sınıfı Geçti. ");
            } else {
                System.out.println("Sınıfta Kaldı.");
            }
        }
    }

    public void calcAvarage() {
        this.avarage = (double) (this.fizik.note + this.kimya.note + this.matamatik.note + this.biyoloji.note) / 4;
    }

    public boolean isCheckPass() {
        calcAvarage();
        return this.avarage > 60;
    }

    public void printNote(){
        System.out.println("======================================");
        System.out.println("Öğrenci : " + this.name);
        System.out.println("Matematik Notu : " + this.matamatik.note);
        System.out.println("Fizik Notu : " + this.fizik.note);
        System.out.println("Kimya Notu : " + this.kimya.note);
        System.out.println("biyoloji notu : "+ this.biyoloji.note);
        System.out.println("======================================");
    }
}