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
public class Pengajuan {
    private String NoPengajuan;
    private String TglPengajuan;
    private String Total;
    private String KdPetugas;
    
    public Pengajuan() {}
    
    /*public void setUsername(String login){
        /*Scanner objku = new Scanner(System.in);
        System.out.println("Masukkan Username Anda : ");
        login = objku.nextLine();*/
        //this.username=login;
    //} 
    
    public Pengajuan(String a){
        setNoPengajuan(a);
    }
    
    public Pengajuan(String a, String b){

            setNoPengajuan(a);
        setTglPengajuan(b);
    }
    public Pengajuan (String a, String b, String c){
     
        setNoPengajuan(a);
        setTglPengajuan(b);
        setTotal(c);
    }
    public Pengajuan(String a, String b, String c, String d){
        setNoPengajuan(a);
        setTglPengajuan(b);
        setTotal(c);
        setKdPetugas(d);
    }
    public Pengajuan(String a, String b, String c, String d, String e){

        setNoPengajuan(a);
        setTglPengajuan(b);
        setTotal(c);
        setKdPetugas(d);
       
    }
    
    public Pengajuan(String a, String b, String c, String d, String e, String f){

        setNoPengajuan(a);
        setTglPengajuan(b);
        setTotal(c);
        setKdPetugas(d);
    }
    
    public Pengajuan(String a, String b, String c, String d, String e, String f, String g){
        setNoPengajuan(a);
        setTglPengajuan(b);
        setTotal(c);
        setKdPetugas(d);
    }
    
    public Pengajuan(String a, String b, String c, String d, String e, String f, String g, String h){
        setNoPengajuan(a);
        setTglPengajuan(b);
        setTotal(c);
        setKdPetugas(d);
       
    }
    
    public Pengajuan(String a, String b, String c, String d, String e, String f, String g, String h, String i){
        setNoPengajuan(a);
        setTglPengajuan(b);
        setTotal(c);
        setKdPetugas(d);
       
    }
    public Pengajuan(String a, String b, String c, String d, String e, String f, String g, String h, String i, String j){

        setNoPengajuan(a);
        setTglPengajuan(b);
        setTotal(c);
        setKdPetugas(d);
       
    }
        
    public void setNoPengajuan(String a){
        this.NoPengajuan=a;
    }
    
    public String getNoPengajuan(){
        return this.NoPengajuan;
    }
    
    public void setTglPengajuan(String b){
        this.TglPengajuan=b;
    }
    
    public String getTglPengajuan(){
        return this.TglPengajuan;
    }
    
    public void setTotal(String c){
        this.Total=c;
    }
    
    public String getTotal(){
        return this.Total;
    }

    public void setKdPetugas(String d){
        this.KdPetugas=d;
    }
    
    public String getKdPetugas(){
        return this.KdPetugas;
    }
    
   
    public String Pengajuan(){
        return getNoPengajuan()+getTglPengajuan()+getTotal()+getKdPetugas();
    }
    public String Pengajuan(String a,String b,String c,String d,String e){
        setNoPengajuan(a);
        setTglPengajuan(b);
        setTotal(c);
        setKdPetugas(d);
         return getNoPengajuan()+getTglPengajuan()+getTotal()+getKdPetugas();
    }

}