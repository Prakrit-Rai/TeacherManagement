public class Teacher {
    // Attributes of class Teacher
    private int teacherId;
    private String teacherName;
    private String address;
    private String workingType;
    private String employmentStatus;
    private int workingHours;

    // Constructor having 5 parameters
    public Teacher(int teacherId, String teacherName, String address, String workingType, String employmentStatus) {
        // Initializing instance variables
        this.teacherId = teacherId;
        this.teacherName = teacherName;
        this.address = address;
        this.workingType = workingType;
        this.employmentStatus = employmentStatus;
    }

    // Accessor/Getter Method for teacherId
    public int getTeacherID() {
        return this.teacherId;
    }

    // Accessor/Getter Method for teacherName
    public String getTeacherName() {
        return this.teacherName;
    }

    // Accessor/Getter Method for address
    public String getAddress() {
        return this.address;
    }

    // Accessor/Getter Method for workingType
    public String getWorkingType() {
        return this.workingType;
    }

    // Accessor/Getter Method for employmentStatus
    public String getEmploymentStatus() {
        return this.employmentStatus;
    }

    // Accessor/Getter Method for workingHours
    public int getWorkingHours() {
        return this.workingHours;
    }

    // Mutator/Setter Method for workingHours
    public void setWorkingHours(int workingHours) {
        this.workingHours = workingHours;
    }

    // Method to display teacherId, teacherName, address, workingType, employmentStatus, and workingHours
    public void display() {
        System.out.println("Teacher ID = " + teacherId);
        System.out.println("Teacher Name = " + teacherName);
        System.out.println("Address = " + address);
        System.out.println("Working Type = " + workingType);
        System.out.println("Employment Status = " + employmentStatus);

        if (getWorkingHours() > 0) {
            System.out.println("Working Hours = " + workingHours);
        } else {
            System.out.println("Working Hours is not specified");
        }
    }
}
