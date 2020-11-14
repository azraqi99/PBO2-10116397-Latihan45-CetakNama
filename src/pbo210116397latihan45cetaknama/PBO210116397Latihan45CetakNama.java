/*
NAMA   : MUHAMMAD AZRAQI SAPUTRA
KELAS  : PBO2
NIM    : 10116397
Deskripsi Program : Cetak Nama
 */
package pbo210116397latihan45cetaknama;

import java.util.Scanner;

/**
 *
 * @author Zetro
 */
public class PBO210116397Latihan45CetakNama {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc1 = new Scanner (System.in);
        Scanner sc2 = new Scanner (System.in);
        Printer ptr = new Printer ();
        
        System.out.println("===== Aplikasi Pencetak Nama=====");    
        System.out.print("Masukkan nama anda : ");
        ptr.setNama(sc1.nextLine());
        
        System.out.print("Mau cetak nama berapa kali? : ");
        ptr.setJmlCetak(sc2.nextInt());
        
        System.out.println("Nama Anda : " + ptr.getNama());
        ptr.cetak(ptr.getJmlCetak(), ptr.getNama());
    }
    
}
