package com.oop.collections.phonebook;

public class TestPhoneBook {
    public static void main(String[] args) {
        PhoneBook pb = new PhoneBookList();
        pb.addPerson(new Student("Quy", "Hom", "1707"));
        pb.addPerson(new Student("future", "mei", "9999"));
        System.out.println("-----------list--------------");
        System.out.println(pb.searchByLastName("Hom"));
        System.out.println(pb.searchByName("Quy"));
        System.out.println(pb.searchByNumber("9999"));
        pb.deleteByNumber("9999");
        System.out.println(pb.searchByNumber("9999"));

        PhoneBook pb2 = new PhoneBookMap();
        Student quy = new Student("Quy2", "Hoang", "7777");
        Student quy2 = new Student("Quy3", "Hong", "7979");

        pb2.addPerson(quy);
        pb2.addPerson(quy2);
        System.out.println("==================map===============");
        System.out.println(pb2.searchByNumber("7777"));
        System.out.println(pb2.searchByName("Quy2"));
        System.out.println(pb2.searchByLastName("Hong"));
        System.out.println(pb2.searchByNumber("7979"));
        pb2.deleteByNumber("7979");
        System.out.println(pb2.searchByNumber("7979"));
    }
}
