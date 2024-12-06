package com.klu.jfsd.HibernateDemo;

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class CustomerDemo {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		Configuration cfg= new Configuration();
        cfg.configure("hibernate.cfg.xml");
        SessionFactory sf=cfg.buildSessionFactory();
        System.out.println("1. INSERT \n2. UPDATE\n"
        		+ " 3. DELETE\n4. VIEW\n5. Exit\n Enter your choice:");
        int choice=sc.nextInt();
        
        while(choice!=5) {      
        
        switch(choice) {
        case 1:
        	insert(sf);
        	
        	break;
        case 2:
        	update(sf);
        	break;
        case 3:
        	delete(sf);
        	break;
        case 4:
        	retrieve(sf);
        	break;
        case 5:
        	break;
        default:
        	System.out.println("INVALID CHOICE");
        	break;
        }
        }
        
        
    }

	private static void retrieve(SessionFactory sf) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		Session s=sf.openSession();
        Transaction t=s.beginTransaction();
        Customer c=new Customer();
        System.out.println("Enter customer id to delete:");     
        int id=sc.nextInt();
        
        c=s.get(Customer.class,id);
        
        System.out.println("id: "+c.getId());
        System.out.println("name: "+c.getName());
        System.out.println("place: "+c.getPlace());
        t.commit();
        s.close();
        sf.close();
		
	}

	private static void delete(SessionFactory sf) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		Session s=sf.openSession();
        Transaction t=s.beginTransaction();
        Customer c=new Customer();
        System.out.println("Enter customer id to delete:");     
        int id=sc.nextInt();
        
        c=s.get(Customer.class, id);
        
        
        s.delete(c);
        t.commit();
        System.out.println("Deleted succesfully");
        s.close();
        sf.close();
		
	}

	private static void update(SessionFactory sf) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		Session s=sf.openSession();
        Transaction t=s.beginTransaction();
        Customer c=new Customer();
        System.out.println("Enter customer id to update details:");     
        int id=sc.nextInt();
        c=s.get(Customer.class, id);
        System.out.println("Enter customer updated details:");   
        int cid=sc.nextInt();
        String name=sc.next();
        String place=sc.next();
        c.setId(id);
        c.setName(name);
        c.setPlace(place);
        s.save(c);
        t.commit();
        System.out.println("updated successfully");
        s.close();
        sf.close();
		
	}

	private static void insert(SessionFactory sf) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		Session s=sf.openSession();
        Transaction t=s.beginTransaction();
        Customer c=new Customer();
        System.out.println("Enter customer details:");     
        int id=sc.nextInt();
        String name=sc.next();
        String place=sc.next();
        c.setId(id);
        c.setName(name);
        c.setPlace(place);
        s.save(c);
        t.commit();
        s.close();
        sf.close();
		
	}

	

}
