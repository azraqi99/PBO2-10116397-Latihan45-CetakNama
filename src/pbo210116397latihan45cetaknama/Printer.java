/*
NAMA   : MUHAMMAD AZRAQI SAPUTRA
KELAS  : PBO2
NIM    : 10116397
Deskripsi Program : Cetak Nama
 */
package pbo210116397latihan45cetaknama;

/**
 *
 * @author Zetro
 */
public class Printer {
    
    private int jmlCetak;
    private String nama;

    public int getJmlCetak() {
        return jmlCetak;
    }

    public void setJmlCetak(int jmlCetak) {
        this.jmlCetak = jmlCetak;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }
    
    public void cetak(String nama){
        System.out.println("Nama");
    }
    
    public void cetak(int jmlCetak, String nama){
        System.out.println("Hasil cetak : ");
        
        for (int i = 1; i <= jmlCetak; i++) {
            System.out.println(i+". "+nama);
        }
    }
}

