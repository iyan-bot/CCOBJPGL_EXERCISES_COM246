public class App {
    public static void main(String[] args) throws Exception {
        HybridSedan hSedan = new HybridSedan("Hybrid BMW Sedan");

        System.out.println("\nUpdate about your " + hSedan.getHsedan());
        hSedan.chargebattery();
        hSedan.fillgas();

        HybridPickup HPickup = new HybridPickup("Supa Dupa Hybrip Pickup");

        System.out.println("\nUpdate about your " + HPickup.getHpickup());
        HPickup.chargebattery();
        HPickup.fillgas();
    
        Carwash Cwash = new Carwash("Cleaning your ");
        System.out.println(Cwash.getCarwashing() + HPickup.getHpickup() + " ------- Please wait a moment.");
        System.out.println(Cwash.getCarwashing() + hSedan.getHsedan() + " ------- Please wait a moment. ");    
    }    

}
