package cursojavaclases;
public class Triangulo {
    // Atributos ó características 
    public double Base;
    public double Altura;
    public double Area;
    
    // Métodos ó acciones 
    public double CalcularArea(){
    this.Area= (this.Base*this.Altura)/2;
    return this.Area;
    }
}
