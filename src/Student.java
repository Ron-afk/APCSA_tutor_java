public class Student {
    // field to define data type and variable name to store related data
    public int stuID;
    public String lastName;
    public String firsName;
    public int grade;
    public String gender;

    // constructor
    public Student(String lastName, String firstName){
        this.firsName = firstName;
        this.lastName = lastName;
    }

    // Methods
    public void setStuID(int stuID){
        this.stuID = stuID;
    }
    public void setGrade(int grade){
        this.grade = grade;
    }
    public void setGender(String gender){
        this.gender = gender;
    }

}
