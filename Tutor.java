public class Tutor extends Teacher //A class named Tutor that inherits properties from it's parent class Teacher
{
    //Attributes of class Tutor
    private double salary;
    private String specialization;
    private String academicQualification;
    private int performanceIndex;
    private boolean isCertified;

    //Constructor having ten parameters
    public Tutor(int teacherId,String teacherName,String address,String workingType, String employmentStatus, int workingHours, double salary,String specialization,String academicQualification,int performanceIndex){
        //Super class constructor with five parameters
        super(teacherId,teacherName,address,workingType,employmentStatus);

        //Calling Setter Method from Parent Class for workingHours
        super.setWorkingHours(workingHours);

        //Declaring instance variables
        this.salary=salary;
        this.specialization=specialization;
        this.performanceIndex=performanceIndex;
        this.academicQualification=academicQualification;
        this.isCertified= false;
    }

    //Accessor/Getter method for salary
    public double getSalary(){
        return this.salary;
    }

    //Accessor/Getter method for specialization
    public String getSpecialization(){
        return this.specialization;
    }

    //Accessor/Getter method for performanceIndex
    public int getPerformanceIndex(){
        return this.performanceIndex;
    }

    //Accessor/Getter method for academicQualification
    public String getAcademicQualification(){
        return this.academicQualification;
    }

    //Accessor/Getter method for isCertified
    public boolean isCertified(){
        return this.isCertified;
    }

    //Setter Method for salary
    public void setSalary(double newSalary,int newPerformanceIndex){
        if(newPerformanceIndex>5 && getWorkingHours()>20){
            double appraisal=0.0;
            if(newPerformanceIndex>=5 && newPerformanceIndex<=7){
                appraisal=0.05;
            }
            else if(newPerformanceIndex==8 || newPerformanceIndex==9){
                appraisal=0.10;
            }
            else {
                appraisal=0.20;
            }
            this.salary=newSalary+(appraisal*newSalary);
            this.performanceIndex=newPerformanceIndex;
            this.isCertified=true;
            newSalary=this.salary;
        }
        else
        {
            System.out.println("Salary can't be approved");
        }
    }

    //method to remove tutor
    public void removeTutor(){
        if(!isCertified){
            this.salary=0.0;
            this.specialization="";
            this.academicQualification="";
            this.performanceIndex=0;
            this.isCertified= false;
        }
        else{
            System.out.println("Tutor is certified and thus cannot be removed");
        }

    }

    //method overriding
    @Override
    public void display(){
        super.display();
        if(this.isCertified){
            System.out.println("Salary="+this.salary);
            System.out.println("Specialization="+this.specialization);
            System.out.println("Academic Qualification="+this.academicQualification);
            System.out.println("Performance Index="+this.performanceIndex);
        }
    }
}

