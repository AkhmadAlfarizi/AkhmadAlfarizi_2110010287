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
public class Buku {
    private String Kategori;
    private String JudulBuku;
    private String Terbit;
    private String Penerbit;
    private String Halaman;
    
    public Buku() {}
    
    /*public void setUsername(String login){
        /*Scanner objku = new Scanner(System.in);
        System.out.println("Masukkan Username Anda : ");
        login = objku.nextLine();*/
        //this.username=login;
    //} 
    
    public Buku(String a){
        setKategori(a);
    }
    
    public Buku(String a, String b){

        setKategori(a);
        setJudulBuku(b);
    
    }
    public Buku (String a, String b, String c){
     
        setKategori(a);
        setJudulBuku(b);
        setTerbit(c);
    }
    public Buku(String a, String b, String c, String d){
        setKategori(a);
        setJudulBuku(b);
        setTerbit(c);
        setPenerbit(d);
    }
    
    public Buku(String a, String b, String c, String d, String e){

        setKategori(a);
        setJudulBuku(b);
        setTerbit(c);
        setPenerbit(d);
        setHalaman(e);
    }
    
    public Buku(String a, String b, String c, String d, String e, String f){

        setKategori(a);
        setJudulBuku(b);
        setTerbit(c);
        setPenerbit(d);
        setHalaman(e);
    }
    
    public Buku(String a, String b, String c, String d, String e, String f, String g){
        setKategori(a);
        setJudulBuku(b);
        setTerbit(c);
        setPenerbit(d);
        setHalaman(e);
    }
    
    public Buku(String a, String b, String c, String d, String e, String f, String g, String h){
        setKategori(a);
        setJudulBuku(b);
        setTerbit(c);
        setPenerbit(d);
        setHalaman(e);
    }
    
    public Buku(String a, String b, String c, String d, String e, String f, String g, String h, String i){
        setKategori(a);
        setJudulBuku(b);
        setTerbit(c);
        setPenerbit(d);
        setHalaman(e);
    }
    public Buku(String a, String b, String c, String d, String e, String f, String g, String h, String i, String j){

        setKategori(a);
        setJudulBuku(b);
        setTerbit(c);
        setPenerbit(d);
        setHalaman(e);
    }
        
    public void setKategori(String a){
        this.Kategori=a;
    }
    
    public String getKategori(){
        return this.Kategori;
    }
    
    public void setJudulBuku(String b){
        this.JudulBuku=b;
    }
    
    public String getJudulBuku(){
        return this.JudulBuku;
    }
    
    public void setTerbit(String c){
        this.Terbit=c;
    }
    
    public String getTerbit(){
        return this.Terbit;
    }

    public void setPenerbit(String d){
        this.Penerbit=d;
    }
    
    public String getPenerbit(){
        return this.Penerbit;
    }
    
    public void setHalaman(String e){
        this.Halaman=e;
    }
    
    public String getHalaman(){
        return this.Halaman;
    }

   
    public String Buku(){
        return getKategori()+getJudulBuku()+getTerbit()+getPenerbit()+getHalaman(); 
    }
    public String Buku(String a,String b,String c,String d,String e){
        setKategori(a);
        setJudulBuku(b);
        setTerbit(c);
        setPenerbit(d);
        setHalaman(e);
         return getKategori()+getJudulBuku()+getTerbit()+getPenerbit()+getHalaman();
    }

}