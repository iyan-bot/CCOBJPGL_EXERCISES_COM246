import java.util.Random;

public class Hybrid implements Electric, InternalCombustion {

    protected String Cartype;
    Random ran = new Random();

    public void chargebattery(){
        System.out.println("Charging battery ...." + ran.nextInt(1,100) + "%");
    }

    public void fillgas(){
        System.out.println("FIlling up Gas ...." + ran.nextInt(1,100) + "%\n");
     
    }
    
}
