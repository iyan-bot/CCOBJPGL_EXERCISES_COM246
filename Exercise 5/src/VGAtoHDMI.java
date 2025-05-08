class VGAtoHDMI implements VGA {
    private HDMI hdmi ;
 
    public VGAtoHDMI(HDMI connector) {
        this.hdmi = connector;
    }
   
    @Override
    public void workWithVGA() {
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("~~ VGA converting to HDMI.... ~~");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n");
        hdmi.workWithHDMI();
    }
}