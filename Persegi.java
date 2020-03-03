package raraa;
public class Persegi extends BangunDatar{
    private double sisi = (float) 2.2;
    
    public void luas (){
        System.out.println("Luas Persegi : " + this.sisi*this.sisi);
    }
    public void kel(){
        System.out.println("Keliling persegi : " + 4*sisi);
    }
}
