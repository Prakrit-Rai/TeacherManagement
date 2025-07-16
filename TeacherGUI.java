import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import java.awt.Color;
import java.awt.Font;
import java.util.ArrayList;

public class TeacherGUI {

    private JFrame frame;
    private JPanel lecturerPanel, tutorPanel,gradeassig,setsalary;
    private JLabel lecturerLb,teacherIdLb1, teacherIdLb2, tutorLb,salaryLb1, teacherIdLb, teacherNameLb, addressLb, workingTypeLb, employmentStatusLb,
            workingHoursLb, departmentLb,performanceIndexLb1, yearsOfExperienceLb, gradedScoreLb, salaryLb, specializationLb,gradeAssignmentLb,
            academicQualificationLb,workingHoursTextLb, performanceIndexLb,teacherIdLb5;
    private JTextField teacherIdText,teacherIdText1,teacherIdText2, teacherNameText, addressText, workingTypeText, employmentStatusText,
            workingHoursText,departmentText,departmentText1,salaryText1, yearsOfExperienceText,yearsOfExperienceText1, gradedScoreText, teacherIdTextTut, teacherNameTextTut,
            employmentStatusTextTut,performanceIndexText1, addressTextTut, workingHoursTextTut, salaryTextTut, specializationTextTut, academicQualificationTextTut,
            workingTypeTextTut, performanceIndexTextTut,teacherIdTextTut5;
    private JButton addLecturerBtn, addTutorBtn, gradeAssignmentBtn, setSalaryBtn, removeTutorBtn, displayBtn, clearBtn;

    private ArrayList<Teacher> teacher ;

    public TeacherGUI() {
        teacher=new ArrayList<>();

        // Creating frame for the GUI
        frame = new JFrame("TeacherGUI");
        frame.setSize(1500, 650);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);
        frame.setLocationRelativeTo(null);

        // Creating panel for lecturer,
        lecturerPanel = new JPanel();
        lecturerPanel.setBounds(20, 20, 500, 500);
        lecturerPanel.setBackground(new Color(187, 119, 246));
        lecturerPanel.setLayout(null);
        frame.add(lecturerPanel);

        // Creating label for lecturer
        lecturerLb = new JLabel("Lecturer");
        lecturerLb.setBounds(100, 10, 200, 20);
        lecturerLb.setFont(new Font("Arial", Font.BOLD, 20));
        lecturerPanel.add(lecturerLb);

        // Creating label for TeacherId
        teacherIdLb = new JLabel("Teacher Id: ");
        teacherIdLb.setBounds(30, 50, 100, 20);
        lecturerPanel.add(teacherIdLb);

        // Creating textfield for TeacherId
        teacherIdText = new JTextField();
        teacherIdText.setBounds(170, 50, 120, 20);
        lecturerPanel.add(teacherIdText);

        // Creating label for Teacher Name
        teacherNameLb = new JLabel("Teacher Name: ");
        teacherNameLb.setBounds(30, 80, 100, 20);
        lecturerPanel.add(teacherNameLb);

        // Creating textfield for Teacher Name
        teacherNameText = new JTextField();
        teacherNameText.setBounds(170, 80, 120, 20);
        lecturerPanel.add(teacherNameText);

        // Creating label for Address
        addressLb = new JLabel("Address: ");
        addressLb.setBounds(30, 110, 100, 20);
        lecturerPanel.add(addressLb);

        // Creating textfield for Address
        addressText = new JTextField();
        addressText.setBounds(170, 110, 120, 20);
        lecturerPanel.add(addressText);

        // Creating label for Working Type
        workingTypeLb = new JLabel("Working Type: ");
        workingTypeLb.setBounds(30, 140, 100, 20);
        lecturerPanel.add(workingTypeLb);

        // Creating textfield for Working Type
        workingTypeText = new JTextField();
        workingTypeText.setBounds(170, 140, 120, 20);
        lecturerPanel.add(workingTypeText);

        // Creating label for Employment Status
        employmentStatusLb = new JLabel("Employment Status: ");
        employmentStatusLb.setBounds(30, 170, 140, 20);
        lecturerPanel.add(employmentStatusLb);

        // Creating textfield for Employment Stauts
        employmentStatusText = new JTextField();
        employmentStatusText.setBounds(170, 170, 120, 20);
        lecturerPanel.add(employmentStatusText);

        // Creating label for Working Hours
        workingHoursLb = new JLabel("Working Hours: ");
        workingHoursLb.setBounds(30, 200, 120, 20);
        lecturerPanel.add(workingHoursLb);

        // Creating textfield for Working Hours
        workingHoursText = new JTextField();
        workingHoursText.setBounds(170, 200, 120, 20);
        lecturerPanel.add(workingHoursText);

        // Creating label for Department
        departmentLb = new JLabel("Department: ");
        departmentLb.setBounds(30, 230, 100, 20);
        lecturerPanel.add(departmentLb);

        // Creating textfield for Department
        departmentText = new JTextField();
        departmentText.setBounds(170, 230, 120, 20);
        lecturerPanel.add(departmentText);

        // Creating label for Years Of Experience
        yearsOfExperienceLb = new JLabel("Years Of Experience: ");
        yearsOfExperienceLb.setBounds(30, 260, 135, 20);
        lecturerPanel.add(yearsOfExperienceLb);

        // Creating textfield for Years Of Experience
        yearsOfExperienceText = new JTextField();
        yearsOfExperienceText.setBounds(170, 260, 120, 20);
        lecturerPanel.add(yearsOfExperienceText);

        /*
         * Creating addLecturer button which will input the values in array list of Teacher class when clicked
         */
        addLecturerBtn = new JButton("Add Lecturer");
        addLecturerBtn.setBounds(50, 360, 210, 30);
        addLecturerBtn.addActionListener(event -> {
            addLecturer();
        });
        lecturerPanel.add(addLecturerBtn);

        // creating separate panel for Tutor
        tutorPanel = new JPanel();
        tutorPanel.setBounds(1000, 20, 400, 500);
        tutorPanel.setBackground(new Color(255,223,186));
        tutorPanel.setLayout(null);
        frame.add(tutorPanel);

        // Creating label for tutor
        tutorLb = new JLabel("Tutor");
        tutorLb.setBounds(100, 10, 100, 20);
        tutorLb.setFont(new Font("Arial", Font.BOLD, 20));
        tutorPanel.add(tutorLb);

        // Creating label for TeacherId
        teacherIdLb = new JLabel("Teacher id: ");
        teacherIdLb.setBounds(30, 50, 100, 20);
        tutorPanel.add(teacherIdLb);

        // Creatin textfield for TeacherId
        teacherIdTextTut = new JTextField();
        teacherIdTextTut.setBounds(190, 50, 100, 20);
        tutorPanel.add(teacherIdTextTut);

        // Creating label for Teacher Name
        teacherNameLb = new JLabel("Teacher Name: ");
        teacherNameLb.setBounds(30, 80, 100, 20);
        tutorPanel.add(teacherNameLb);

        // Creating textfield for Teacher Name
        teacherNameTextTut = new JTextField();
        teacherNameTextTut.setBounds(190, 80, 100, 20);
        tutorPanel.add(teacherNameTextTut);

        // Creating label for Address
        addressLb = new JLabel("Address: ");
        addressLb.setBounds(30, 110, 100, 20);
        tutorPanel.add(addressLb);

        // Creating textfield for Address
        addressTextTut = new JTextField();
        addressTextTut.setBounds(190, 110, 100, 20);
        tutorPanel.add(addressTextTut);

        // Creating label for Working Type
        workingTypeLb = new JLabel("Working Type: ");
        workingTypeLb.setBounds(30, 140, 100, 20);
        tutorPanel.add(workingTypeLb);

        // Creating textfield for Working Type
        workingTypeTextTut = new JTextField();
        workingTypeTextTut.setBounds(190, 140, 100, 20);
        tutorPanel.add(workingTypeTextTut);

        // Creating label for Employment Status
        employmentStatusLb = new JLabel("Employment Status: ");
        employmentStatusLb.setBounds(30, 170, 130, 20);
        tutorPanel.add(employmentStatusLb);

        // Creating textfield for Employment Status
        employmentStatusTextTut = new JTextField();
        employmentStatusTextTut.setBounds(190, 170, 100, 20);
        tutorPanel.add(employmentStatusTextTut);

        // Creating label for Salary
        salaryLb = new JLabel("Salary: ");
        salaryLb.setBounds(30, 200, 100, 20);
        tutorPanel.add(salaryLb);

        // Creating textfield for Salary
        salaryTextTut = new JTextField();
        salaryTextTut.setBounds(190, 200, 100, 20);
        tutorPanel.add(salaryTextTut);

        // Creating label for Specialization
        specializationLb = new JLabel("Specialization: ");
        specializationLb.setBounds(30, 230, 120, 20);
        tutorPanel.add(specializationLb);

        // Creating textfield for Specialization
        specializationTextTut = new JTextField();
        specializationTextTut.setBounds(190, 230, 100, 20);
        tutorPanel.add(specializationTextTut);

        // Creating label for Academic Qualification
        academicQualificationLb = new JLabel("Academic Qualification:");
        academicQualificationLb.setBounds(30, 260, 150, 20);
        tutorPanel.add(academicQualificationLb);

        // Creating textfield for Academic Qualification
        academicQualificationTextTut = new JTextField();
        academicQualificationTextTut.setBounds(190, 260, 100, 20);
        tutorPanel.add(academicQualificationTextTut);

        // Creating label for Performance Index
        performanceIndexLb = new JLabel("Performance Index: ");
        performanceIndexLb.setBounds(30, 290, 130, 20);
        tutorPanel.add(performanceIndexLb);

        // Creating textfield for Performance Index
        performanceIndexTextTut = new JTextField();
        performanceIndexTextTut.setBounds(190, 290, 100, 20);
        tutorPanel.add(performanceIndexTextTut);


        // Creating label for WorkingHours
        workingHoursTextLb = new JLabel("Working Hours: ");
        workingHoursTextLb.setBounds(30, 320, 130, 20);
        tutorPanel.add(workingHoursTextLb);

        // Creating textfield for workinghours
        workingHoursTextTut = new JTextField();
        workingHoursTextTut.setBounds(190, 320, 100, 20);
        tutorPanel.add(workingHoursTextTut);

        /*
         * Creating addTutor button which will input the values in array list of Teacher class when clicked
         */
        addTutorBtn = new JButton("Add Tutor");
        addTutorBtn.setBounds(40, 360, 120, 20);
        addTutorBtn.addActionListener(event -> {
            addTutor();
        });
        tutorPanel.add(addTutorBtn);
   
        // Creating label for TeacherId
        teacherIdLb5 = new JLabel("Teacher id: ");
        teacherIdLb5.setBounds(30, 390, 100, 20);
        tutorPanel.add(teacherIdLb5);

        // Creatin textfield for TeacherId
        teacherIdTextTut5 = new JTextField();
        teacherIdTextTut5.setBounds(190, 390, 100, 20);
        tutorPanel.add(teacherIdTextTut5);

        // Creating remove tutor button
        removeTutorBtn = new JButton("Remove Tutor");
        removeTutorBtn.setBounds(40, 420, 120, 20);
        
        // Making remove tutor functional
        removeTutorBtn.addActionListener(event ->{
            removeTutor();
        });
        tutorPanel.add(removeTutorBtn);

        // Creating clear button
        clearBtn = new JButton("Clear");
        clearBtn.setBounds(780, 550, 110, 40);
        clearBtn.setFont(new Font("Arial", Font.BOLD, 20));
          // Making display button functional 
         clearBtn.addActionListener(e->{
                clear();
         });
        
         frame.add(clearBtn);


        //  Creating seperate panel for grade assignment 

        gradeassig = new JPanel();
        gradeassig.setBounds(530, 20, 450, 255);
        gradeassig.setBackground(new Color(186,255,201));
        gradeassig.setLayout(null);
        frame.add(gradeassig);

        // Creating label for Grade Assignment
        gradeAssignmentLb = new JLabel("Grade Assignment");
        gradeAssignmentLb.setBounds(175, 20, 200, 30);
        gradeAssignmentLb.setFont(new Font("Arial", Font.BOLD, 20));
        gradeassig.add(gradeAssignmentLb);

        // Creating label for Teacher Id
        teacherIdLb1 = new JLabel("Teacher Id: ");
        teacherIdLb1.setBounds(30, 60, 100, 20);
        gradeassig.add(teacherIdLb1);

        // Creating textfield for Teacher Id
        teacherIdText1 = new JTextField();
        teacherIdText1.setBounds(170, 60, 100, 20);
        gradeassig.add(teacherIdText1);

        // Creating label for Graded Score
        gradedScoreLb = new JLabel("Graded Score: ");
        gradedScoreLb.setBounds(30, 90, 100, 20);
        gradeassig.add(gradedScoreLb);

        // Creating textfield for Graded Score
        gradedScoreText = new JTextField();
        gradedScoreText.setBounds(170, 90, 100, 20);
        gradeassig.add(gradedScoreText);

        // Creating label for Department
        departmentLb = new JLabel("Department: ");
        departmentLb.setBounds(30, 120, 100, 20);
        gradeassig.add(departmentLb);
       
         // Creating textfield for Department
        departmentText1 = new JTextField();
        departmentText1.setBounds(170, 120, 100, 20);
        gradeassig.add(departmentText1);
       
         // Creating label for Years Of Experience
        yearsOfExperienceLb = new JLabel("Years Of Experience: ");
        yearsOfExperienceLb.setBounds(30, 150, 135, 20);
        gradeassig.add(yearsOfExperienceLb);
       
        // Creating textfield for Years Of Experience
        yearsOfExperienceText1 = new JTextField();
        yearsOfExperienceText1.setBounds(170, 150, 100, 20);
        gradeassig.add(yearsOfExperienceText1);
    

        // Creating Grade assignment Button
        gradeAssignmentBtn = new JButton("Grade Assignment");
        gradeAssignmentBtn.setBounds(170, 190, 140, 20);
        gradeAssignmentBtn.addActionListener(event -> {
        gradeAssignments();
         });
        gradeassig.add(gradeAssignmentBtn);

        // Creating  Seperate panel for set salary

        setsalary= new JPanel();
        setsalary.setBounds(530,280, 450, 240);
        setsalary.setBackground(new Color(186,255,255));
        setsalary.setLayout(null);
        frame.add(setsalary);
 
        // Creating label for Set Salary
        JLabel setsalarys = new JLabel("Set Salary");
        setsalarys.setBounds(200, 20, 200, 30);
        setsalarys.setFont(new Font("Arial", Font.BOLD, 20));
        setsalary.add(setsalarys);

        // Creating label for Teacher Id
        teacherIdLb2 = new JLabel("Teacher Id: ");
        teacherIdLb2.setBounds(30, 60, 100, 20);
        setsalary.add(teacherIdLb2);

        // Creating textfield for Teacher Id
        teacherIdText2 = new JTextField();
        teacherIdText2.setBounds(170, 60, 100, 20);
        setsalary.add(teacherIdText2);

         // Creating label for Salary
         salaryLb1 = new JLabel("Salary: ");
         salaryLb1.setBounds(30, 90, 100, 20);
         setsalary.add(salaryLb1);
 
         // Creating textfield for Salary
         salaryText1 = new JTextField();
         salaryText1.setBounds(170, 90, 100, 20);
         setsalary.add(salaryText1);

          // Creating label for Performance Index
        performanceIndexLb1 = new JLabel("Performance Index: ");
        performanceIndexLb1.setBounds(30, 120, 130, 20);
        setsalary.add(performanceIndexLb1);

        // Creating textfield for Performance Index
        performanceIndexText1 = new JTextField();
        performanceIndexText1.setBounds(170, 120, 100, 20);
        setsalary.add(performanceIndexText1);



        // Creating set salary Button
        setSalaryBtn = new JButton("Set Salary");
        setSalaryBtn.setBounds(177, 180, 140, 20);
        setSalaryBtn.addActionListener(event -> {
        setSalary();
         });
        setsalary.add(setSalaryBtn);

         // Creating Display button
         displayBtn = new JButton("Display");
         displayBtn.setBounds(650, 550, 110, 40);
         displayBtn.setFont(new Font("Arial", Font.BOLD, 20));
          // Making display button functional 
         displayBtn.addActionListener(e->{
                display();
             
         });
        
         frame.add(displayBtn);
   
        frame.setVisible(true);
    }

        // making addlecturer button functional
        private void addLecturer() {
            if(yearsOfExperienceText.getText().isEmpty() || departmentText.getText().isEmpty() || workingHoursText.getText().isEmpty())
                JOptionPane.showMessageDialog(frame, "Please fill all the fields.");
            else{
            
            try {
                int teacherId = Integer.parseInt(teacherIdText.getText().trim());
                for(Teacher teacher : teacher) {
                    if (teacher.getTeacherID() == teacherId) {
                        JOptionPane.showMessageDialog(frame, "Teacher ID already exists. Please enter a unique Teacher ID.");
                        return;
                    }
                }
                String teacherName = getText(teacherNameText).trim();
                String address = getText(addressText).trim();
                String workingType = getText(workingTypeText).trim();    
                String employmentStatus =   getText(employmentStatusText).trim();
                int yearsOfExperince = Integer.parseInt(yearsOfExperienceText.getText().trim());
                String department = getText(departmentText).trim();
                int workingHours =Integer.parseInt(workingHoursText.getText().trim());

                Lecturer newLecturer= new Lecturer(teacherId,teacherName, address, workingType, employmentStatus, workingHours, department,yearsOfExperince);
                teacher.add(newLecturer);
    
                //  clear the input fields after adding the lecturer
                
    
                JOptionPane.showMessageDialog(frame, "Lecturer added successfully.");
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(frame, "Please enter valid number for Teacher ID, Graded Score, and Years of Experience.");
            }
            catch(IllegalArgumentException ex) {
                JOptionPane.showMessageDialog(frame,"Please fill all fields","Error",JOptionPane.ERROR_MESSAGE);
            }
        }
    }

     // Making addTutor button functional
    private void addTutor() {
        if(salaryTextTut.getText().isEmpty() || academicQualificationTextTut.getText().isEmpty() || performanceIndexTextTut.getText().isEmpty())
            JOptionPane.showMessageDialog(frame, "Please fill all the feilds", "Error", JOptionPane.ERROR_MESSAGE);
            else{
        try
         {
            int teacherId = Integer.parseInt(teacherIdTextTut.getText().trim());
            for(Teacher teacher : teacher) {
                if (teacher.getTeacherID() == teacherId) {
                    JOptionPane.showMessageDialog(frame, "Teacher ID already exists. Please enter a unique Teacher ID.");
                    return;
                }
            }
            
            String teacherName = getText(teacherNameTextTut).trim();
            String address = getText(addressTextTut).trim();
            String workingType = getText(workingTypeTextTut).trim();
            String employmentStatus = getText(employmentStatusTextTut).trim();
            int workingHours = Integer.parseInt(workingHoursTextTut.getText().trim());
            double salary = Double.parseDouble(salaryTextTut.getText().trim());
            String specialization = getText(specializationTextTut).trim();
            String academicQualifications =getText(academicQualificationTextTut).trim();
            int performanceIndex = Integer.parseInt(performanceIndexTextTut.getText().trim());
            Tutor newTutor =new Tutor(teacherId,teacherName, address, workingType, employmentStatus, workingHours, salary, specialization, academicQualifications, performanceIndex);
            teacher.add(newTutor);
            JOptionPane.showMessageDialog(frame, "Tutor added successfully.");

            // clear the input fields after adding the tutor
        
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(frame, "Please enter valid numeric values for Teacher ID, Salary, and Performance Index.");
        }
        catch(IllegalArgumentException ex) {
            JOptionPane.showMessageDialog(frame,"Please fill all the feilds","Error",JOptionPane.ERROR_MESSAGE);
        }
    }
 }
 
  // Making Remove Tutor functional
  private void removeTutor() {
    if(teacherIdTextTut5.getText().isEmpty())
        JOptionPane.showMessageDialog(frame, "Please fill all the feilds", "Error", JOptionPane.ERROR_MESSAGE);
        else{
    try{

        int teacherId = Integer.parseInt(teacherIdTextTut5.getText().trim());

    // Check the entered teacher ID
    boolean checkTeacherId = false;
    for (Teacher teachers : teacher) {
        if (teachers.getTeacherID() == teacherId) {
            checkTeacherId = true;
            // Check if the teacher is a Tutor
            if (teachers instanceof Tutor) {
                Tutor tutor = (Tutor) teachers;
                teacher.remove(tutor);
                
                JOptionPane.showMessageDialog(frame, "Tutor removed successfully.");
            } else {
                JOptionPane.showMessageDialog(frame, "The entered teacher is not a tutor.");
            }
            break;
        }
    }

    // If the teacher ID is not found
    if (!checkTeacherId) {
        JOptionPane.showMessageDialog(frame, "Invalid teacher ID.");
    }
}catch(NumberFormatException fe){
    JOptionPane.showMessageDialog(frame,"Teacher ID must be number","Error",JOptionPane.ERROR_MESSAGE);

}

catch(IllegalArgumentException ex){
    JOptionPane.showMessageDialog(frame,"Teacher ID is empty","Error",JOptionPane.ERROR_MESSAGE);
}
}
}
private void gradeAssignments() {
    if(gradedScoreText.getText().isEmpty() || departmentText1.getText().isEmpty() || yearsOfExperienceText1.getText().isEmpty() || teacherIdText1.getText().isEmpty()){
        JOptionPane.showMessageDialog(frame, "Please fill all the fields", "Error", JOptionPane.ERROR_MESSAGE);
        return;
    }
    
    else{
        
    //check input values
    try{
    int gradedScore = Integer.parseInt(gradedScoreText.getText().trim());
    String department = departmentText1.getText().trim();
    int yearsOfExperience = Integer.parseInt(yearsOfExperienceText1.getText().trim());
    if (  yearsOfExperience < 5 || !department.equals(department)) {
        JOptionPane.showMessageDialog(frame,"Years of experience should be at least 5 or department is not valid.");
        return;
    }
    
  

    // check the entered teacher ID
    boolean checkTeacherId = false;
    for (Teacher teacher : teacher) {
        if (teacher.getTeacherID() == Integer.parseInt(teacherIdText1.getText().trim())) {
            checkTeacherId = true;
            // Check if the teacher is a Lecturer
            if (teacher instanceof Lecturer) {
                Lecturer lecturer = (Lecturer) teacher; 
                // Call the method to grade assignments
                lecturer.gradeAssignment(gradedScore, department, yearsOfExperience);
                
                JOptionPane.showMessageDialog(frame, "Assignment Graded Succesfully");
            } else {
                JOptionPane.showMessageDialog(frame, "Assignment is not Graded ");
            }
            break;
        }
    }

    // If the teacher ID is not found
    if (!checkTeacherId) {
        JOptionPane.showMessageDialog(frame, "Invalid teacher ID.");
    }
}
catch(NumberFormatException ex){
    JOptionPane.showMessageDialog(frame,"Enter a valid Number","Error",JOptionPane.ERROR_MESSAGE);
}
catch(IllegalArgumentException ex) {
    JOptionPane.showMessageDialog(frame," Please fill all the feilds","Error",JOptionPane.ERROR_MESSAGE);
}
}

}


private void setSalary() {
    try{
    // check input values
    int teacherId = Integer.parseInt(teacherIdText2.getText().trim());
    double newSalary = Double.parseDouble(salaryText1.getText().trim());
    int newPerformanceIndex = Integer.parseInt(performanceIndexText1.getText().trim()); 

    

    // check the entered teacher ID
    boolean checkTeacherId = false;
    for (Teacher teacher : teacher) {
        if (teacher.getTeacherID() == teacherId) {
            checkTeacherId = true;
            // Check if the teacher is a Tutor
            if (teacher instanceof Tutor) {
                Tutor tutor = (Tutor) teacher; 
                // Call the method to set the salary
                tutor.setSalary(newSalary, newPerformanceIndex);
                
               
  
                // Display information dialog with new salary and performance index
                String message = "Salary: " + newSalary + "\n"
                        + "Performance Index: " + newPerformanceIndex;
                JOptionPane.showMessageDialog(null, message, "New Salary and Performance Index", JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(frame, "The entered teacher is not a tutor.");
            }
            break;
        }
    }

    // If the teacher ID is not found
    if (!checkTeacherId) {
        JOptionPane.showMessageDialog(frame, "Invalid teacher ID.");
    }
    
}
catch(IllegalArgumentException ex){
    JOptionPane.showMessageDialog(frame,"Salary is empty","Error",JOptionPane.ERROR_MESSAGE);
}
}
private void display() {
int size = teacher.size();
if(size ==0)
{
    JOptionPane.showMessageDialog(frame, "No Lecturer or Tutor is  found.", "Error", JOptionPane.ERROR_MESSAGE);
    return;
}
for(Teacher teacher : teacher)
{
    try{
        Lecturer lecturer = (Lecturer) teacher;
        System.out.println("Lecturer Details: \n");
        lecturer.display();
    }
    catch(ClassCastException ex){
        System.out.println("Tutor Details: \n");
        Tutor tutor = (Tutor) teacher;
        tutor.display();
    }

}

}

   
public String getText(JTextField f)
{
    String text = f.getText().trim();
    if(text.isEmpty())
    {
        throw new IllegalArgumentException();
    }
    return text;
}

  
private void clear(){
    teacherIdTextTut.setText("");
    salaryTextTut.setText("");
    performanceIndexTextTut.setText("");
    teacherIdText.setText("");
    teacherNameText.setText("");
    addressText.setText("");
    workingHoursText.setText("");
    workingTypeText.setText("");
    employmentStatusText.setText("");
    departmentText.setText("");
    yearsOfExperienceText.setText("");
    gradedScoreText.setText("");
    teacherNameTextTut.setText("");
    addressTextTut.setText("");
    workingHoursTextTut.setText("");
    workingTypeTextTut.setText("");
    employmentStatusTextTut.setText("");
    salaryTextTut.setText("");
    performanceIndexTextTut.setText("");
    teacherIdText1.setText("");
    departmentText1.setText("");
    yearsOfExperienceText1.setText("");
    teacherIdText2.setText("");
    salaryText1.setText("");
    performanceIndexText1.setText("");
    academicQualificationTextTut.setText("");
    specializationTextTut.setText("");

}

    public static void main(String[] args) {
        new TeacherGUI();
    }
}
