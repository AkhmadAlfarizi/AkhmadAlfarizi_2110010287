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
public class Anggota {
    private String IdAnggota;
    private String PaswordAnggota;
    private String NamaAnggota;
    private String AlamatAnggota;
    private String TempatLahir;
    private String EmailAnggota;
    private String HpAnggota;
    private String FotoAnggota;
    
    public Anggota() {}
    
    /*public void setUsername(String login){
        /*Scanner objku = new Scanner(System.in);
        System.out.println("Masukkan Username Anda : ");
        login = objku.nextLine();*/
        //this.username=login;
    //} 
    
    public Anggota(String a){
        setIdAnggota(a);
    }
    
    public Anggota(String a, String b){
        setIdAnggota(a);
        setPaswordAnggota(b);
    }
    
    public Anggota(String a, String b, String c){
        setIdAnggota(a);
        setPaswordAnggota(b);
        setNamaAnggota(c);
    }
    
    public Anggota(String a, String b, String c, String d ){
        setIdAnggota(a);
        setPaswordAnggota(b);
        setNamaAnggota(c);
        setAlamatAnggota(d);
    }
    
    public Anggota(String a, String b, String c, String d, String e){
        setIdAnggota(a);
        setPaswordAnggota(b);
        setNamaAnggota(c);
        setAlamatAnggota(d);
        setTempatLahir(e);
    }
    
    public Anggota(String a, String b, String c, String d, String e, String f){
        setIdAnggota(a);
        setPaswordAnggota(b);
        setNamaAnggota(c);
        setAlamatAnggota(d);
        setTempatLahir(e);
        setEmailAnggota(f);
    }
    
    public Anggota(String a, String b, String c, String d, String e, String f, String g){
        setIdAnggota(a);
        setPaswordAnggota(b);
        setNamaAnggota(c);
        setAlamatAnggota(d);
        setTempatLahir(e);
        setEmailAnggota(f);
        setHpAnggota(g);
    }
    
    public Anggota(String a, String b, String c, String d, String e, String f, String g, String h){
        setIdAnggota(a);
        setPaswordAnggota(b);
        setNamaAnggota(c);
        setAlamatAnggota(d);
        setTempatLahir(e);
        setEmailAnggota(f);
        setHpAnggota(g);
        setFotoAnggota(h);
    }
    
    public Anggota(String a, String b, String c, String d, String e, String f, String g, String h, String i){
        setIdAnggota(a);
        setPaswordAnggota(b);
        setNamaAnggota(c);
        setAlamatAnggota(d);
        setTempatLahir(e);
        setEmailAnggota(f);
        setHpAnggota(g);
        setFotoAnggota(h);
    }
    
    public Anggota(String a, String b, String c, String d, String e, String f, String g, String h, String i, String j){
        setIdAnggota(a);
        setPaswordAnggota(b);
        setNamaAnggota(c);
        setAlamatAnggota(d);
        setTempatLahir(e);
        setEmailAnggota(f);
        setHpAnggota(g);
        setFotoAnggota(h);
    }
        
    public void setIdAnggota(String a){
        this.IdAnggota=a;
    }
    
    public String getIdAnggota(){
        return this.IdAnggota;
    }
    
    public void setPaswordAnggota(String b){
        this.PaswordAnggota=b;
    }
    
    public String getPaswordAnggota(){
        return this.PaswordAnggota;
    }
    
    public void setNamaAnggota(String c){
        this.NamaAnggota=c;
    }
    
    public String getNamaAnggota(){
        return this.NamaAnggota;
    }

    public void setAlamatAnggota(String d){
        this.AlamatAnggota=d;
    }
    
    public String getAlamatAnggota(){
        return this.AlamatAnggota;
    }
    
    public void setTempatLahir(String e){
        this.TempatLahir=e;
    }
    
    public String getTempatLahir(){
        return this.TempatLahir;
    }

    public void setEmailAnggota(String f){
        this.EmailAnggota=f;
    }
    
    public String getEmailAnggota(){
        return this.EmailAnggota;
    }

    public void setHpAnggota(String g){
        this.HpAnggota=g;
    }
    
    public String getHpAnggota(){
        return this.HpAnggota;
    }

    public void setFotoAnggota(String h){
        this.FotoAnggota=h;
    }
    
    public String getFotoAnggota(){
        return this.FotoAnggota;
    }


    public String Anggota(){
        return getIdAnggota()+getPaswordAnggota()+getNamaAnggota()+getAlamatAnggota()+getTempatLahir()+getEmailAnggota()+getHpAnggota()+getFotoAnggota(); 
    }
    public String Anggota(String a,String b,String c,String d,String e,String f,String g,String h){
        setIdAnggota(a);
        setPaswordAnggota(b);
        setNamaAnggota(c);
        setAlamatAnggota(d);
        setTempatLahir(e);
        setEmailAnggota(f);
        setHpAnggota(g);
        setFotoAnggota(h);
        return getIdAnggota()+getPaswordAnggota()+getNamaAnggota()+getAlamatAnggota()+getTempatLahir()+getEmailAnggota()+getHpAnggota()+getFotoAnggota(); 
    }

}