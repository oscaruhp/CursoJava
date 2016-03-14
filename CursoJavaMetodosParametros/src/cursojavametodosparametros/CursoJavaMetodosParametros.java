package cursojavametodosparametros;

public class CursoJavaMetodosParametros {

    public static void main(String[] args) {
        // TODO code application logic here
        
        Robot Objeto1= new Robot("Número 18");
        Objeto1.Altura=100f;
        Objeto1.Peso=10f;
        Objeto1.Hablar();
         
        Robot Objeto2= new Robot("Número 17");
        Objeto2.Altura=105f;
        Objeto2.Peso=10f;
        Objeto2.Hablar("Marisa Martinez");
        
    }
    
}
