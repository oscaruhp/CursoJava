
package cursojavaclases;

public class CursoJavaClases {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        // Instancia (Creación de un Objeto)
        Triangulo ObjetoTriangulo1= new Triangulo();
        ObjetoTriangulo1.Altura=10;
        ObjetoTriangulo1.Base=11;
        
        System.out.println("El área:"+ObjetoTriangulo1.CalcularArea());
        // Otro Objeto
        Triangulo objetoTriangulo2= new Triangulo();
        objetoTriangulo2.Altura=2;
        objetoTriangulo2.Base=3;
        System.out.println("El área:"+objetoTriangulo2.CalcularArea());
        
        
     
        
        
    }
    
}
