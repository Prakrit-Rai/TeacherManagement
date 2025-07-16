public class Lecturer extends Teacher //A class named Lecturer that inherits properties from it's parent class Teacher
{
    //Attributes of class Lecturer
    private String department;
    private int YearsOfExperience;
    private int gradedScore;
    private boolean hasGraded;
    String result;

    //Constructor having seven parameters
    public Lecturer(int teacherId,String teacherName,String address,String workingType,String employmentStatus,int workingHours,String department,int YearsOfExperience){
        //super class constructor having five parameters
        super(teacherId,teacherName,address,workingType,employmentStatus);

        //Calling setter method from parent class
        super.setWorkingHours(workingHours);

        //Declaring instance variables
        this.department=department;
        this.gradedScore=0;
        this.YearsOfExperience = YearsOfExperience;
        this.hasGraded = false;
    }

    //Accessor/Getter method for the Department
    public String getDepartment(){
        return this.department;
    }

    //Accessor/Getter method for the YearsOfExperience
    public int getYearsOfExperience(){
        return this.YearsOfExperience;
    }

    //Accessor/Getter method for the gradedScore
    public int getGradedScore(){
        return this.gradedScore;
    }

    //Accessor/Getter method for the hasGraded
    public boolean hasGraded(){
        return this.hasGraded;
    }

    //Mutator/Setter method for gradedScore
    public void setGradedScore(int gradedScore){
        this.gradedScore=gradedScore;
    }

    //Method which grades the assignment of students
    public void gradeAssignment(int gradedScore, String Department, int YearsOfExperience){
        if(YearsOfExperience>=5 && department==this.department){
            setGradedScore(gradedScore);
            if(gradedScore>=70){
                this.result="A";
            }
            else if(gradedScore>=60){
                this.result="B";
            }
            else if(gradedScore>=50){
                this.result="C";
            }
            else if(gradedScore>=40){
                this.result="D";
            }
            else{
                this.result="E";
            }
            hasGraded=true;
        }
        else{
            System.out.println("not graded yet by the lecturer");
        }
    }

    //method overriding
    @Override
    public void display(){
        super.display();  //calling display method of parent class
        System.out.println("Department"+department);
        System.out.println("Years of Experience"+YearsOfExperience);
        if(hasGraded){
            System.out.println("Graded Score"+this.result);
        }
        else{
            System.out.println("Has not been graded yet");
        }
    }
}