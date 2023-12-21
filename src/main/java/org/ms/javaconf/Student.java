package org.ms.javaconf;

public class Student {
    private Coke coke;

    public Student(Coke coke) {
        this.coke = coke;
    }

    public void study()
    {
        coke.display();
        System.out.println("Student is reading book.");
    }



}
