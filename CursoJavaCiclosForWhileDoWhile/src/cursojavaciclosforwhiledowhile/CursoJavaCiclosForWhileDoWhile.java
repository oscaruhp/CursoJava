/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cursojavaciclosforwhiledowhile;

/**
 *
 * @author oscaruh
 */
public class CursoJavaCiclosForWhileDoWhile {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        // ciclo for Mostrar Números 1,2,3,4,
        for(int numero=1;numero<=10;numero++){
           System.out.println("El número es:"+numero);
        }
        
        // Ciclo while
        int numerowhile=1;
        while(numerowhile<=10){
                   System.out.println("El número es:"+numerowhile);
                   numerowhile++;
        }
        // ciclo do-while
        int numerodowhile=1;
        do{
          System.out.println("El número es:"+numerodowhile);
          numerodowhile++;
        }while(numerodowhile<=10);
        
        
    }
    
}
