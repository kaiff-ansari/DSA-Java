package Interfaces.com;

public class CDPalyer implements Media{

    @Override
    public void start() {
        System.out.println("music start");
    }

    @Override
    public void stop() {
        System.out.println("stop music");

    }


}
