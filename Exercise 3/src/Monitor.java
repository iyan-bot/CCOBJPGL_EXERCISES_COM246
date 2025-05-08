public class Monitor {
   
    public void connect (VGA connecting) {
        System.out.println("\n______________________________________");
        System.out.println("||||Monitor wants VGA brodiee....||||");
        System.out.println("--------------------------------------\n");

        connecting.workWithVGA();
        System.err.println("\nxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
        System.out.println("xx VGA Connected Suxxcezzfulley!! xx  ");
        System.out.println("-----------------------------------\n");

    }
}