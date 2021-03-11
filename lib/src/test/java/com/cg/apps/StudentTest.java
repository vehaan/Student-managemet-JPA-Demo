package com.cg.apps;

import java.time.LocalDate;



import javax.persistence.*;

import com.cg.Batch;
import com.cg.Student;

 

public class StudentTest {
    public static void main(String[] args) {
    	
        
        EntityManagerFactory factory = Persistence.createEntityManagerFactory("demo1");
        //creating a new session with db
        
        
        EntityManager entityManager =  factory.createEntityManager();
        
        //create instance of object to be persisted
        Student student1 =  new Student(2114,"Mrunalini","mrunal@gmail.com");
        Student student2 =  new Student(2115,"Geeta","geeta@gmail.com");
        Student student3 =  new Student(2116,"seeeta","seeeta@gmail.com");
        Student student4 =  new Student(2117,"meeta","meeta@gmail.com");
        
        //fetching the batch with id 12123 
        Batch angularBatch =  entityManager.find(Batch.class, 12123);
        
        //allotting same batch to 4 students
        student1.setBatch(angularBatch);
        student2.setBatch(angularBatch);
        student3.setBatch(angularBatch);
        student4.setBatch(angularBatch);
        
        entityManager.getTransaction().begin();
        
    
        entityManager.persist(student1);
        entityManager.persist(student2);
        entityManager.persist(student3);
        entityManager.persist(student4);
        
        entityManager.getTransaction().commit();
        
        //to list out the student object 
        Query query =entityManager.createQuery("select s from Student s");
        System.out.println(query);
        System.out.println("Student object saved on to TStudent table in Oracle db");
        
        
    }

 

}