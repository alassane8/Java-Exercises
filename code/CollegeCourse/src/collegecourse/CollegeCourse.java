/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package collegecourse;

public class CollegeCourse {
    protected String department;
    protected int courseNumber;
    protected int credit;
    protected int feeCourse;
    
    protected CollegeCourse(String dept, int cn, int cred){
        department = dept;
        courseNumber = cn;
        credit = cred;
        feeCourse = credit * 120;
    }
    
    protected void display(){
        System.out.println("\nCOLLEGE COURSE DATAs  : ");
        System.out.println("Department    : " + department);
        System.out.println("Course Number : " + courseNumber);
        System.out.println("Credit        : " + credit);
        System.out.println("Fee Course    : $" + feeCourse);
    }
}
