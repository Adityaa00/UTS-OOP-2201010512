/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package gymmember1;

import java.util.Scanner;

/**
 *
 * @author Aditya - 2201010512
 */
public class GymMember1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        GymMember1 gymMember1 = new GymMember1();
        gymMember1.mainMenu();
}
    public void mainMenu(){
        
        System.out.println("Login Admin Gym ");
        System.out.println("Masukkan Username dan Password");
        
        login();
       }
       
       public void login(){
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Username : ");
        String username = scanner.nextLine();
        System.out.print("Password : ");
        String password = scanner.nextLine();
        
        System.out.println("Selamat datang Admin " + username);
        
        System.out.println("Ketik 1 untuk lanjut ke halaman selanjutnya");
        
        int pilihan = scanner.nextInt();

        switch (pilihan) {
            case 1:
               inputMember.page();
                break;
            default:
                System.out.println("Pilihan tidak valid.");
        }
        
        scanner.close();
       
    }
       
     
       
       
    
}
