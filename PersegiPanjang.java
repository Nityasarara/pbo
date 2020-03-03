package raraa;
public class PersegiPanjang extends BangunDatar{
    private double p = (float)4.5;
    private double l = (float)1.0;
    
    public void luas(){
        System.out.println("Luas persegi panjang : " + p*l);
    }
    
    public void kel(){
        System.out.println("Keliling persegi panjang : " + ((2*p)+(2*l)));
    }
}
