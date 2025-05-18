package hashmapPc;

import javax.swing.text.html.parser.Entity;
import java.util.HashMap;
import java.util.HashSet;

public class Main {


    public static void main(String[] args){

        HashMap<String, Integer> map = new HashMap<>();

        map.put("kaif",1);
        map.put("altaf",2);
        map.put("aakash",89);

      //  System.out.println(map.get("altaf"));

        //System.out.println(map.getOrDefault("naved",5));

//        System.out.println(map.containsKey("aakash"));
//
//        HashSet<Integer> set = new HashSet<>();
//        set.add(56);
//        set.add(78);
//        set.add(56);
//        set.add(7);

        //System.out.println(set);

        //MapsUsingHash mp = new MapsUsingHash();

        HashMap<String,String> mp = new HashMap<>();


        mp.put("huehue","dogesh");
        mp.put("apple","red fruit");
        mp.put("cat","meowPaglu");

        System.out.println(mp);

    }
}


class MapsUsingHash{

    private Entity[] entities;

    public MapsUsingHash(){
        entities = new Entity[100];
    }

    public void put(String key, String value){

        int hash = Math.abs(key.hashCode() % entities.length);

        entities[hash] = new Entity(key,value); // overriding

    }

    public String get(String key){
        int hash = Math.abs(key.hashCode() % entities.length);

        if (entities[hash] != null && entities[hash].key.equals(key)){
            return entities[hash].value;
        }
        return null;


    }

    public void remove(String key){
        int hash = Math.abs(key.hashCode() % entities.length);

        if (entities[hash] != null && entities[hash].key.equals(key)){
            entities[hash] = null;
        }



    }




    private class Entity{
        String key;
        String value;

        public  Entity(String key, String value){
            this.key = key;
            this.value = value;

        }
    }



}
