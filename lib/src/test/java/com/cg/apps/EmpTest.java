package com.cg.apps;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.cg.Employee;
import com.cg.Project;

public class EmpTest {
    public static void main(String[] args) {
        
EntityManagerFactory factory = Persistence.createEntityManagerFactory("demo1");
        
        EntityManager em =  factory.createEntityManager();
        
        Employee e1 =  new Employee("John");
        Employee e2 =  new Employee("Viren");
        Employee e3 =  new Employee("Karan");
        Employee e4 =  new Employee("Neha");
        Employee e5 =  new Employee("Preetika");
        Employee e6 =  new Employee("Deepika");
        
        Project p1 =  new Project("migration");
        Project p2 =  new Project("salesforce");
        
        Set <Project> setOfProjects =  new HashSet<>();
        setOfProjects.add(p1);
        setOfProjects.add(p2);
        
        e1.setProjects(setOfProjects);
        e2.setProjects(setOfProjects);
        e3.setProjects(setOfProjects);
        
        Project p3 =  new Project("new migration");
        Project p4 =  new Project("new salesforce");
        
        Set <Project> setOfProjects2 =  new HashSet<>();
        setOfProjects2.add(p3);
        setOfProjects2.add(p4);
        
        
        e4.setProjects(setOfProjects2);
        e5.setProjects(setOfProjects2);
        e6.setProjects(setOfProjects2);
        
        
        
        em.getTransaction().begin();
        em.persist(e1);
        
        em.persist(e2);
        em.persist(e3);
        em.persist(e4);
        em.persist(e5);
        em.persist(e6);
        
        em.getTransaction().commit();
        
        em.close();
 
        System.out.println("Data saved");
        
    }

 

}