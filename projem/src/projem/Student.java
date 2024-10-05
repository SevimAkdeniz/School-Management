/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projem;

/**
 *
 * @author akden
 */
public class Student {
    private int id;
    private String name;
    private String email;
    
    public Student(int id, String name, String email){
        this.id = id;
        this.name= name;
        this.email=email;
    }
    
    
    public void setId(){
        this.id = id;
    }
    
    public int getId(){
        return this.id;
    }
    
    
    public void setname(String name){
        this.name = name;
    }
    
    public String getname(){
        return this.name;
    }
    
    public void setemail(String email){
        this.email=email;
    }
    
    public String getemail(){
       return this.email;
    }
    
    public String toString(){
        return "{id= " + id +   '\''   +
               "name= " + name +   '\''   + 
                "email= " + email + "}";
    }

   

   
    
    
    
    
}
