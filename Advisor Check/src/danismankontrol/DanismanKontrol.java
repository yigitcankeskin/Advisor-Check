
package danismankontrol;

import java.util.ArrayList;

public class DanismanKontrol { //Test class
    //Test icin yazilmistir


    
    public DanismanKontrol() {
        Ogretmen o= new Ogretmen("Admin", "Admin");
        OgretmenEkle(o);
        Ogretmen o2 = new Ogretmen("Ahmet", "1234");
        OgretmenEkle(o2);
        Dersler.add(DersEkle("Bilgisayar Muhendisligine Giris", "Pazartesi", "09 : 30", 5));
        Dersler.add(DersEkle("Bilgisayar Programlama I", "Sali", "10 : 00", 8));
        Dersler.add(DersEkle("Fizik I", "Carsamba", "09 : 00", 6));
        Dersler.add(DersEkle("Matematik I", "Persembe", "13 : 30", 6));
        Dersler.add(DersEkle("Turk Dili I", "Cuma", "14 : 30", 2));
        Dersler.add(DersEkle("Yabanci Dil I(ing)", "Cuma", "09 : 30", 3));
        Dersler.add(DersEkle("Bilgisayar Programlama II", "Cuma", "09 : 30", 3));
        Dersler.add(DersEkle("Fizik II", "Cuma", "09 : 30", 3));
        Dersler.add(DersEkle("Lineer Cebir", "Cuma", "09 : 30", 3));
        Dersler.add(DersEkle("Matematik II", "Cuma", "09 : 30", 3));
        Dersler.add(DersEkle("Turk Dili II", "Cuma", "09 : 30", 3));
        Dersler.add(DersEkle("Yabanci Dil II(ing)", "Cuma", "09 : 30", 3));
        OrnekOgrenciEkle(o);
    }
    public ArrayList<Ogretmen> Ogretmenler = new ArrayList();
    public ArrayList<Ders> Dersler = new ArrayList();

    /**
     * @param args the command line arguments
     */
    public void OgretmenEkle(Ogretmen o) {
        Ogretmenler.add(o);
    }
    public void OrnekOgrenciEkle(Ogretmen o) {
        ArrayList<Ders>OgrDersler = new ArrayList();
         OgrDersler.add(DersEkle("Bilgisayar Muhendisligine Giris", "Pazartesi", "09 : 30", 5));
        OgrDersler.add(DersEkle("Bilgisayar Programlama I", "Sali", "10 : 00", 8));
        OgrDersler.add(DersEkle("Fizik I", "Carsamba", "09 : 00", 6));
        OgrDersler.add(DersEkle("Matematik I", "Persembe", "13 : 30", 6));
        OgrDersler.add(DersEkle("Turk Dili I", "Cuma", "14 : 30", 2));
        OgrDersler.add(DersEkle("Yabanci Dil I(ing)", "Cuma", "09 : 30", 3));
        o.Ogrenciler.add(new Ogrenci("Ali", "Veli", "12312324", OgrDersler));
        o.Ogrenciler.add(new Ogrenci("Osman", "Demir", "12312324", OgrDersler));
        o.Ogrenciler.add(new Ogrenci("Ayse", "Bakir", "12312324", OgrDersler));
    }

    public Ders DersEkle(String Ad, String gun, String Saat, int kredi) {
        Ders ders = new Ders(Ad, gun, Saat, kredi);
        return ders;
    }
}
