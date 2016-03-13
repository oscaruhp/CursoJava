package cursojava;

import java.util.Scanner;

public class CursoJava{
    public static void main(String[] args) {
        // TODO code application logic here
        /* Comentarios largos*/
        // Comentarios cortos
       /* System.out.println("Hola mundo");
        
        // Variables
        
        // entero
        int NumeroA;
        NumeroA=3;
        System.out.println("El Número es:"+NumeroA);
        
        // Double 
        double NumeroDecimal;
        NumeroDecimal=3.2;
        System.out.println("El número es:"+NumeroDecimal);
        
        // String ó cadena
        String Cadena;
        Cadena="Develoteca";
        System.out.println("El String que se escribio es:"+Cadena);
        
        // Booleano
        boolean Verdad;
        Verdad=true; // Tambien puede ser false o falso
        System.out.println("EL valor para boolean es: "+Verdad);
        
        // variables para hacer operaciones 
        int valora;
        int valorb;
        
        int resultadoSuma;
        int resultadoResta;
        int resultadoMultiplicacion;
        double resultadoDivision;
        double resultadoResiduo;
        
        // Leer datos del usuario
        Scanner entrada=new Scanner(System.in);
        
        // Pedimos los valores de los Números al usuario
         System.out.println("Escribe el valor a:");
         valora= Integer.parseInt(entrada.next());
         // valor b
         System.out.println("Escribe el valor b:");
         valorb= Integer.parseInt(entrada.next());
         
         // La suma operador ( + )
        resultadoSuma=valora+valorb;
        System.out.println("Valor de la suma es:"+resultadoSuma);
        
        // La resta operador (-)
        resultadoResta=valora-valorb;
        System.out.println("Valor de la resta es:"+resultadoResta);
        
        // La división operador (/)
        resultadoDivision=(valora/valorb);
        System.out.println("Valor de la división es:"+resultadoDivision);
        
        // La Multiplicación operador (*)
        resultadoMultiplicacion=(valora*valorb);
        System.out.println("Valor de la multiplicación es:"+resultadoMultiplicacion);
        
        // La residuo operador (%)
        resultadoResiduo=(valora%valorb);
        System.out.println("Valor del residuo es:"+resultadoResiduo);
        
        // La concatenación (+) pero con variables string
        String nombre;
        String Apellido;
        String NombreConcatenado; // Nombre Completo
        
        nombre="Marisa";
        Apellido="Martínez Gaspar";
        NombreConcatenado=nombre+" "+Apellido;
        System.err.println("El nombre es:"+NombreConcatenado);
       
        // condición y operadores 
        
        int a =1;
        int b= 2;
        
        if(a>b){System.err.println("(a) mayor que(b)"); }
        if(a<b){System.err.println("(a) menor que (b)");}   
        if(a==b){System.err.println("(a) igual a (b)");}
        if(a!=b){System.err.println("(a) diferente a (b)");}
        
       boolean c=true;
       boolean d=false;
       
       if(c&d){
           System.err.println("(c true) y (d true)"); 
       }
       
       if(c||d){
           System.err.println("(c true) ó (d true) al menos hay un true"); }
       
      // Mezcla de operadores
       if((a>b)||(c&d)){
           System.err.println("Se cumple la condición a>b y c=true y d= true"); 
       }else{
           System.err.println("No se cumple la condición a>b y c=true y d= true "); 
       }
       
      
        int NumeroImprimir;
        NumeroImprimir=5;
        // incremento en 1
        NumeroImprimir++;
        System.out.println("Valor del número :"+NumeroImprimir);
        // decremento en 1
        NumeroImprimir--;
        System.out.println("Valor del número :"+NumeroImprimir);
        // incremento en 1
        ++NumeroImprimir;
        System.out.println("Valor del número :"+NumeroImprimir);
        // decremento en 1
        --NumeroImprimir;
        System.out.println("Valor del número :"+NumeroImprimir);
      
        // incremento en n=5
        NumeroImprimir+=5;
        System.out.println("Valor del número :"+NumeroImprimir);
        // decremento en n=5
        NumeroImprimir-=5;
        System.out.println("Valor del número :"+NumeroImprimir);
        // multiplicación incremental   
        NumeroImprimir*=4;
        System.out.println("Valor del número :"+NumeroImprimir);   
               */
        // Estructura de control Switch 
        
        int diaSemana; 
        diaSemana=3;
        switch(diaSemana){
            case 1: System.out.println("Lunes");
                break;
            case 2: System.out.println("Martes");
                break;
            case 3: System.out.println("Miércoles");
                break;
            case 4: System.out.println("Jueves");
                break;
            case 5: System.out.println("Viernes");
                break;
            case 6: System.out.println("Sábado");
                break;
            case 7: System.out.println("Domingo");
                break;
            default:System.out.println("No existe ese día");
                break;
        }
        
    }
    
}
