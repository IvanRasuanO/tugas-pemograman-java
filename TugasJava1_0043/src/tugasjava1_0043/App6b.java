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
public class App6b {
     public static void main (String[]args){
    int qty,hrgprinter,total,intgrandtotal;
    double diskon,hargadiskon,grandtotal;
    String inputbaru="";
    String gantigrandtotal = "";
        
        Scanner inputqty = new Scanner(System.in);
        Scanner dialogbaru = new Scanner(System.in);
        
        do {
        System.out.println("Printer EPSON T2 : Rp. 660.000");
        System.out.print("Masukkan jumlah Beli = ");
        qty=inputqty.nextInt();
        
        hrgprinter=660000;
        total=qty*hrgprinter;
        if(total>1500000)
        {
            diskon=0.15;
            hargadiskon =total*diskon;
            grandtotal=total-hargadiskon;
            
            gantigrandtotal = NumberFormat.getNumberInstance(Locale.US).format(grandtotal);
            gantigrandtotal = gantigrandtotal.replace(',', '.');
            //System.out.println("jumlah Beli = "+qty);
        System.out.println("Rincian Beli = "+qty+" * "+ hrgprinter);
        System.out.println("Total Harga = "+total);
        System.out.println("Anda Mendapat Diskon = Rp."+hargadiskon);
        System.out.println("Grand Total = Rp."+String.format(gantigrandtotal));
        }else{
             diskon=0;
            hargadiskon =total*diskon;
            grandtotal=total-hargadiskon;
            gantigrandtotal = NumberFormat.getNumberInstance(Locale.US).format(grandtotal);
            gantigrandtotal = gantigrandtotal.replace(',', '.');
            //System.out.println("jumlah Beli = "+qty);
        System.out.println("Rincian Beli = "+qty+" * "+ hrgprinter);
        System.out.println("Total Harga = "+total);
        System.out.println("Anda Mendapat Diskon = Rp."+hargadiskon);
        System.out.println("Grand Total = Rp."+String.format(gantigrandtotal));
        }
        
        
        System.out.print("Apakah Anda Ingin Input Baru ? y/t = ");
     
         inputbaru = dialogbaru.next();
         
         }
        while(!inputbaru.equals("t"));
        System.out.println("Terimakasih!");
}
}
