package raraa;
public class Lingkaran extends BangunDatar{
    private double jari = (float) 1.2;
    public double pi = (float) 3.14;
    public void luas(){
        System.out.println("Luas lingkaran : " + pi*jari*jari);
    }
    
    public void kel(){
        System.out.println("Keliling lingkaran : " + pi*2*jari);
    }
}
