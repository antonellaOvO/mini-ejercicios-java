/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package variables.y.tipos.de.datos;

/**
 *
 * @author anto_
 */
public class VariablesYTiposDeDatos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        TiposDeDatos nuevaInstancia = new TiposDeDatos("Antonella", 30, 100000.7, 200000);
        System.out.println(nuevaInstancia.getNombre());
        System.out.println(nuevaInstancia.getEdad());
        System.out.println(nuevaInstancia.getSalario());
        System.out.println(nuevaInstancia.getSalario2());
        nuevaInstancia.convertDoubleToInt(3.5);
        System.out.println(nuevaInstancia.getSalarioInteger());
        nuevaInstancia.calcAreaRectangulo(3, 4);
        nuevaInstancia.convertFahrenheitToCelsius(40);
        nuevaInstancia.convertCelsiusToFahrenheit(40);
        
        
        
    }
    
}
