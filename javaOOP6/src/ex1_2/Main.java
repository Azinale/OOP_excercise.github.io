package ex1_2;

import org.w3c.dom.ls.LSOutput;

public class Main {
    public static void main(String[] args) {
        Staff staff1 = new Staff("Quy", "Ha noi", "Khtn", 9000);
        System.out.println("Staff[: " + ", name = " + staff1.getName() + ", add = " + staff1.getAddress()
                + ", school = " + staff1.getSchool() + ", pay = " + staff1.getPay());
        Student student1 = new Student("Quy", "Ha noi", "DH", 2, 1000.0);
        System.out.println("Student[: " + " name = " + student1.getName() + " add = " + student1.getAddress()
                + " program = " + student1.getProgram() + " year = " + student1.getYear() + " fee = " + student1.getFee());
    }
}
