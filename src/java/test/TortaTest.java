
package test;

import entidades.Modelo;
import entidades.Relleno;
import entidades.Tortas;


public class TortaTest {
    public static void main(String[] args) {
        System.out.println("[....]");
        
        //crear rellenos
        
        Relleno miRelleno1=new Relleno("Fruta");
        Relleno miRelleno2=new Relleno("Galleta");
        Relleno miRelleno3=new Relleno("Crema");
        
        System.out.println(miRelleno1);
        System.out.println(miRelleno2);
        System.out.println(miRelleno3);
        
        //crear modelos 
        
        Modelo miModelo1=new Modelo("cuatro pisos", 100);
        Modelo miModelo2=new Modelo("convencional", 20);
        
        System.out.println(miModelo1);
        System.out.println(miModelo2);
        
        Tortas miTorta=new Tortas (miModelo1, 1500, miRelleno3,  "Barroco");
        
        
        System.out.println(miTorta);
                
        System.out.println("[Ok]");
    }
    
}
