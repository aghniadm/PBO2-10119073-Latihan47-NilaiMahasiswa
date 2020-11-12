package pbo2.pkg10119073.latihan47.nilaimahasiswa;

/**
 *
 * @author 
 * NAMA     : Aghnia Dewi Mahiranie
 * KELAS    : PBO2
 * NIM      : 10119073
 * Deskripsi Program : Program ini berisi program untuk menentukan index mahasiswa
 *
 */

public class PBO210119073Latihan47NilaiMahasiswa {

    public static void main(String[] args) {
        Nilai nilai = new Nilai(75,45,34);
        
        System.out.println("QUIZ\t\t= "+nilai.getQuiz());
        System.out.println("UTS\t\t= "+nilai.getUts());
        System.out.println("UAS\t\t= "+nilai.getUas());
        System.out.println("\nNilai Akhir\t= "+nilai.hitungNA());
        System.out.println("\nIndex = " +nilai.tampilIndex(nilai.hitungNA()));
        System.out.println("Keterangan = "+nilai.tampilKeterangan(nilai.tampilIndex(nilai.hitungNA())) );
        
    }
    
}
