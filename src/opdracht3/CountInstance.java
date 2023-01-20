package opdracht3;


import opdracht2.crypter.Alphabet;

import java.util.ArrayList;
import java.util.List;


public class CountInstance {

   private String value;
    private int count;

    public CountInstance(String value) {
        this.value = value;
        this.count =0;
    }

    public static ArrayList<CountInstance> generateInstances(){
        ArrayList<CountInstance> instances=new ArrayList<>();

        List<String> alphabet= Alphabet.getLowerAlphabets();
        for (String value:alphabet) {
            instances.add(new CountInstance(value));

        }

        return instances;
    }

    public static void compareValues(String val,ArrayList<CountInstance> instances){
        for(CountInstance instance:instances){
            if(instance.value.equals(val)){
                instance.count++;
                return;

            }

        }

    }

    public String getValue() {
        return value;
    }

    @Override
    public String toString() {
        return value +" : "+ count;

    }
}
