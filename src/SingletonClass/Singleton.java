package SingletonClass;

public class Singleton {

    private  Singleton() {

    }

    private static Singleton instance;

    public static Singleton getIntstance(){
        // check if is instance object is created or not
        if(instance == null){
            instance = new Singleton();
        }
        return instance;
    }


}
