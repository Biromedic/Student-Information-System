public class Course
{
    Teacher teacher;
    String name;
    String code;
    String prefix;
    int note;

    public Course(Teacher teacher, String name, String code, String prefix, int note) {
        this.teacher = teacher;
        this.name = name;
        this.code = code;
        this.prefix = prefix;
        this.note = note;
    }

    public Course() {
    }


    public void addTeacher(Teacher teacher1)
    {
        if (getPrefix().equals(teacher1.branch))
        {
            setTeacher(teacher1);
            System.out.println("The operation is successful");
        }
        else
        {
            System.out.println(teacher1.getName() + " cannot give the class.");
        }
    }
    public void printTeacher()
    {
        if(getTeacher() != null)
        {
            System.out.println("The teacher of " + getName() +  " is "  + getTeacher());
        }
        else{
            System.out.println( getName() + ": For this lesson any teacher has not gotten it yet.");
        }
    }



    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getPrefix() {
        return prefix;
    }

    public void setPrefix(String prefix) {
        this.prefix = prefix;
    }

    public int getNote() {
        return note;
    }

    public void setNote(int note) {
        this.note = note;
    }
}
