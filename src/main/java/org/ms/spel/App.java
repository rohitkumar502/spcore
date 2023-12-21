//package org.ms.spel;
//
//import org.springframework.context.ApplicationContext;
//import org.springframework.context.support.ClassPathXmlApplicationContext;
//import org.springframework.expression.Expression;
//import org.springframework.expression.spel.standard.SpelExpressionParser;
//
//public class App {
//    public static void main(String[] args) {
//        ApplicationContext context = new ClassPathXmlApplicationContext("spelConf.xml");
//
//        Demo d1 = (Demo)context.getBean("demo");
//        System.out.println(d1);
//
//        // Solving SpEL using SpelExpressionParser class
//        SpelExpressionParser parser = new SpelExpressionParser();
//        Expression e1 = parser.parseExpression("12+30");
//        Expression e2 = parser.parseExpression("4<3? 90: 40");
//        System.out.println(e1.getValue());
//        System.out.println(e2.getValue());
//
//    }
//}
//
//
