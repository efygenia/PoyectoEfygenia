package entidades;


public class Tortas {
    
    Modelo modelo;
    double precio; 
    Relleno relleno;
    String decoracion;

    public Tortas(Modelo modelo, double precio, Relleno relleno, String decoracion) {
        this.modelo = modelo;
        this.precio = precio;
        this.relleno = relleno;
        this.decoracion = decoracion;
    }
    
       

   
    @Override
    public String toString() {
        return "Tortas{" + "modelo=" + modelo + ", precio=" + precio + ", relleno=" + relleno + '}';
    }

    
    public Modelo getModelo() {
        return modelo;
    }

    public void setModelo(Modelo modelo) {
        this.modelo = modelo;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public Relleno getRelleno() {
        return relleno;
    }

    public void setRelleno(Relleno relleno) {
        this.relleno = relleno;
    }
    
    public String comprar () {
        return null;
        
    }
  
    
}
