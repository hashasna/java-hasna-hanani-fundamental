/*
Model : Hewan
data : 
1 : id : nomer id
2 : jenis : jenis hewan
3 : jumlahKaki : jumlah kaki hewan
*/
package tugas;

public class DataModel{
  // DataModel(){}  
    private int id;
    private String jenis, jumlahKaki;
    
    DataModel(int id, String jenis, String jumlahKaki){
        this.id = id;
        this.jenis = jenis;
        this.jumlahKaki = jumlahKaki;
    }
   
     
    public int getId(){
        return id;
    }
    
    public String getJenis(){
        return jenis;
    }
    
    public String getJumlahKaki(){
        return jumlahKaki;
    }
    
    public void setId(int id){
        this.id = id;
    }
    
    public void setJenis(String jenis){
        this.jenis = jenis;
    }
    
    public void setJumlahKaki(String jumlahKaki){
        this.jumlahKaki = jumlahKaki;
    }
    
    void print(){
        System.out.print(this.id + " " + this.jenis + " " + this.jumlahKaki + "\n");
        
    }
}
