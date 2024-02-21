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

    public String getName() {
        return name;
    }

    public void setName( String name ) {
        this.name = name;
    }

    public String getStuNo() {
        return stuNo;
    }

    public void setStuNo( String stuNo ) {
        this.stuNo = stuNo;
    }

    public int getClasses() {
        return classes;
    }

    public void setClasses( int classes ) {
        this.classes = classes;
    }

    public Course getMatamatik() {
        return matamatik;
    }

    public void setMatamatik( Course matamatik ) {
        this.matamatik = matamatik;
    }

    public Course getKimya() {
        return kimya;
    }

    public void setKimya( Course kimya ) {
        this.kimya = kimya;
    }

    public Course getFizik() {
        return fizik;
    }

    public void setFizik( Course fizik ) {
        this.fizik = fizik;
    }

    public Course getBiyoloji() {
        return biyoloji;
    }

    public void setBiyoloji( Course biyoloji ) {
        this.biyoloji = biyoloji;
    }

    public double getAvarage() {
        return avarage;
    }

    public void setAvarage( double avarage ) {
        this.avarage = avarage;
    }

    public boolean isPass() {
        return isPass;
    }

    public void setPass( boolean pass ) {
        isPass = pass;
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
}