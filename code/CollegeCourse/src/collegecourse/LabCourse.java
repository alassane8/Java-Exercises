/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package collegecourse;

public class LabCourse extends CollegeCourse {
    
    protected LabCourse(String dept, int cn, int cred){
        
        super(dept,cn, cred);
        feeCourse = feeCourse + 50;
    } 
    @Override
    protected void display(){
        System.out.println("\nLAB COURSE DATAs  : ");
        department = "Lab";
        System.out.println("Department    : " + department);
        System.out.println("Course Number : " + courseNumber);
        System.out.println("Credit        : " + credit);
        System.out.println("Fee Course    : $" + feeCourse);
    }
}
