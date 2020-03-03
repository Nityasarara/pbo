package raraa;
public class Segitiga extends BangunDatar{
    private double a = (float)4.1;
    private double t = (float) 2.3;
    private double m = (float) 2.7;
    
    public void luas(){
        System.out.println("Luas segitiga : " + (a*t)/2);
    }
    
    public void kel(){
        System.out.println("Keliling segitiga : " + (a+t+m) );
    }
}
