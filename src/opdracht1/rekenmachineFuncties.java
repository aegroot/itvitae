package opdracht1;

public class rekenmachineFuncties {

    public rekenmachineFuncties(){
        nr1=nr2=operand="";
        cache=null;}

    private String outputValue="";


    private String nr1,nr2,operand;

    private Double cache;





    public double calculate(){
        double result=0.0;
        double e1=Double.parseDouble(nr1);
        double e2=Double.parseDouble(nr2);



        switch(operand){
            case "*": result= (e1*e2); break;
            case "/": result= (e1/e2); break;
            case "+":result= (e1+e2); break;
            case "-":result=(e1-e2); break;
        }
        cache=result;

        Reset();

        return  result;
    }

    public void addSymbol(String c){
        if (!(nr1.equals("")||nr2.equals("")||operand.equals(""))){

            calculate();
        }
        else {

            operand=c;
        }


        //outputValue=new String(outputValue+c);


    }


    public void addNumber(String i){


       if(!operand.equals("")){nr2=nr2+i;}
       else {nr1=nr1+i;}

    }
    public  String getOutputValue(){
        if(cache!=null){return  cache.toString();}

        return nr1+operand+nr2;}


    public void Reset(){

        nr1=nr2=operand=""; cache=null;}

}

