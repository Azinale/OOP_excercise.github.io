package com.mycompany.sinhvien2;
import java.util.Scanner;
public class StudentTest
{
    public static void inputStudents (Student [] studentArray, Scanner reader)
    {
        for (int i = 0; i < studentArray.length; i++) {
            String name = reader.nextLine();
            double score = Double.parseDouble(reader.nextLine());
            studentArray[i]=new Student(name, score);
            
        }
    }
    public static void printStudents (Student[] studentArray)
    {
        for (int i = 0; i < studentArray.length; i++) {
            studentArray[i].printStudent();
            
        }
    }
    public static void sortScores (Student[] studentArray)
    {
        for (int i = 0; i<studentArray.length-1;i++){
            for(int j=i+1; j<studentArray.length;j++){
                if(studentArray[i].getDiem()<studentArray[j].getDiem()){
                    Student max = studentArray[i];
                    studentArray[i]=studentArray[j];
                    studentArray[j]=max;
                    
                }
            }
        }
        printStudents(studentArray);
    }
    public static void main (String []args)
    {
        int n;
        Scanner sc = new Scanner(System.in);
        n= Integer.parseInt(sc.nextLine());
        Student[] studentArray = new Student[n];
        inputStudents(studentArray, sc);
        sortScores(studentArray);
    }
        
}