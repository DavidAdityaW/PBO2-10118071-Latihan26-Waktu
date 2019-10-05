/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10118071.latihan26.waktu;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author 
 * NAMA              : David Aditya Winarto
 * KELAS             : PBO2
 * NIM               : 10118071
 * Deskripsi Program : Program ini berisi program untuk menampilkan
 *                     waktu yang sesuai saat ini pada lokasi kita berada  
 * 
 */
public class PBO210118071Latihan26Waktu {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Date date = new Date();
        SimpleDateFormat ft = new SimpleDateFormat ("EEEE, dd MMM yyyy HH:mm:ss");
        
        System.out.println("Hari ini adalah hari : "+ft.format(date));
    }
    
}
