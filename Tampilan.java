/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package tugas;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class Tampilan {

   
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
      
        ControllerModel cm = new ControllerModel();
        int menu;
       
        cm.tambahData(new DataModel(1, "Sapi", "4"));
        cm.tambahData(new DataModel(2, "Kambing", "4"));
        cm.tambahData(new DataModel(3, "Unta", "4"));
        
        System.out.println("Pilihan Menu : ");
        System.out.println("1 Lihat Data");
        System.out.println("2 Lihat Data berdasarkan index");
        System.out.println("3 Ubah Data");
        System.out.println("4 Hapus Data");
        System.out.println("==================================");
        
        
       do{
        System.out.print("Menu : ");
        menu = in.nextInt();
        switch(menu){
            case 1:
                System.out.println("Lihat Data Hewan : ");
                cm.tampilData();
                
            break;
            case 2:
                System.out.print("Index : ");
                int index = in.nextInt();
                cm.tampilDataBerdasarkanIndex(index);
            break;
            case 3:
                System.out.print("Index : ");
                int index2 = in.nextInt();
                System.out.print("Id : ");
                int id3 = in.nextInt();
                System.out.println("Jenis : ");
                String jenis3 = in.nextLine();
                System.out.println("Jumlah Kaki : ");
                String jk3 = in.nextLine();
                cm.ubahData(index2, id3, jenis3, jk3);
            break;
            case 4:    
                System.out.print("Index yang ingin di hapus : ");
                int idx = in.nextInt();
                cm.hapusBerdasarkanIndex(idx);
            break;
            default:
                System.out.println("cek menu");
            
        }
       } while(menu != 9); 
    }
    
    
}
