
package danismankontrol;

public class Ders {
    String Ad;
    String Gun;
    String Saat;
    int kredi;
    float not; 
    
    public Ders(String Ad,String gun, String Saat,int kredi){
        this.Ad=Ad;
        this.Gun=gun;
        this.Saat=Saat;
        this.kredi=kredi;
        this.not=not=(float)2.0;
    }
}
