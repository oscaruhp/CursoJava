/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cursojavavectores;

/**
 *
 * @author oscaruh
 */
public class CursoJavaVectores {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String[] Nombres={"Oscar","Marisa","Deymi","Gicelly","Josué"};
        
        System.out.println("Cantidad de nombres:"+Nombres.length);
        
        System.out.println("Nombre en la posición 0 es:"+Nombres[0]);
        
        for(int indice=0;indice<Nombres.length;indice++){
            System.out.println("Posición:"+indice+" Nombre:"+Nombres[indice]);
        
        }
        
        
        
        
    }
    
}
