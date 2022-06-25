package danismankontrol;

import java.util.ArrayList;

public class Ogretmen {
    ArrayList<Ogrenci> Ogrenciler = new ArrayList();
    String Ad;
    String Sifre;
    public Ogretmen(String Ad,String Sifre){
        this.Ad=Ad;
        this.Sifre=Sifre;
    }
    


    public void OgrenciEkle(Ogrenci o) {
        this.Ogrenciler.add(o);
    }
    
    public void DersSaatDegisir(Ogrenci o, Ders d, String YeniSaat, String YeniGun) {
        for (int i = 0; i < o.Program.size(); i++) {
            if (o.Program.get(i) == d) {
                o.Program.get(i).Saat = YeniSaat;
                o.Program.get(i).Gun = YeniGun;
            }
        }
    }
}