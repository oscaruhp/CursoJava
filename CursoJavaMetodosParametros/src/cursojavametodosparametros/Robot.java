package cursojavametodosparametros;

public class Robot {
    public String Nombre;
    public double Altura;
    public double Peso;
    
    public void Hablar(){
        System.out.println("Mi nombre es:"+this.Nombre);
    
    }
    public void Hablar(String TuNombre){
        System.out.println("Tú nombre es"+TuNombre);
        this.Hablar();
    }
}
