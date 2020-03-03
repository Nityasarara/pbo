package raraa;
public class Main {
    public static void main(String[] args){
        BangunDatar a = new BangunDatar();
        a.luas(); a.kel(); a.volume();
        System.out.println("");
        
        BangunDatar b = new Persegi();
        b.luas(); b.kel();
        System.out.println("");
        
        BangunDatar c = new Lingkaran();
        c.luas(); c.kel();
        System.out.println("");
        
        BangunDatar d = new PersegiPanjang();
        d.luas(); d.kel();
        System.out.println("");
        
        BangunDatar e = new Segitiga();
        e.luas(); e.kel();
        System.out.println("");
        
        BangunDatar f = new Kubus();
        f.volume();
        System.out.println("");
        
        BangunDatar g = new Silinder();
        g.volume();
        System.out.println("");
        
        BangunDatar h = new Balok();
        h.volume();
    }
}