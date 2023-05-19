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
public class Denda {
    private String IdDenda;
    private String Tgl;
    private String JumlahDenda;
    
    public Denda() {}
    
    
    public Denda(String a){
        setIdDenda(a);
  
    }
    
    public Denda(String a, String b){
        setIdDenda(a);
        setTgl(b);
       
    }
    public Denda (String a, String b, String c){
     
        setIdDenda(a);
        setTgl(b);
        setJumlahDenda(c);
    }
    public Denda(String a, String b, String c, String d){
        setIdDenda(a);
        setTgl(b);
        setJumlahDenda(c);
       
    }
    public Denda(String a, String b, String c, String d, String e){

        setIdDenda(a);
        setTgl(b);
        setJumlahDenda(c);
       
    }
    
    public Denda(String a, String b, String c, String d, String e, String f){
        setIdDenda(a);
        setTgl(b);
        setJumlahDenda(c);
       
    }
    
    public Denda(String a, String b, String c, String d, String e, String f, String g){
        setIdDenda(a);
        setTgl(b);
        setJumlahDenda(c);
       
    }
    
    public Denda(String a, String b, String c, String d, String e, String f, String g, String h){
        setIdDenda(a);
        setTgl(b);
        setJumlahDenda(c);
       
    }
    
    public Denda(String a, String b, String c, String d, String e, String f, String g, String h, String i){
        setIdDenda(a);
        setTgl(b);
        setJumlahDenda(c);
       
    }
    public Denda(String a, String b, String c, String d, String e, String f, String g, String h, String i, String j){

        setIdDenda(a);
        setTgl(b);
        setJumlahDenda(c);
       
    }
        
    public void setIdDenda(String a){
        this.IdDenda=a;
    }
    
    public String getIdDenda(){
        return this.IdDenda;
    }
    
    public void setTgl(String b){
        this.Tgl=b;
    }
    
    public String getTgl(){
        return this.Tgl;
    }
    
    public void setJumlahDenda(String c){
        this.JumlahDenda=c;
    }
    
    public String getJumlahDenda(){
        return this.JumlahDenda;
    }

   
    public String Denda(){
        return getIdDenda()+getTgl()+getJumlahDenda();
    }
    public String Denda(String a,String b,String c,String d,String e){
        setIdDenda(a);
        setTgl(b);
        setJumlahDenda(c);
        return getIdDenda()+getTgl()+getJumlahDenda();
    }

}