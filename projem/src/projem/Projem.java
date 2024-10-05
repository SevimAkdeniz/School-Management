/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package projem;


import java.util.Scanner;

/**
 *
 * @author akden
 */
public class Projem {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        StudentManagementSytem sms = new StudentManagementSytem();
        
        Scanner scanner = new Scanner(System.in);
        
        while(true){
            System.out.println("1. ogrenci ekle");
            System.out.println("2. ogrenci listele");
            System.out.println("3. ogrenci guncelle");
            System.out.println("4. ogrenci sil");
            System.out.println("5. cıkıs");
            System.out.println("seciminiz:");
            
            int choice = scanner.nextInt();
            scanner.nextLine();
            
            boolean isExit = false;
            
            switch (choice) {
                case 1:
                    System.out.println("ogrenci adi:");
                    String name =  scanner.nextLine();
                
                    System.out.println("ogrenci maili:");
                    String email =  scanner.nextLine();
                    sms.addStudent(name, email);
                
                       
                break;
                
                case 2:
                    sms.listStudents();
                    break;
               
                    
                    
                case 3:
                    
                    System.out.println("ogrenci id:");
                    int updateId = scanner.nextInt();
                    scanner.nextLine();
                    
                    System.out.println("ogrenci adi:");
                    String updatename = scanner.nextLine();
                    
                    System.out.println("ogrenci maili:");
                    String updatemail = scanner.nextLine();
                    
                    sms.updateStudent(updateId, updatename, updatemail);
                    
                    break;
                    
                case 4:
                    System.out.println("ogrenci id:");
        
                int deleteid = scanner.nextInt();
                    sms.deleteStudent(deleteid);
                    break;
                    
                    
                case 5:
                    System.out.println("cıkıs yapiliyor...");
                    isExit = true;
                    break;
                   
                    
                                                
            default:
                   
                System.out.println("lutfen gecerli bir deger giriniz.");
            }
            
            
            if(isExit == true){
                break;
            }
            
        }
        
        
        
                
        
       
    }
    
}
