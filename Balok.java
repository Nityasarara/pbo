package raraa;
public class Balok extends PersegiPanjang {
    private double p = (float) 9.5;
    private double l = (float) 4.5;
    private double t = (float) 12.3;
    
    public void volume (){
        System.out.println("Volume Balok : " + p*l*t);
    }
}
