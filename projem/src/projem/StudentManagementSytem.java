/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projem;

import java.util.ArrayList;

/**
 *
 * @author akden
 */
public class StudentManagementSytem {
    private ArrayList<Student> students;
    private int currentId;
    
    public StudentManagementSytem(){
        students = new ArrayList<>();
        currentId= 1;
        
           
                   
    }
    
    public void addStudent(String name, String email){
        Student newStudent = new Student(currentId++,name,email);
        students.add(newStudent);
        System.out.println("ogrenci basariyla eklendi "+ newStudent.toString());
        
        
        
        
            
        }
    
    
    public void listStudents(){
        if(students.isEmpty()){
            System.out.println("kayit bulunamadi");
        }
        
        else{
            for(Student student:students){
                System.out.println(student);
            }
        }
        
        
    }
    
    public void updateStudent(int id, String name, String email){
        
        
        for(Student student:students ){
            if(student.getId()==id){
                student.setname(name);
                student.setemail(email);
                
                System.out.println("ogrneci bilgileri guncellendi:" + student.toString());
                return;
               
                
            }
            
            
        }
        System.out.println("ogrenci bulunamadi");
    }
    
    
    public void deleteStudent(int id){
        for(Student student:students){
            if(student.getId()==id){
                students.remove(student);
                System.out.println("ogrenci silindi"+ student);
                return;
            }
        }
        System.out.println("ogenrci bulunamadi");
        
        
    }
    
    
    
    
    
    
}
