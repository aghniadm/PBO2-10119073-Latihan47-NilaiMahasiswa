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

public class Nilai {
    private final double quiz, uts, uas;
    private double NA;
    
    public Nilai(double quiz, double uts, double uas) {
        this.quiz = quiz;
        this.uts = uts;
        this.uas = uas;
    }
        
    public double getQuiz() {
        return quiz;
    }

    public double getUts() {
        return uts;
    }
    
    public double getUas() {
        return uas;
    }

    public double hitungNA(){
        NA = (0.2 * quiz) + (0.3 * uts) + (0.5 * uas);
        return NA;
    }
    
    public char tampilIndex(double NA){
        if((NA >= 80)&&(NA <= 100))
            return 'A';
        else if((NA >=68)&&(NA < 80))
            return 'B';
        else if((NA >=56)&&(NA < 68))
            return 'C';
        else if((NA >=45)&&(NA < 56))
            return 'D' ;        
        else return 'E';
    }
    
    public String tampilKeterangan(char index){
        return switch (index) {
            case 'A' -> "Sangat Baik";
            case 'B' -> "Baik";
            case 'C' -> "Cukup";
            case 'D' -> "Kurang";
            default -> "Sangat Kurang";
        };
    }
}
