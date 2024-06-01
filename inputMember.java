/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gymmember1;

/**
 *
 * @author Aditya
 */
public class inputMember {
    
    public static void page() {

    dtInputMember DA = new dtInputMember(10);
       String ul ="ulang";
       do{
            System.out.println("Aplikasi InStock (Input Data)");
            System.out.println("~~~~~~~~~~~~~~~~~~~~");
            System.out.println("A. Lihat Data Member");
            System.out.println("B. Tambah Data Member");
            System.out.println("C. Ubah Data Member");
            System.out.println("D. Hapus Data Member");
            System.out.println("E. LogOut");
            System.out.println("Pilih A/B/C/D/E: ");
            String mPIL = DA.dtIN.nextLine();
            
            switch(mPIL){
                case "A":
                    DA.viewData();
                    break; 
                
                case "B":
                    DA.InputData();
                    break; 
                
                case "C":
                    DA.UpdateData();
                    break; 
                
                case "D":
                    DA.DestroyData();
                    break; 
                
                case "E":
                    GymMember1 gm = new GymMember1();
                    gm.mainMenu();
                    break; 
                    
                    
                default:
                        System.out.println("Plihan Tidak tersedia");
                    break;
            }
       }while( ul.equals("ulang"));
}
    
}
