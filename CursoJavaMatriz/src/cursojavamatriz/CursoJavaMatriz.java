/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cursojavamatriz;

/**
 *
 * @author oscaruh
 */
public class CursoJavaMatriz {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
          
        String[][] Nombres=new String[3][3];
        
        // Columna 1 con las 3 filas
        Nombres[0][0]="Valor 1";
        Nombres[0][1]="Valor 2";
        Nombres[0][2]="Valor 3";
        
        // Columna 2 con las 3 filas
        Nombres[1][0]="Valor 4";
        Nombres[1][1]="Valor 5";
        Nombres[1][2]="Valor 6";
        
        // Columna 3 con las 3 filas
        Nombres[2][0]="Valor 7";
        Nombres[2][1]="Valor 8";
        Nombres[2][2]="Valor 9";
        
        System.out.println("Valor 3 :"+Nombres[0][2]);
        
        // Imprimir una fila (0)
        for(int i=0;i<Nombres.length;i++){
        System.out.println("Valor "+i+" :"+Nombres[0][i]);
        }
        
        // Imprimir todos los datos 2 ciclos
        for(int i=0;i<Nombres.length;i++){
            for(int j=0;j<Nombres.length;j++){
      System.out.println("Valor i="+i+" j="+j+" :"+Nombres[i][j]);
            }
        
        }
        
        
        
        
    }
    
}
