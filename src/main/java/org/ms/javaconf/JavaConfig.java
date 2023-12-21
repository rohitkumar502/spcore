//package org.ms.javaconf;
//
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//
//@Configuration
//public class JavaConfig {
//    @Bean
//    public Coke getCoke() // the method name will be the default bean name
//    {
//        return new Coke();
//    }
////    @Bean
//    @Bean(name = {"student", "stud", "sobj"}) //We can specify multiple customized name of a bean in an array of String
//    public Student getStudent()
//    {
//       return new Student(getCoke()); //here we are using default bean name
//    }
//
//}
