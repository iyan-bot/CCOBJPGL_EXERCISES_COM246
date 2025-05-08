public class App {
    public static void main(String[] args){
       
        HDMI oldAdaptor = new HDMI();

        VGA connector = new VGAtoHDMI(oldAdaptor);
 
        Monitor monitor = new Monitor();
        monitor.connect(connector);
           
    }
}