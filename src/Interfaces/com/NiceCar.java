package Interfaces.com;

public class NiceCar {

    private Engine engine;
    private Media player = new CDPalyer();
    public NiceCar(){
        engine = new PowerEnigine();
    }

    public NiceCar(Engine engine){
        this.engine = engine;
    }

    public void start(){
        engine.start();
    }

    public void stop(){

        engine.stop();
    }

    public void startMusic(){

        player.start();
    }

    public void stopMusic(){

        player.stop();
    }

    public void upgradeEngine(){
        this.engine = new ElectricEngine();
    }



}
