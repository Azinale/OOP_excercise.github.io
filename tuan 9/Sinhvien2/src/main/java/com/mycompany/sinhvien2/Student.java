package com.mycompany.sinhvien2;
public class Student
{
    private String hovaten;
    private double diem;
    public Student (String hovaten, double diem)
    {
        this.hovaten=hovaten;
        this.diem=diem; 
    }

    public String getHovaten() {
        return hovaten;
    }

    public void setHovaten(String hovaten) {
        this.hovaten = hovaten;
    }

    public double getDiem() {
        return diem;
    }

    public void setDiem(double diem) {
        this.diem = diem;
    }
   
    public void printStudent()
    {
        System.out.printf("%s %.1f\n",hovaten,diem);
    }
}