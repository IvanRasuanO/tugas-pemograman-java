/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package tugasjava1_0043;

import java.util.Locale;
import java.text.NumberFormat;
import java.util.Scanner;

/**
 *
 * @author Aspire
 */
public class App6c {
    public static void main (String[]args){
        int upah,jamkerja,totalupah;
        String inputbaru="";
        String gantitotalupah = "";
        do{
        Scanner inputjamkerja= new Scanner(System.in);
         Scanner dialogbaru = new Scanner(System.in);
        
        System.out.println("Upah Karyawan Per jam : Rp. 2.500");
        System.out.print("Masukkan lama jam kerja = ");
        jamkerja=inputjamkerja.nextInt();
        
        upah=2500;
        totalupah =upah * jamkerja;
      
        gantitotalupah = NumberFormat.getNumberInstance(Locale.US).format(totalupah);
            gantitotalupah = gantitotalupah.replace(',', '.');
        
            System.out.println("Jam kerja : "+jamkerja+" jam");
        System.out.println("Rincian Jam kerja : "+jamkerja+" * "+upah);
        System.out.println("Total Upah Karyawan : Rp. "+gantitotalupah);
   
        System.out.print("Apakah Anda Ingin Input Baru ? y/t = ");
     
         inputbaru = dialogbaru.next();
        } 
         
        while(!inputbaru.equals("t"));
        System.out.println("Terimakasih!");
        
}
}    
