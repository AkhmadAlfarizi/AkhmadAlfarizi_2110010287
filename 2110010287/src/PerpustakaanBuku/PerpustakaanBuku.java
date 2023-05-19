/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package PerpustakaanBuku;

import AkhmadAlfarizi.*;

/**
 *
 * @author ACER
 */
public class PerpustakaanBuku {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args){
        Anggota objku = new Anggota();
    System.out.println("Data Anggota: " +objku.Anggota("01",  "1234", "Akhmad Alfarizi",  "HKSN",  "Banjarmasin", "alfarizi@gmail.com", "085676453421", "00"));
   
        Buku objku2 = new Buku();
    System.out.println("Data Buku: " +objku2.Buku("Buku Cerita",  " Malin Kundang", "1999",  "Fariz",  "127 Halaman"));
   
       Pengajuan objku3 = new Pengajuan();
    System.out.println("Data Pengajuan: " +objku3.Pengajuan("02",  " 18 mei. ", " 3 Buku",  "07",  ""));
   
      Peminjaman objku4 = new Peminjaman();
    System.out.println("Data Peminjaman: " +objku4.Peminjaman("12",  " 24juni", "2Buku",  "01",  "Malin Kundang"));

      Pengembalian objku5 = new Pengembalian();
    System.out.println("Data Pengembalian: " +objku5.Pengembalian("12",  "  2Juli", "01 ",  "04",  ""));
    
      Denda objku6 = new Denda();
    System.out.println("Data Denda: " +objku6.Denda("03",  "  16Desember", "20rb ",  "",  ""));
      
    
     System.out.println("");
    //Constructor Overload
    System.out.println("Constructor Overload");
    Anggota objku7 = new Anggota("01 ", "1234 ", "Akhmad Alfarizi", "HKSN ", "Banjarmasin ", "alfarizi@gmail.com ", "085676453421 ", "00");
    System.out.println("Data Anggota: " +objku7.Anggota());
    
      Buku objku8 = new Buku("Buku Cerita", " Malin Kundang ", "1999 ", " Fariz ", " 127 Halaman");
    System.out.println("Data Buku: " +objku8.Buku());
    
      Pengajuan objku9 = new Pengajuan();
    System.out.println("Data Pengajuan: " +objku9.Pengajuan("02",  " 18 mei. ", " 3  Buku",  "07",  ""));
   
      Peminjaman objku10 = new Peminjaman();
    System.out.println("Data Peminjaman: " +objku10.Peminjaman("12",  " 24juni", "2Buku",  "01",  "Malin Kundang"));
    
      Pengembalian objku11 = new Pengembalian();
    System.out.println("Data Pengembalian: " +objku11.Pengembalian("12",  "  2Juli", "01 ",  "04",  ""));
    
      Denda objku12 = new Denda();
    System.out.println("Data Denda: " +objku12.Denda("03",  "  16Desember", "20rb ",  "",  ""));
      
    
    
    }
    
   
}
