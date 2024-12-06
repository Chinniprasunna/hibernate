//package com.klu.jfsd.HibernateDemo;
//
//import org.hibernate.Session;
//import org.hibernate.SessionFactory;
//import org.hibernate.Transaction;
//import org.hibernate.cfg.Configuration;
//
//import com.klu.jfsd.HibernateDemo.Customer;
//
///**
// * Hello world!
// *
// */
//public class App 
//{
//    public static void main( String[] args )
//    {
//    	Configuration cfg= new Configuration();
//        cfg.configure("hibernate.cfg.xml");
//        SessionFactory sf=cfg.buildSessionFactory();
//        Session s=sf.openSession();
//        Transaction t=s.beginTransaction();
//        Customer c=new Customer();
////        System.out.println("Enter customer details:");
////        
////        int id=sc.nextInt();
////        String name=sc.next();
////        String place=sc.next();
//        c.setId(1);
//        c.setName("prasu");
//        c.setPlace("nellore");
//        s.save(c);
//        t.commit();
//        s.close();
//        sf.close();
//    }
//}
