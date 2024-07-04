import java.util.Scanner;
import java.text.DecimalFormat;

public class SINIF {
    public static void main(String[] args) {
        double fizik,kimya,turkce,tarih,muzik;
        double ortalama;
        Scanner sonuc = new Scanner(System.in);
        System.out.println("Fizik notunuzu Giriniz (ORNK: 67,0) : ");
        fizik = sonuc.nextDouble();
        System.out.println("Kimya notunuzu Giriniz (ORNK: 67,0) : ");
        kimya = sonuc.nextDouble();
        System.out.println("Turkce notunuzu Giriniz (ORNK: 67,0) : ");
        turkce = sonuc.nextDouble();
        System.out.println("Tarih notunuzu Giriniz (ORNK: 67,0)  : ");
        tarih = sonuc.nextDouble();
        System.out.println("Muzik notunuzu Giriniz (ORNK: 67,0) : ");
        muzik = sonuc.nextDouble();

        ortalama = (fizik+kimya+turkce+tarih+muzik) / 5;

        DecimalFormat df = new DecimalFormat("#.#");
        System.out.print("Ortalama Notunuz : ");
        System.out.println(df.format((fizik+kimya+turkce+tarih+muzik) / 5 ) ) ;
        if (ortalama >= 60) {
            System.out.println("Sınıfı Geçti");
        }
        else {
            System.out.println("Sınıfta Kaldı");
        }

    }


}
