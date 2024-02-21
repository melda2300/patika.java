public class Course {
    Teacher courseTeacher;
    String name;
    String code;
    String prefix;
    int note;

    public Course( String name, String code, String prefix, int note ) {
        this.name = name;
        this.code = code;
        this.prefix = prefix;
        this.note = note;
    }

    public Teacher getCourseTeacher() {
        return courseTeacher;
    }

    public void setCourseTeacher( Teacher courseTeacher ) {
        this.courseTeacher = courseTeacher;
    }

    public String getName() {
        return name;
    }

    public void setName( String name ) {
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public String getPrefix() {
        return prefix;
    }

    public int getNote() {
        return note;
    }


    public void addTeacher( Teacher t ) {
        if (this.prefix.equals(t.branch)) {
            this.courseTeacher = t;
            System.out.println("İşlem başarılı .");
        } else {
            System.out.println(t.name + " akademisyen bu dersi veremez");
        }

    }
}
