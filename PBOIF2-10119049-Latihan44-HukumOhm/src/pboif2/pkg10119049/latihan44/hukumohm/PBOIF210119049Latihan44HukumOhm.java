package pboif2.pkg10119049.latihan44.hukumohm;
/**
 * @author
 * Nama  : Nur Sasongko
 * Kelas : PBOIF2
 * NIM   : 10119049
 * Deskripsi Program : Program menghitung hasil tegangan
*/
import java.util.Scanner;
import Listrik.Baterai;

public class PBOIF210119049Latihan44HukumOhm {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Baterai baterai = new Baterai();
        baterai.Baterai();
        baterai.Baterai(3,12);
        
        System.out.printf("Kuat Arus : %.1f ampere\n",baterai.getKuatArus());
        System.out.printf("Hambatan : %.1f ohm \n",baterai.getHambatan());
        System.out.printf("Hasil Tegangan : %.1f volt\n",baterai.hitungTegangan());
    }
    
}
