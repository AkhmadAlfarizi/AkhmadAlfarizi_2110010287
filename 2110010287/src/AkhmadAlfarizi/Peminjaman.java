/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AkhmadAlfarizi;
import java.util.Scanner;
/**
 *
 * @author ACER
 */
public class Peminjaman {
    private String NoPinjam;
    private String TglPinjam;
    private String Jumlah;
    private String IdAnggota;
    private String JudulBuku;
    
    public Peminjaman() {}

    
    public Peminjaman(String a){
        setNoPinjam(a);
    }
    
    public Peminjaman(String a, String b){

        setNoPinjam(a);
        setTglPinjam(b);

    }
    public Peminjaman (String a, String b, String c){
     
        setNoPinjam(a);
        setTglPinjam(b);
        setJumlah(c);

    }
    public Peminjaman(String a, String b, String c, String d){
        setNoPinjam(a);
        setTglPinjam(b);
        setJumlah(c);
        setIdAnggota(d);
    }
    
    public Peminjaman(String a, String b, String c, String d, String e){

         setNoPinjam(a);
        setTglPinjam(b);
        setJumlah(c);
        setIdAnggota(d);
        setJudulBuku(e);
    }
    public Peminjaman(String a, String b, String c, String d, String e, String f){

        setNoPinjam(a);
        setTglPinjam(b);
        setJumlah(c);
        setIdAnggota(d);
        setJudulBuku(e);
    }
    
    public Peminjaman(String a, String b, String c, String d, String e, String f, String g){
        setNoPinjam(a);
        setTglPinjam(b);
        setJumlah(c);
        setIdAnggota(d);
        setJudulBuku(e);
    }
    
    public Peminjaman(String a, String b, String c, String d, String e, String f, String g, String h){
        setNoPinjam(a);
        setTglPinjam(b);
        setJumlah(c);
        setIdAnggota(d);
        setJudulBuku(e);
    }
    
    public Peminjaman(String a, String b, String c, String d, String e, String f, String g, String h, String i){
        setNoPinjam(a);
        setTglPinjam(b);
        setJumlah(c);
        setIdAnggota(d);
        setJudulBuku(e);
    }
    public Peminjaman(String a, String b, String c, String d, String e, String f, String g, String h, String i, String j){

        setNoPinjam(a);
        setTglPinjam(b);
        setJumlah(c);
        setIdAnggota(d);
        setJudulBuku(e);
    }
        
    public void setNoPinjam(String a){
        this.NoPinjam=a;
    }
    
    public String getNoPinjam(){
        return this.NoPinjam;
    }
    
    public void setTglPinjam(String b){
        this.TglPinjam=b;
    }
    
    public String getTglPinjam(){
        return this.TglPinjam;
    }
    
    public void setJumlah(String c){
        this.Jumlah=c;
    }
    
    public String getJumlah(){
        return this.Jumlah;
    }

    public void setIdAnggota(String d){
        this.IdAnggota=d;
    }
    
    public String getIdAnggota(){
        return this.IdAnggota;
    }
    
    public void setJudulBuku(String e){
        this.JudulBuku=e;
    }
    
    public String getJudulBuku(){
        return this.JudulBuku;
    }

   
    public String Peminjaman(){
        return getNoPinjam()+getTglPinjam()+getJumlah()+getIdAnggota()+getJudulBuku(); 
    }
    public String Peminjaman(String a,String b,String c,String d,String e){
        setNoPinjam(a);
        setTglPinjam(b);
        setJumlah(c);
        setIdAnggota(d);
        setJudulBuku(e);
         return getNoPinjam()+getTglPinjam()+getJumlah()+getIdAnggota()+getJudulBuku();
    }

}