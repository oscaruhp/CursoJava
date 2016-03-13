/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cursojavaoperadores;

/**
 *
 * @author oscaruh
 */
public class CursoJavaOperadores {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
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
    }
    
}
