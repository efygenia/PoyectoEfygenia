
package entidades;


public class Decoracion {
    String Nombre;
    
    
//toString
  
    @Override
    public String toString() {
        return "Decoracion{" + "Nombre=" + Nombre + '}';
    }

//Constructor

    public Decoracion(String Nombre) {
        this.Nombre = Nombre;
    }

    
    
}
