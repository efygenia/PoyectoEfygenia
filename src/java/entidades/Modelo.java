
package entidades;


public class Modelo {
    
    String nombre; 
    int cantpersonas; 
    
    //toString

    @Override
    public String toString() {
        return "Modelo{" + "nombre=" + nombre + ", cantpersonas=" + cantpersonas + '}';
    }
    
    //constructor

    public Modelo(String nombre, int cantpersonas) {
        this.nombre = nombre;
        this.cantpersonas = cantpersonas;
    }
    
    public void alta (){
        
    }
            
    public void baja (){
        
    }
    public void modificar (){
        
    }
            
          
    
}
