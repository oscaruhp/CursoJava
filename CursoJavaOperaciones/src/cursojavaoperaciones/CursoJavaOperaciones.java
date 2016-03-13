/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cursojavaoperaciones;

import java.util.Scanner;

/**
 *
 * @author oscaruh
 */
public class CursoJavaOperaciones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
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
       
    }
    
}
