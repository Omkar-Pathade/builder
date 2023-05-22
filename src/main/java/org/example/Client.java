package org.example;

public class Client {
    public static void main(String[] args) {
        Student s1 = new Student.StudentBuilder("Omar", 10L)
                .setSchoolAddress("Garnishment")
                .setSchoolName("SAVES")
                .build();
        System.out.println(s1.toString());
    }
}