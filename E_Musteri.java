package j19_StaticKeyword.Task02_Electric.Hesap_Elektrik;

import java.util.Scanner;

public class E_Musteri {


    Scanner scan = new Scanner(System.in);

    // fields
    String isim;
    String soyisim;
    Hesap hesap ;


    public E_Musteri(Hesap name, String isim, String soyisim) {
        this.hesap = name;
        this.isim = isim;
        this.soyisim = soyisim;
    }

    @Override
    public String toString() {
        return "E_Musteri{" +
                "isim='" + isim + '\'' +
                ", soyisim='" + soyisim + '\'' +
                ", hesap=" + hesap +
                '}';
    }
}
