/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package arraylist;

public class Students {

    //Class variables definitons : 
    protected String [] studentsName ;
    protected int [][] studentsGrade;
    protected int studentAverage;
    protected char studentsGradeLetter;
    
    //Class constructor : 
    protected Students(String [] sn, int [][] sg){
        studentsName = sn;
        studentsGrade = sg;
    }
    
    //Method to access student's name :
    protected String getStudentsName(int i){
        return studentsName[i];
    }
    
    //Method to access student's AVG :
    protected double getStudentsAverage(int i){
        for (int j = 0; j < 4; j ++){
            studentAverage += studentsGrade[i][j]; 
        }
        studentAverage = studentAverage / 4;
        return studentAverage;
    }
    
    //Method to access GradeLetter of the AVG of the student's grades : 
    protected char getsGrade(int i){
        if (studentAverage >= 90 && studentAverage <= 100){
            studentsGradeLetter = 'A';
        }
        if (studentAverage >= 80  && studentAverage <= 89){
            studentsGradeLetter = 'B';
        }
        if (studentAverage >= 70 && studentAverage <= 79){
            studentsGradeLetter = 'C';
        }
        if ( studentAverage >= 60  && studentAverage <= 69){
            studentsGradeLetter = 'D';
        }
        if (studentAverage >= 0 && studentAverage <= 59){
            studentsGradeLetter = 'E';
        }
        return studentsGradeLetter;
    }
}
