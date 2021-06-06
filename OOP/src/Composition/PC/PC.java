package Composition.PC;

public class PC {
    private Case theCase;  //Ez is Composition, a PC-nek van háza, monitorja, alaplapja
    private Monitor monitor;
    private Motherboard motherboard;

    public PC(Case theCase, Monitor monitor, Motherboard motherboard) {
        this.theCase = theCase;
        this.monitor = monitor;
        this.motherboard = motherboard;
    }

    public void powerUp(){
        theCase.PressPowerButton();
        drawLogo();
    }

    private void drawLogo(){
        //fancy graphics
        monitor.drawPixelAt(1200, 50, "yellow");
    }



    /*private Case getTheCase() {
        return theCase;
    }

    private Monitor getMonitor() {
        return monitor;
    }

    private Motherboard getMotherboard() {
        return motherboard;
    }*/
}
