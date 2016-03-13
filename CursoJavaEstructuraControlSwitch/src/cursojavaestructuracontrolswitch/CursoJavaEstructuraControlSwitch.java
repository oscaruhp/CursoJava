/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cursojavaestructuracontrolswitch;

/**
 *
 * @author oscaruh
 */
public class CursoJavaEstructuraControlSwitch {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
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
