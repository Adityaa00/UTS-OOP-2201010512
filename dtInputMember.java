
package gymmember1;
/**
 *
 * @author Aditya - 2201010512
 */

import java.util.Scanner;


public class dtInputMember {
    
    private int jRecord = 10;
     public int aRec = 0;
    
    //Array
    private String[][] dtProduk = new String[jRecord][5];
    Scanner dtIN = new Scanner(System.in);
    
    //constactor
    public dtInputMember (int nval){
        this.jRecord = nval;
    }
 
    //StoreData
    public void InputData(){
        int idx = aRec;
        
        if(idx >= jRecord){
            System.out.println("Tempat Penyimpanan Data Sudah Penuh");
            System.out.println("");
            return;
        }
        System.out.println("Tambah Member Gym");
        System.out.println("~~~~~~~~~~~~~~~~~~");
        System.out.print("Nama Member : ");
        dtProduk[idx][0] = dtIN.nextLine();
        
        System.out.print("Jenis Member : ");
        dtProduk[idx][1] = dtIN.nextLine();
        
        System.out.print("Jenis Kelamin : ");
        dtProduk[idx][2] = dtIN.nextLine();
        
        System.out.print("Tanggal Pendaftaran : ");
        dtProduk[idx][3] = dtIN.nextLine();
        
        System.out.print("Tanggal Habis Member : ");
        dtProduk[idx][4] = dtIN.nextLine();
        
        aRec++;
    }
    
    //UpdateData = Mengubah data
    public void UpdateData(){
        System.out.println("Ubah Data Member Gym");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~");
        System.out.print("Nomor Record: ");
        
        String txidx = dtIN.nextLine();
        int idx = Integer.parseInt(txidx);
        System.out.println("Data Lama");
        System.out.println("~~~~~~~~~");
        System.out.println("Nama Member: "+dtProduk[idx][0]);
        System.out.print("Diubah menjadi: ");
        dtProduk[idx][0] = dtIN.nextLine();
        
        System.out.println("Jenis Member: "+dtProduk[idx][1]);
        System.out.print("Diubah menjadi: ");
        dtProduk[idx][1] = dtIN.nextLine();
        
        System.out.println("Jenis Kelamin: "+dtProduk[idx][2]);
        System.out.print("Diubah menjadi: ");
        dtProduk[idx][2] = dtIN.nextLine();
        
        System.out.println("Tanggal Pendaftaran: "+dtProduk[idx][3]);
        System.out.print("Diubah menjadi: ");
        dtProduk[idx][3] = dtIN.nextLine();
        
        System.out.println("Tanggal Habis Member: "+dtProduk[idx][3]);
        System.out.print("Diubah menjadi: ");
        dtProduk[idx][4] = dtIN.nextLine();
        
        System.out.println("Data Record ke "+idx+" telah diubah");
        
        
      
                
    }
    
    
    
    
            
    //Destroy = Menghapus Data
    public void DestroyData(){
        String[][] tmp = new String[jRecord][5];
        
        System.out.println("Hapus Member Gym ");
        System.out.println("~~~~~~~~~~~~~~~~~");
        System.out.println("No Record: ");
        
        String txidx = dtIN.nextLine();
        
        int idx = Integer.parseInt(txidx);
        System.out.println("Data yang dihapus");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("Nama member: "+dtProduk[idx][0]);
        System.out.println("Jenis Member: "+dtProduk[idx][1]);
        System.out.println("Jenis Kelamin: "+dtProduk[idx][2]);
        System.out.println("Tanggal Pendaftaran: "+dtProduk[idx][3]);
        System.out.println("Tanggal Habis Member: "+dtProduk[idx][4]);

        
        int cidx = 0;
        for(int i=0;i<aRec;i++){
            if(i == idx){
                continue;
            }
                
            tmp[cidx][0] = dtProduk[i][0];   
            tmp[cidx][1] = dtProduk[i][1];   
            tmp[cidx][2] = dtProduk[i][2];
            tmp[cidx][2] = dtProduk[i][3];
            tmp[cidx][2] = dtProduk[i][4];
            cidx++;
        }
        aRec--;
        for(int i=0; i<aRec; i++){
            tmp[cidx][0] = dtProduk[i][0];   
            tmp[cidx][1] = dtProduk[i][1];   
            tmp[cidx][2] = dtProduk[i][2];  
            tmp[cidx][2] = dtProduk[i][3];
            tmp[cidx][2] = dtProduk[i][4];
        }

    }
    
    //ViewData = Melihat Data
    public void viewData(){
        System.out.println("Data Member Gym ("+aRec+"/"+jRecord+")");
        System.out.println("~~~~~~~~~~~~~~~~");
        
        for (int i=0; i<aRec; i++){
            System.out.println("Data Record ke"+i);
            System.out.println("Nama Member :"+dtProduk[i][0]);
            System.out.println("Jenis Member :"+dtProduk[i][1]);
            System.out.println("Jenis Kelamin :"+dtProduk[i][2]);
            System.out.println("Tanggal Pendaftaran :"+dtProduk[i][3]);
            System.out.println("Tanggal Habis Member :"+dtProduk[i][4]);
        }
        System.out.println("");
        
    }
    
}
