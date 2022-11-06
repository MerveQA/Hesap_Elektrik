package j19_StaticKeyword.Task02_Electric.Hesap_Elektrik;

public class Hesap {

    // fields
    int toplamTuketim;
    double oran =0.7;
    double fatura;

    // p.siz constractur
    public Hesap() {
    }

    // p.li constractur
    public Hesap(int topalmTuketim, double oran, double fatura) {
        this.toplamTuketim = topalmTuketim;
        this.oran = oran;
        this.fatura = fatura;
    }

    public int tuketimEkle(int ekTuketim) {
        // Müşteriye ait tüketilen enerjiyi
        // toplamTuketim'e toplayan tüketimEkle method

        return toplamTuketim+=ekTuketim;
    }

    public double odenecekTutar() {
        // oran(0.7)  katsaysı ile toplamTuketim
        // çarparak fatura değeri atayan odenecekTutar method
        fatura=toplamTuketim*oran;
        return fatura;
    }


    // yazdirma methodu
    @Override
    public String toString() {
        return "ElektrikHesap{" +
                "topalmTuketim=" + toplamTuketim +
                ", oran=" + oran +
                ", fatura=" + fatura +
                '}';
    }
}
