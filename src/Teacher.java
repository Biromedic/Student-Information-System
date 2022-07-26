public class Teacher
{
    String name;
    String phoneNumber;
    String branch;

    public Teacher(String name, String phoneNumber, String branch) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.branch = branch;
    }

    public void printFeatures()
    {
        System.out.println("the name of the teacher is: " + getName());
        System.out.println("the Phone Number of the teacher is: " + getPhoneNumber());
        System.out.println("the Branch of the teacher is: " + getBranch());
    }

    public Teacher() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getBranch() {
        return branch;
    }

    public void setBranch(String branch) {
        this.branch = branch;
    }
}

