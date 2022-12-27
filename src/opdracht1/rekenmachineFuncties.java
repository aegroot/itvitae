package opdracht1;

public class rekenmachineFuncties {

    public rekenmachineFuncties(){}

    private String outputValue="";
    private float currentValue;

    private  float inputValue;




    public float calculate(){return  0f;}

    public void addSymbol(String c){outputValue=new String(outputValue+c);}

    public void addNumber(int i){
       outputValue=new String(outputValue+i);
    }
    public  String getOutputValue(){return  outputValue;}
    public void Reset(){outputValue=""; currentValue=0;}

}
/*
plan: twee soorte

 */
