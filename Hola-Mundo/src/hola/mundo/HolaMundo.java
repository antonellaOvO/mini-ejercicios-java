/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package hola.mundo;

/**
 *
 * @author anto_
 */
public class HolaMundo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Hola Mundo");
        Usuario usuario1 = new Usuario("Antonella");
        usuario1.saludar("Antonella");
        usuario1.preguntar("Antonella");
        usuario1.repetirSaludo(3, "Ella");
    }
    
}
