/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package collegecourse;
import java.util.Scanner;

public class UseCourse {
    public static void main(String[] args) {
        
        //Scanner definition
        Scanner input = new Scanner(System.in);
        
        //Variables definitions
        String dept;
        int cn; 
        int cred;
        
        //Display lab courses department
        System.out.println("Here are the Lab courses department :\n"
                + "BIO, CHM, CIS, PHY.");
        
        //Student informations input
        System.out.println("\nENTER USER INFORMATIONS : ");
        System.out.println("Enter department : ");
        dept = input.next();
        System.out.println("Enter course number : ");
        cn = input.nextInt();
        System.out.println("Enter credit : ");
        cred = input.nextInt();
        
        //Creating an object for labcourse or college course
        if (dept.equals("BIO")|| dept.equals("CHM")|| dept.equals("CIS")|| dept.equals("PHY")){
            CollegeCourse course = new LabCourse(dept,cn,cred);
            course.display();
        }
        else {
            CollegeCourse course = new CollegeCourse(dept,cn,cred);
            course.display();
        }
    }
}
