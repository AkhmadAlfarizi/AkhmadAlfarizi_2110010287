/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AkhmadAlfarizi;
/**
 *
 * @author ACER
 */
public class Perpustakaan {
    private String PeminjamanBuku;
    
    public Perpustakaan (){}
    
    public Perpustakaan(String says){
    System.out.println(says);
    }
    
    public void setAnggota(String status){
    if(status.equals("1")){
        this.PeminjamanBuku=("peminjaman Buku !");
    }else{this.PeminjamanBuku=("Pengembalian Buku ");}//Kalau memilih selain dari no 1 akan ada hasil "Sedang Maintenance..."
    }
    public String getAnggota(){
    return this.PeminjamanBuku;
    }
}
