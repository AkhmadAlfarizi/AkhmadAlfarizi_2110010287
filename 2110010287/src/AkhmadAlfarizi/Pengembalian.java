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
public class Pengembalian {
    private String NoKembali;
    private String TglKembali;
    private String Jumlah;
    private String NoPinjam;
    
    public Pengembalian() {}
    
    
    public Pengembalian(String a){
        setNoKembali(a);
    }
    
    public Pengembalian(String a, String b){

        setNoKembali(a);
        setTglKembali(b);
       
    }
    public Pengembalian (String a, String b, String c){
     
        setNoKembali(a);
        setTglKembali(b);
        setJumlah(c);
       
    }
    public Pengembalian(String a, String b, String c, String d){
        setNoKembali(a);
        setTglKembali(b);
        setJumlah(c);
        setNoPinjam(d);
       
    }
    public Pengembalian(String a, String b, String c, String d, String e){

        setNoKembali(a);
        setTglKembali(b);
        setJumlah(c);
        setNoPinjam(d);
       
       
    }
    
    public Pengembalian(String a, String b, String c, String d, String e, String f){

        setNoKembali(a);
        setTglKembali(b);
        setJumlah(c);
        setNoPinjam(d);
       
    }
    
    public Pengembalian(String a, String b, String c, String d, String e, String f, String g){
        setNoKembali(a);
        setTglKembali(b);
        setJumlah(c);
        setNoPinjam(d);
       
    }
    
    public Pengembalian(String a, String b, String c, String d, String e, String f, String g, String h){
        setNoKembali(a);
        setTglKembali(b);
        setJumlah(c);
        setNoPinjam(d);
       
       
    }
    
    public Pengembalian(String a, String b, String c, String d, String e, String f, String g, String h, String i){
        setNoKembali(a);
        setTglKembali(b);
        setJumlah(c);
        setNoPinjam(d);
       
    }
    public Pengembalian(String a, String b, String c, String d, String e, String f, String g, String h, String i, String j){

        setNoKembali(a);
        setTglKembali(b);
        setJumlah(c);
        setNoPinjam(d);
       
    }
        
    public void setNoKembali(String a){
        this.NoKembali=a;
    }
    
    public String getNoKembali(){
        return this.NoKembali;
    }
    
    public void setTglKembali(String b){
        this.TglKembali=b;
    }
    
    public String getTglKembali(){
        return this.TglKembali;
    }
    
    public void setJumlah(String c){
        this.Jumlah=c;
    }
    
    public String getJumlah(){
        return this.Jumlah;
    }

    public void setNoPinjam(String d){
        this.NoPinjam=d;
    }
    
    public String getNoPinjam(){
        return this.NoPinjam;
    }
    
   
    public String Pengembalian(){
        return getNoKembali()+getTglKembali()+getJumlah()+getNoPinjam();
    }
    public String Pengembalian(String a,String b,String c,String d,String e){
        setNoKembali(a);
        setTglKembali(b);
        setJumlah(c);
        setNoPinjam(d);
        return getNoKembali()+getTglKembali()+getJumlah()+getNoPinjam();
    }

}