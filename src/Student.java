public class Student {
    String name, studentNo;
    Course math;
    Course physics;
    Course chemistry;
    boolean isPass;
    double average;
        


    public Student(String name, String studentNo, Course math, Course physics, Course chemistry, boolean isPass, double avarage) {
        this.name = name;
        this.studentNo = studentNo;
        this.math = math;
        this.physics = physics;
        this.chemistry = chemistry;
        this.isPass = false;
        this.average = avarage;
    }

    public Student() {
    }

    public void addBulkExamNote(int math, int physics, int chemsitry)
    {
        if (math <=100 && math >=0)
        {
            this.math.note = math;
        }
        if (physics <=100 && physics >=0)
        {
        this.physics.note = physics;
        }
        if (chemsitry <=100 && chemsitry >= 0)
        {
            this.chemistry.note = chemsitry;
        }
    }

    public void isPass()
    {
        if (this.chemistry.note == 0 || this.math.note == 0 || this.physics.note == 0)
        {
            System.out.println("The grades have not entered the system yet.");
        }
        else
        {
            this.isPass = checkIsPass();
            printNotes();
            System.out.println("The avarage  is  ->  " + this.average);
            if (this.isPass)
            {
                System.out.println("You have been passed.");
            }
            else
            {
                System.out.println("Sorry. You have been failed.");
            }
        }
    }
    
    public void calcAverage()
    {
        this.average = (this.physics.note + this.chemistry.note + this.math.note) / 3 ;
    }
    private void printNotes()
    {
        System.out.println("  ====================== THE NOTES ======================       ");
        System.out.println("Student Name :  " + this.name);
        System.out.println("Math ->  " +this.math.note);
        System.out.println("Physics ->  " + this.physics.note);
        System.out.println("Chemistry -> " + this.chemistry.note);
    }

    
    private boolean checkIsPass()
    {
        calcAverage();
        return this.average > 65;
    }


}