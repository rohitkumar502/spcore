package org.ms.stereotype;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

//@Component  // It creates object of the current class(i.e. Student) exactly same as class name
// with Camelcase notation (i.e. student) by default.
@Component("obj") //we can explicitly specify current class(i.e. Student) object name (like 'obj')
public class Student {
    @Value("Rohit Kumar")
    private String studentName;
    @Value("Sitamarhi")
    private String  city;

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Override
    public String toString() {
        return "Student [ studentName = " + studentName + ", city = " + city +  ']';
    }

}
