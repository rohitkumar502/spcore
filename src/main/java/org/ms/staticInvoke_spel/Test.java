//package org.ms.staticInvoke_spel;
//
//import org.springframework.beans.factory.annotation.Value;
//import org.springframework.stereotype.Component;
//
//@Component
//public class Test {
////    Syntax for invoking a static method in SpEL:
////  T(package.ClassName).methodName(arguments)
//
////    Syntax for accessing a static variable in SpEL:
////T(package.ClassName).variableName
//
////    Syntax for creating an object in SpEL:
////    new fullyQualifiedClassName(constructorArguments)
//
//
//    // Writing fully qualified class name is a good practice
//
//    @Value("#{ T(java.lang.Math).sqrt(144) }") // static method
//    private double x;
//
//    @Value("#{ T(Math).PI }") // static variable
//    private double y;
//    @Value("#{ new java.lang.String('Rohit Kumar') }") // creating object
//    private String name ;
//    public double getX() {
//        return x;
//    }
//
//    public void setX(int x) {
//        this.x = x;
//    }
//
//    public double getY() {
//        return y;
//    }
//
//    public void setY(int y) {
//        this.y = y;
//    }
//
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//
//    @Override
//    public String toString() {
//        return "Test [x = "+ x + ", y = "+ y +  ", name = "+ name +  ']';
//    }
//
//
//}
