package cursojavasobrecarga;


public class ClaseOperaciones {
    
    //Constructor
    public ClaseOperaciones(){
    
    }
    // Métodos sobrecargados
    public int CalculaSuma(int x, int y){
    return x+y;
    }
    public double  CalculaSuma(double x,double y){
        return x+y;
    }
    public String CalculaSuma(String x,String y){
       String Suma; 
       int z;
       z= Integer.parseInt(x)+Integer.parseInt(y);
       Suma= Integer.toString(z);
       return Suma; 
    }
    
}
