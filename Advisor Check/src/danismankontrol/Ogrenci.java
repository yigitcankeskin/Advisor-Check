
package danismankontrol;

import java.util.ArrayList;

public class Ogrenci {
    String Ad,Soyad,Numara;
    ArrayList <Ders> Program = new ArrayList();
    int KullanilanKredi;
    int KrediHakki;
    float genelOrt;
    
    public Ogrenci(String Ad,String Soyad,String Numara,ArrayList <Ders> Program){
        this.Ad=Ad;
        this.Soyad=Soyad;
        this.Numara=Numara;
        this.Program=Program;
        this.KullanilanKredi=getKullanilanKredi();
        this.genelOrt=getGenelOrt();
        if(this.genelOrt>=3.0 && this.genelOrt<=3.49){
            this.KrediHakki=33;
        }
        else if(this.genelOrt>=3.5 && this.genelOrt<=4){
            this.KrediHakki=36;
        }else{
            this.KrediHakki=30;
        }
    }
    public int getKullanilanKredi(){
        int toplam=0;
        for (Ders ders : this.Program) {
            toplam+=ders.kredi;
        }
        return toplam;
    }public float getGenelOrt(){
        float toplam=0;
        float genelOrt;
        for (Ders ders : this.Program) {
            toplam+=(float)ders.kredi *(float)ders.not;
        }toplam=(Float)toplam/(float)this.KullanilanKredi;
       
        
        return toplam;
    }
 
 
}


