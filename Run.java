package j19_StaticKeyword.Task02_Electric.Hesap_Elektrik;

public class Run {
    public static void main(String[] args) {
          /*
   Task 02 ->
   ElektirikHesap Class:  fields : toplamTuketim(int), oran(double), fatura(double)
   Müşteriye ait tüketilen enerjiyi toplamTuketim'e toplayan tüketimEkle method
   oran(0.7)  katsaysı ile  toplamTuketim çarparak fatura değeri atayan odenecekTutar method
   Müsteri Class: fields: name ElektrikHesabi class obj.
   Runner Class obj ile enz 2  aylık elektrik tüketim faturası print eden code create ediniz

    */
        Hesap hesap01= new Hesap(0,0.7,0);
        E_Musteri mus01 = new E_Musteri(hesap01, "MERVE", "KOSAR");

        Hesap hesap02= new Hesap(0,0.7,0);
        E_Musteri mus02 = new E_Musteri(hesap02, "HALİT", "KOSAR");

        mus01.hesap.tuketimEkle(100);
        mus01.hesap.odenecekTutar();
        System.out.println(mus01.hesap);
        System.out.println(mus01);
        System.out.println();
        mus01.hesap.tuketimEkle(220);
        mus01.hesap.odenecekTutar();
        System.out.println(mus01.hesap);
        System.out.println(mus01);

        System.out.println();
        mus02.hesap.tuketimEkle(23);
        mus02.hesap.odenecekTutar();
        System.out.println(mus02.hesap);
        System.out.println(mus02);
        System.out.println();
        mus02.hesap.tuketimEkle(90);
        mus02.hesap.odenecekTutar();
        System.out.println(mus02.hesap);
        System.out.println(mus02);


    }
}
