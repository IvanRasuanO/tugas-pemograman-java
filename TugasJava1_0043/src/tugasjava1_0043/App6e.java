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
public class App6e {
    public static void main (String[]args){
        byte tujuan;
        int ongkos;
        String inputbaru="";
        String gantiongkos = "";
                
        Scanner inputtujuan = new Scanner(System.in);
        Scanner dialogbaru = new Scanner(System.in);
        
        do{
        System.out.println("-----------------------------------");
        System.out.println("-          Perusahaan             -");
        System.out.println("-    Ekspedisi Lorena Malang      -");
        System.out.println("-----------------------------------");
        System.out.println("            List Tujuan            ");
        System.out.println("-----------------------------------");
        System.out.println("1. Surabaya (Jarak 169 km) ongkos kirim per km Rp 2500");
        System.out.println("2. Bandung (Jarak 452 km) ongkos kirim per km Rp 4000");
        System.out.println("-----------------------------------");
        
        System.out.print("Pilih tujuan = ");
        tujuan = inputtujuan.nextByte();
        
        switch(tujuan){
            case 1:
                ongkos = 169*2500;
                gantiongkos = NumberFormat.getNumberInstance(Locale.US).format(ongkos);
            gantiongkos = gantiongkos.replace(',', '.');
                System.out.println("Anda Memilih Surabaya");
                System.out.println("Biaya Pengiriman : 169 x 2500= Rp."+gantiongkos);
                break;
            case 2:
                ongkos = 452*4000;
                gantiongkos = NumberFormat.getNumberInstance(Locale.US).format(ongkos);
            gantiongkos = gantiongkos.replace(',', '.');
                System.out.println("Anda Memilih Bandung");
                System.out.println("Biaya Pengiriman : 452 x 4000= Rp."+gantiongkos);
                break;
            default:
                System.out.println("Pilihan Anda Tidak ada Lur !");
                break;
            
        }
        System.out.print("Apakah Anda Ingin Input Baru ? y/t = ");
        
        inputbaru = dialogbaru.next();
        }while(!inputbaru.equals("t"));

        System.out.println("Terimakasih!");
        
        
    }
}
