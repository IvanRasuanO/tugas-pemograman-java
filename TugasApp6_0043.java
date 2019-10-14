/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugasjava1_0043;

import java.util.Scanner;
import java.util.Locale;
import java.text.NumberFormat;

/**
 *
 * @author Aspire
 */
public class TugasApp6_0043 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        String ganti = "";

        // TODO code application logic here
        int qty, hrgprinter, total;
        String inputbaru = "";

        Scanner inputqty = new Scanner(System.in);
        Scanner dialogbaru = new Scanner(System.in);

        do {
            System.out.println("Printer EPSON T2 : Rp. 660.000");
            System.out.print("Masukkan jumlah Beli = ");
            qty = inputqty.nextInt();

            hrgprinter = 660000;
            total = qty * hrgprinter;

            ganti = NumberFormat.getNumberInstance(Locale.US).format(total);
            ganti = ganti.replace(',', '.');

            System.out.println("jumlah Beli = " + qty);
            System.out.println("Rincian Beli = " + qty + " * " + hrgprinter);
            System.out.println("Total Harga = Rp." + String.format(ganti));

            System.out.print("Apakah Anda Ingin Input Baru ? y/t = ");

            inputbaru = dialogbaru.next();

        } while (!inputbaru.equals("t"));

    }

}
