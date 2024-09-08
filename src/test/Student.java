
package test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Student {
    private String id;
    private String fullName;
    private float GPA;
    private Date dateOfBirth;
    private String major;
    public Student() {
    }
    public Student(String id, String fullName, float GPA, Date dateOfBirth, String major) {
        this.id = id;
        this.fullName = fullName;
        this.GPA = GPA;
        this.dateOfBirth = dateOfBirth;
        this.major = major;
    }
    public void enterStudentInfo() {
        Scanner scanner = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        System.out.print("Enter ID: ");
        this.id = scanner.nextLine();
        System.out.print("Enter Full Name: ");
        this.fullName = scanner.nextLine();
        System.out.print("Enter GPA: ");
        this.GPA = scanner.nextFloat();
        scanner.nextLine();
        System.out.print("Enter Date of Birth (dd/MM/yyyy): ");
        String dateString = scanner.nextLine();
        try {
            this.dateOfBirth = sdf.parse(dateString);
        } catch (ParseException e) {
            System.out.println("Invalid date format. Setting date of birth to null.");
            this.dateOfBirth = null;
        }
        System.out.print("Enter Major: ");
        this.major = scanner.nextLine();
    }
        @Override
    public String toString() {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        String dobString = (dateOfBirth != null) ? sdf.format(dateOfBirth) : "N/A";
        return "Student{" +
               "ID='" + id + '\'' +
               ", Full Name='" + fullName + '\'' +
               ", GPA=" + GPA +
               ", Date of Birth=" + dobString +
               ", Major='" + major + '\'' +
               '}';
    }
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public String getFullName() {
        return fullName;
    }
    public void setFullName(String fullName) {
        this.fullName = fullName;
    }
    public float getGPA() {
        return GPA;
    }
    public void setGPA(float GPA) {
        this.GPA = GPA;
    }
    public Date getDateOfBirth() {
        return dateOfBirth;
    }
    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }
    public String getMajor() {
        return major;
    }
    public void setMajor(String major) {
        this.major = major;
    }
    public static void main(String[] args) {
        Student student = new Student();
        student.enterStudentInfo(); 
        System.out.println(student.toString()); 
    }
}
