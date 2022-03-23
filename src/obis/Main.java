package obis;

public class Main extends Mesaj{

    public static void main(String[] args) {
        anamenu(baslangic());
    }

    public static String baslangic() {
        Ogrenci ogrenci = new Ogrenci();
        Giris giris = new Giris(ogrenci.girisBilgiAl()); //doğru giriş bilgileri gönderildi.
        System.out.println(mainAcilis());
        do {
            giris.girisYap();
            if (giris.cevrimici) {
                ogrenci.ogrenciBilgi(giris.logKullanici);
                ogrenci.kullanici = ogrenci.ogrenciGiris[0];
                ogrenci.sifre = ogrenci.ogrenciGiris[1];
                ogrenci.isim = ogrenci.ogrenciGiris[2];
                ogrenci.soyisim = ogrenci.ogrenciGiris[3];
                ogrenci.bolum = ogrenci.ogrenciGiris[4];
                ogrenci.ogrenciMail = ogrenci.ogrenciGiris[5];
                System.out.println(mainCevrimici(ogrenci.isim));
            }
        } while (!giris.cevrimici);
        return ogrenci.kullanici;
    }

    public static void anamenu(String kullanici){
        Menuler menu = new Menuler();
    }
}






