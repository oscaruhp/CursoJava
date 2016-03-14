/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cursojavasobrecarga;

/**
 *
 * @author oscaruh
 */
public class CursoJavaSobrecarga {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        ClaseOperaciones oClaseOperaciones= new ClaseOperaciones();
        
        System.out.println("Método SobreCarga Srting:"+oClaseOperaciones.CalculaSuma("3","4")); // Formato String
        System.out.println("Método SobreCarga Double:"+oClaseOperaciones.CalculaSuma(3, 4)); // Double
        System.out.println("Método SobreCarga int:"+oClaseOperaciones.CalculaSuma(5, 7));// Entero
        
        
        
        
        
    }
    
}
