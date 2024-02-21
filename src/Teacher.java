public class Teacher {
    String name;
    int phoneNumber;
    String branch;

    public Teacher( String name, String branch, int phoneNumber ) {
        this.name = name;
        this.branch = branch;
        this.phoneNumber = phoneNumber;
    }

    public String getName() {
        return name;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }


    public String getBranch() {
        return branch;
    }
}
