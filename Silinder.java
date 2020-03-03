package raraa;
public class Silinder extends Lingkaran {
    private double jari = (float) 7.5;
    private double tinggi = (float) 10.5; 
    
    public void volume (){
        System.out.println("Volume Silinder : " + pi*jari*jari*tinggi);
    }
}
