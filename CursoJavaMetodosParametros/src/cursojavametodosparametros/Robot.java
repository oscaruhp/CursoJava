package cursojavametodosparametros;

public class Robot {
    public String Nombre;
    public double Altura;
    public double Peso;
    
    // Constructor
    public Robot(String Nombre){
        this.Nombre=Nombre;
        System.out.println("Hola soy un robot");
    }
    
    public void Hablar(){
        System.out.println("Mi nombre es:"+this.Nombre);
    
    }
    public void Hablar(String TuNombre){
        System.out.println("Tú nombre es"+TuNombre);
        this.Hablar();
    }
}
