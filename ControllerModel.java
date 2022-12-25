/*
 1 menampilkan data model hewan
 2 menampilkan data model hewan berdasarkan id
 3 tambah data model hewan
 4 edit data model hewan
 5 hapus data model hewan
 */
package tugas;

import java.util.ArrayList;

public class ControllerModel {
    ArrayList<DataModel> tampungHewan = new ArrayList<DataModel>();
 
    protected void tampilData(){
       
        for(DataModel model : this.tampungHewan){
            System.out.println(model.getId() + " " + model.getJenis() + " " + model.getJumlahKaki());
        }
    }

    protected void tampilDataBerdasarkanIndex(int index){
       this.tampungHewan.get(index).print();
    }
    
    protected void tambahData(DataModel model){
        this.tampungHewan.add(model);
    }
    
    protected void tambahDataBaru(int id, String jenis, String jumlahKaki){
     
       tampungHewan.add(new DataModel(id, jenis, jumlahKaki));
        System.out.println("Data " + id + " " + jenis + " " + jumlahKaki + " "+ "ditambahkan");
    }
    
    protected void ubahData(int index, int id, String jenis, String jumlahKaki){
        tampungHewan.set(index, new DataModel(id, jenis, jumlahKaki));
    }
    
    protected void hapusBerdasarkanIndex(int index){
       
        System.out.println("Data dengan index " + index + " dihapus");
        this.tampungHewan.remove(index);
      
    }
 
}
